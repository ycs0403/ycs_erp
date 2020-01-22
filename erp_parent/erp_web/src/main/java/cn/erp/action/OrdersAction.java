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
 * @date: 2019年10月17日 下午4:50:43 
 * @Description:订单管理
 */
public class OrdersAction extends BaseAction<Orders>{

	private IOrdersBiz iOrdersBiz;

	public void setiOrdersBiz(IOrdersBiz iOrdersBiz) {
		this.iOrdersBiz = iOrdersBiz;
		super.setiBaseBiz(this.iOrdersBiz);
	}

	public CommonAction<Orders> commonAction=new CommonAction<Orders>();//调用公共通用

	/**
	 * 描述:添加订单
	 *@return
	 */
	@Override
	public void add() {
		Emp emp=getUser(); //父类中拿到当前session中登录的用户
		if(emp==null) { 
			commonAction.ajaxReturn(false, "当前用户未登录");
			return ; 
		}
		try { 
			Orders orders=getT();//得到订单对象
			orders.setCreater(emp.getUuid());//设置当前操作员 

			//用fastjson将json字符串转换为Orderdetail的集合 
			List<Orderdetail> orderdetails=JSON.parseArray(json,Orderdetail.class);
			orders.setOrderdetail(orderdetails); //订单明细
			iOrdersBiz.add(orders);
			commonAction.ajaxReturn(true,"订单添加成功"); 
		} catch (Exception e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
			commonAction.ajaxReturn(false, "订单添加失败"); 
		}
	}

	/**   
	 * @Title: doCheck   
	 * @Description: 订单审核
	 * @param:       
	 * @return: void      
	 * @throws   
	 */  
	public void doCheck() {
		Emp emp=getUser(); 
		if(emp==null) { 
			commonAction.ajaxReturn(false, "当前用户未登录");
			return ; 
		}
		try {
			//调用审核业务
			iOrdersBiz.doCheck(getId(), emp.getUuid());
			System.out.println("订单id："+getId()+"---用户id："+emp.getUuid());
			commonAction.ajaxReturn(true,"订单审核成功");
		}  
		catch(ErpException e){
			commonAction.ajaxReturn(false, e.getMessage());
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			commonAction.ajaxReturn(false,"订单审核失败");
		} 
	}
	
	/**   
	 * @Title: doStart   
	 * @Description: 订单确认
	 * @param:       
	 * @return: void      
	 * @throws   
	 */ 
	public void doStart() {
		Emp emp=getUser(); 
		if(emp==null) { 
			commonAction.ajaxReturn(false, "当前用户未登录");
			return ; 
		}
		try {
			//调用确认业务
			iOrdersBiz.doStart(getId(), emp.getUuid());
			System.out.println("订单id："+getId()+"---用户id："+emp.getUuid());
			commonAction.ajaxReturn(true,"订单确认成功");
		}  
		catch(ErpException e){
			commonAction.ajaxReturn(false, e.getMessage());
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			commonAction.ajaxReturn(false,"订单确认失败");
		} 
	}


	/**   
	 * @Title: myListByPage   
	 * @Description: 我的订单
	 * @param:       
	 * @return: void      
	 * @throws   
	 */  
	public void myListByPage() {
		if(null!=getT()) {
			//如果查询条件为空，则构造查询条件
			setT(new Orders());
		}
		Emp emp=getUser();
		//设置订单的创建者条件
		getT().setCreater(emp.getUuid());
		super.getPageList();
	}

}
