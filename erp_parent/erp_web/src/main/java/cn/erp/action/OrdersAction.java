package cn.erp.action;

import java.util.List;

import com.alibaba.fastjson.JSON;

import cn.erp.actioncommon.BaseAction;
import cn.erp.biz.IOrdersBiz;
import cn.erp.common_util.CommonAction;
import cn.erp.common_util.ErpException;
import cn.erp.entity.Emp;
import cn.erp.entity.Orderdetail;
import cn.erp.entity.Orders;

/**
 * @ClassName: OrdersAction
 * @author: ycs
 * @date: 2019��10��17�� ����4:50:43 
 * @Description:��������
 */
public class OrdersAction extends BaseAction<Orders>{

	private IOrdersBiz iOrdersBiz;

	public void setiOrdersBiz(IOrdersBiz iOrdersBiz) {
		this.iOrdersBiz = iOrdersBiz;
		super.setiBaseBiz(this.iOrdersBiz);
	}

	public CommonAction<Orders> commonAction=new CommonAction<Orders>();//���ù���ͨ��

	/**
	 * ����:��Ӷ���
	 *@return
	 */
	@Override
	public void add() {
		Emp emp=getUser(); //�������õ���ǰsession�е�¼���û�
		if(emp==null) { 
			commonAction.ajaxReturn(false, "��ǰ�û�δ��¼");
			return ; 
		}
		try { 
			Orders orders=getT();//�õ���������
			orders.setCreater(emp.getUuid());//���õ�ǰ����Ա 

			//��fastjson��json�ַ���ת��ΪOrderdetail�ļ��� 
			List<Orderdetail> orderdetails=JSON.parseArray(json,Orderdetail.class);
			orders.setOrderdetail(orderdetails); //������ϸ
			iOrdersBiz.add(orders);
			commonAction.ajaxReturn(true,"������ӳɹ�"); 
		} catch (Exception e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
			commonAction.ajaxReturn(false, "�������ʧ��"); 
		}
	}

	/**   
	 * @Title: doCheck   
	 * @Description: �������
	 * @param:       
	 * @return: void      
	 * @throws   
	 */  
	public void doCheck() {
		Emp emp=getUser(); 
		if(emp==null) { 
			commonAction.ajaxReturn(false, "��ǰ�û�δ��¼");
			return ; 
		}
		try {
			//�������ҵ��
			iOrdersBiz.doCheck(getId(), emp.getUuid());
			System.out.println("����id��"+getId()+"---�û�id��"+emp.getUuid());
			commonAction.ajaxReturn(true,"������˳ɹ�");
		}  
		catch(ErpException e){
			commonAction.ajaxReturn(false, e.getMessage());
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			commonAction.ajaxReturn(false,"�������ʧ��");
		} 
	}
	
	/**   
	 * @Title: doStart   
	 * @Description: ����ȷ��
	 * @param:       
	 * @return: void      
	 * @throws   
	 */ 
	public void doStart() {
		Emp emp=getUser(); 
		if(emp==null) { 
			commonAction.ajaxReturn(false, "��ǰ�û�δ��¼");
			return ; 
		}
		try {
			//����ȷ��ҵ��
			iOrdersBiz.doStart(getId(), emp.getUuid());
			System.out.println("����id��"+getId()+"---�û�id��"+emp.getUuid());
			commonAction.ajaxReturn(true,"����ȷ�ϳɹ�");
		}  
		catch(ErpException e){
			commonAction.ajaxReturn(false, e.getMessage());
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			commonAction.ajaxReturn(false,"����ȷ��ʧ��");
		} 
	}


	/**   
	 * @Title: myListByPage   
	 * @Description: �ҵĶ���
	 * @param:       
	 * @return: void      
	 * @throws   
	 */  
	public void myListByPage() {
		if(null!=getT()) {
			//�����ѯ����Ϊ�գ������ѯ����
			setT(new Orders());
		}
		Emp emp=getUser();
		//���ö����Ĵ���������
		getT().setCreater(emp.getUuid());
		super.getPageList();
	}

}
