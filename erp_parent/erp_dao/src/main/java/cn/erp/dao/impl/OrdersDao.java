package cn.erp.dao.impl;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import cn.erp.dao.IOrdersDao;
import cn.erp.daocommon.impl.BaseDao;
import cn.erp.entity.Orders;

/**
 * @ClassName: OrdersDao
 * @author: ycs
 * @date: 2019年10月17日 下午4:42:09 
 * @Description:订单
 */
public class OrdersDao extends BaseDao<Orders> implements IOrdersDao{

	/**
	 * 描述:代码优化，升级离线查询，提取为私有公共方法
	 *@return
	 */
	public DetachedCriteria getDetachedCriteria(Orders orders,Orders orders2,Object param) {
		DetachedCriteria dc=DetachedCriteria.forClass(Orders.class);
		if(orders!=null) {
			//根据订单类型查询
			if(null!=orders.getType() &&orders.getType().trim().length()>0) {
				dc.add(Restrictions.eq("type", orders.getType()));
			}
			//根据订单状态查询
			if (null!=orders.getState()&&orders.getState().trim().length()>0) {
				dc.add(Restrictions.eq("state", orders.getState()));
			}
			//查询我的订单
			if(null!=orders.getCreater()) {
				dc.add(Restrictions.eq("creater", orders.getCreater()));
			}
		}
		return dc;
	}
}
