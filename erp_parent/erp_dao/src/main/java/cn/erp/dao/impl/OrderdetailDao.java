package cn.erp.dao.impl;

import org.hibernate.criterion.DetachedCriteria;
import cn.erp.dao.IOrderdetailDao;
import cn.erp.daocommon.impl.BaseDao;
import cn.erp.entity.Orderdetail;


/**
 * @author 黑小子-余
  * 创建时间：2019年8月5日 下午9:18:30  
 * @version 1.0 
  * 描述：
 */
public class OrderdetailDao extends BaseDao<Orderdetail> implements IOrderdetailDao{

	/**
	 * 描述:代码优化，升级离线查询，提取为私有公共方法
	 *@return
	 */
	public DetachedCriteria getDetachedCriteria(Orderdetail orderdetail,Orderdetail orderdetail2,Object param) {
		DetachedCriteria dc=DetachedCriteria.forClass(Orderdetail.class);
		if(orderdetail!=null) {
			
		}
		return dc;
	}
}
