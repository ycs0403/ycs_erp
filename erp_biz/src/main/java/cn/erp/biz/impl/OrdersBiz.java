package cn.erp.biz.impl;


import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.erp.biz.IOrdersBiz;
import cn.erp.bizcommon.impl.BaseBiz;
import cn.erp.common_util.ErpException;
import cn.erp.dao.IEmpDao;
import cn.erp.dao.IOrdersDao;
import cn.erp.dao.ISupplierDao;
import cn.erp.entity.Orderdetail;
import cn.erp.entity.Orders;


/**
 * @ClassName: OrdersBiz
 * @author: ycs
 * @date: 2019��10��17�� ����4:48:38 
 * @Description:����
 */
public class OrdersBiz extends BaseBiz<Orders> implements IOrdersBiz{

	private IOrdersDao iOrdersDao;
	private IEmpDao iEmpDao;//Ա���ӿ�
	private ISupplierDao iSupplierDao;//��Ӧ�̻�ͻ��ӿ�

	public void setiOrdersDao(IOrdersDao iOrdersDao) {
		this.iOrdersDao = iOrdersDao;
		super.setiBaseDao(this.iOrdersDao);
	}
	
	public IEmpDao getiEmpDao() {
		return iEmpDao;
	}
	public void setiEmpDao(IEmpDao iEmpDao) {
		this.iEmpDao = iEmpDao;
	}
	public ISupplierDao getiSupplierDao() {
		return iSupplierDao;
	}
	public void setiSupplierDao(ISupplierDao iSupplierDao) {
		this.iSupplierDao = iSupplierDao;
	}

	/**
	 * ��Ӷ���
	 * */
	@SuppressWarnings("static-access")
	@Override
	public void add(Orders orders) {
		orders.setType(orders.TYPE_IN);//�������ͣ�1:�ɹ� 2:����
		orders.setState(orders.STATE_CREATE);//����״̬: 0:δ��� 1:�����, 2:��ȷ��, 3:����⣻
		orders.setCreatetime(new Date());//������������

		double totalmoney= 0;//�ܽ��ϼ���

		for(Orderdetail orderdetail :orders.getOrderdetail()) {
			totalmoney += orderdetail.getMoney();//�ۼƽ��
			orderdetail.setState(orderdetail.STATE_NOT_IN);//������ϸ״̬
			orderdetail.setOrders(orders);//�������Ĺ�ϵ
			orders.setTotalmoney(totalmoney);//�������ϼ�
		}
		iOrdersDao.add(orders);
	}

	/**
	 * ��˶���
	 * */
	@SuppressWarnings("static-access")
	@Override
	public void doCheck(Long uuid,Long empUuid) {
		Orders orders=iOrdersDao.getPrimaryId(uuid);//�õ�����ʵ��
		//������״̬ 
		if(!Orders.STATE_CREATE.equals(orders.getState())){ 
			throw new ErpException("�ף��ö����Ѿ���˹���"); 
		}		
		orders.setState(orders.STATE_CHECK);//���¶�������Ϊ��1:�����
		orders.setChecktime(new Date());//�����������
		orders.setChecker(empUuid);//���������
		System.out.println("---����id  ��"+orders.getUuid()+"---����״̬��"+orders.getState()+"---�������ʱ�䣺"+orders.getChecktime()+"---��������ˣ�"+orders.getChecker());
	}
	
	/**
	 *����ȷ��
	 */
	@Override
	public void doStart(Long uuid, Long empUuid) {
		// TODO Auto-generated method stub
		Orders orders=iOrdersDao.getPrimaryId(uuid);
		//������״̬
		if(!Orders.STATE_CHECK.equals(orders.getState())) {
			throw new ErpException("�ף��ö����Ѿ�ȷ�Ϲ��ˣ�");
		}
		orders.setState(Orders.STATE_START);//���¶�������Ϊ��2��ȷ��
		orders.setStarttime(new Date());//�����������
		orders.setStarter(empUuid);//����ȷ����
		
	}
	

	/**   
	 * @Title: getEmpName   
	 * @Description: ����Ա����Ż�ȡԱ������
	 * @param: @param uuid
	 * @param: @param empMap
	 * @param: @return      
	 * @return: String      
	 * @throws   
	 */  
	public String getEmpName(Long uuid,Map<Long, String> empMap){
		//���Ա����ŵ��ڿգ���ô�ͷ��ؿ�
		if(null==uuid) {
			return null;
		}
		String empName=empMap.get(uuid);//ͨ��Ա������õ�Ա������
		if(null==empName) {
			empName=iEmpDao.getPrimaryId(uuid).getName();//����ڻ�����û���ҵ��������dao��ѯ�󣬻�ȡԱ��������
			empMap.put(uuid, empName);//��Ա����Ż���Ա�����Ƶ�������
		}
		return empName;//�����û���
	}

	/**   
	 * @Title: getSupplierName   
	 * @Description: ���ݹ�Ӧ�̱�Ż�ȡ��Ӧ������
	 * @param: @param uuid
	 * @param: @param supplierMap
	 * @param: @return      
	 * @return: String      
	 * @throws   
	 */  
	public String getSupplierName(Long uuid,Map<Long, String> supplierMap) {
		//�����Ӧ��Ϊ����ô�÷��ؿ�
		if(null==uuid) {
			return null;
		}
		String supplierName=supplierMap.get(uuid);
		if(null==supplierName) {
			supplierName=iSupplierDao.getPrimaryId(uuid).getName();
			supplierMap.put(uuid, supplierName);
		}
		return supplierName;
	}

	/**
	 * ��д�����ѯ����
	 */
	@Override
	public List<Orders> getPageList(Orders t1, Orders t2, Object param, int firstResult, int maxResults) {
		//��ȡ��ҳ���
		List<Orders> orders=super.getPageList(t1, t2, param, firstResult, maxResults);
		//����Ա�����ơ�KeyΪԱ����š�valueΪԱ������
		Map<Long, String> empMapName=new HashMap<Long, String>();
		//���湩Ӧ�̻�ͻ����ơ�KeyΪ��Ӧ�̱�š�valueΪ��Ӧ������
		Map<Long, String> supperlierMapName=new HashMap<Long, String>();

		for (Orders o : orders) {
			//�����µ�Ա������
			o.setCreaterName(getEmpName(o.getCreater(),empMapName));
			//�������Ա������
			o.setCheckerName(getEmpName(o.getChecker(), empMapName));
			//����ȷ��Ա������
			o.setStarterName(getEmpName(o.getStarter(), empMapName));
			//���ÿ��Ա������
			o.setEnderName(getEmpName(o.getEnder(), empMapName));
			//���ù�Ӧ�̵�����
			o.setSupplierName(getSupplierName(o.getSupplieruuid(), supperlierMapName));
		}
		return super.getPageList(t1, t2, param, firstResult, maxResults);
	}
	


}
