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
 * @date: 2019年10月17日 下午4:48:38 
 * @Description:订单
 */
public class OrdersBiz extends BaseBiz<Orders> implements IOrdersBiz{

	private IOrdersDao iOrdersDao;
	private IEmpDao iEmpDao;//员工接口
	private ISupplierDao iSupplierDao;//供应商或客户接口

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
	 * 添加订单
	 * */
	@SuppressWarnings("static-access")
	@Override
	public void add(Orders orders) {
		orders.setType(orders.TYPE_IN);//订单类型：1:采购 2:销售
		orders.setState(orders.STATE_CREATE);//订单状态: 0:未审核 1:已审核, 2:已确认, 3:已入库；
		orders.setCreatetime(new Date());//订单创建日期

		double totalmoney= 0;//总金额合计数

		for(Orderdetail orderdetail :orders.getOrderdetail()) {
			totalmoney += orderdetail.getMoney();//累计金额
			orderdetail.setState(orderdetail.STATE_NOT_IN);//订单明细状态
			orderdetail.setOrders(orders);//跟订单的关系
			orders.setTotalmoney(totalmoney);//订单金额合计
		}
		iOrdersDao.add(orders);
	}

	/**
	 * 审核订单
	 * */
	@SuppressWarnings("static-access")
	@Override
	public void doCheck(Long uuid,Long empUuid) {
		Orders orders=iOrdersDao.getPrimaryId(uuid);//拿到订单实体
		//订单的状态 
		if(!Orders.STATE_CREATE.equals(orders.getState())){ 
			throw new ErpException("亲！该订单已经审核过了"); 
		}		
		orders.setState(orders.STATE_CHECK);//更新订单对象为：1:已审核
		orders.setChecktime(new Date());//更新审核日期
		orders.setChecker(empUuid);//更新审核人
		System.out.println("---订单id  ："+orders.getUuid()+"---订单状态："+orders.getState()+"---订单审核时间："+orders.getChecktime()+"---订单审核人："+orders.getChecker());
	}
	
	/**
	 *订单确认
	 */
	@Override
	public void doStart(Long uuid, Long empUuid) {
		// TODO Auto-generated method stub
		Orders orders=iOrdersDao.getPrimaryId(uuid);
		//订单的状态
		if(!Orders.STATE_CHECK.equals(orders.getState())) {
			throw new ErpException("亲！该订单已经确认过了！");
		}
		orders.setState(Orders.STATE_START);//更新订单对象为：2已确认
		orders.setStarttime(new Date());//更新审核日期
		orders.setStarter(empUuid);//更新确认人
		
	}
	

	/**   
	 * @Title: getEmpName   
	 * @Description: 根据员工编号获取员工名称
	 * @param: @param uuid
	 * @param: @param empMap
	 * @param: @return      
	 * @return: String      
	 * @throws   
	 */  
	public String getEmpName(Long uuid,Map<Long, String> empMap){
		//如果员工编号等于空，那么就返回空
		if(null==uuid) {
			return null;
		}
		String empName=empMap.get(uuid);//通过员工编号拿到员工名称
		if(null==empName) {
			empName=iEmpDao.getPrimaryId(uuid).getName();//如果在缓存中没有找到，则调用dao查询后，获取员工的名称
			empMap.put(uuid, empName);//按员工编号缓存员工名称到缓存中
		}
		return empName;//返回用户名
	}

	/**   
	 * @Title: getSupplierName   
	 * @Description: 根据供应商编号获取供应商名称
	 * @param: @param uuid
	 * @param: @param supplierMap
	 * @param: @return      
	 * @return: String      
	 * @throws   
	 */  
	public String getSupplierName(Long uuid,Map<Long, String> supplierMap) {
		//如果供应商为空那么久返回空
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
	 * 重写父类查询方法
	 */
	@Override
	public List<Orders> getPageList(Orders t1, Orders t2, Object param, int firstResult, int maxResults) {
		//获取分页结果
		List<Orders> orders=super.getPageList(t1, t2, param, firstResult, maxResults);
		//缓存员工名称、Key为员工编号、value为员工姓名
		Map<Long, String> empMapName=new HashMap<Long, String>();
		//缓存供应商或客户名称、Key为供应商编号、value为供应商名称
		Map<Long, String> supperlierMapName=new HashMap<Long, String>();

		for (Orders o : orders) {
			//设置下单员的名称
			o.setCreaterName(getEmpName(o.getCreater(),empMapName));
			//设置审核员的名称
			o.setCheckerName(getEmpName(o.getChecker(), empMapName));
			//设置确认员的名称
			o.setStarterName(getEmpName(o.getStarter(), empMapName));
			//设置库管员的名称
			o.setEnderName(getEmpName(o.getEnder(), empMapName));
			//设置供应商的名称
			o.setSupplierName(getSupplierName(o.getSupplieruuid(), supperlierMapName));
		}
		return super.getPageList(t1, t2, param, firstResult, maxResults);
	}
	


}
