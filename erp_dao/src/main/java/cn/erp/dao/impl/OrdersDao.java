package cn.erp.dao.impl;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import cn.erp.dao.IOrdersDao;
import cn.erp.daocommon.impl.BaseDao;
import cn.erp.entity.Orders;

/**
 * @ClassName: OrdersDao
 * @author: ycs
 * @date: 2019��10��17�� ����4:42:09 
 * @Description:����
 */
public class OrdersDao extends BaseDao<Orders> implements IOrdersDao{

	/**
	 * ����:�����Ż����������߲�ѯ����ȡΪ˽�й�������
	 *@return
	 */
	public DetachedCriteria getDetachedCriteria(Orders orders,Orders orders2,Object param) {
		DetachedCriteria dc=DetachedCriteria.forClass(Orders.class);
		if(orders!=null) {
			//���ݶ������Ͳ�ѯ
			if(null!=orders.getType() &&orders.getType().trim().length()>0) {
				dc.add(Restrictions.eq("type", orders.getType()));
			}
			//���ݶ���״̬��ѯ
			if (null!=orders.getState()&&orders.getState().trim().length()>0) {
				dc.add(Restrictions.eq("state", orders.getState()));
			}
			//��ѯ�ҵĶ���
			if(null!=orders.getCreater()) {
				dc.add(Restrictions.eq("creater", orders.getCreater()));
			}
		}
		return dc;
	}
}
