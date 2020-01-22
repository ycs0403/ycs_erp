package cn.erp.dao.impl;

import org.hibernate.criterion.DetachedCriteria;

import cn.erp.dao.IReturnordersDao;
import cn.erp.daocommon.impl.BaseDao;
import cn.erp.entity.Returnorders;



/**
* @ClassName: ReturnordersDao
* @author: ycs
* @date: 2019年12月19日 上午10:50:38 
* @Description:退货订单
*/
public class ReturnordersDao extends BaseDao<Returnorders> implements IReturnordersDao{
	/**
	 * 描述:代码优化，升级离线查询，提取为私有公共方法
	 *@return
	 */
	public DetachedCriteria getDetachedCriteria(Returnorders returnorders,Returnorders returnorders2,Object param) {
		DetachedCriteria dc=DetachedCriteria.forClass(Returnorders.class);
		if(returnorders!=null) {

		}
		return dc;
	}
}
