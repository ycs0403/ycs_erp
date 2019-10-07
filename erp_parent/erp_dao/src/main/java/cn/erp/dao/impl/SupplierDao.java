package cn.erp.dao.impl;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import cn.erp.dao.ISupplierDao;
import cn.erp.daocommon.impl.BaseDao;
import cn.erp.entity.Supplier;


/**
 * @author 黑小子-余
  * 创建时间：2019年8月2日 下午10:27:42  
 * @version 1.0 
  * 描述：
 */
public class SupplierDao extends BaseDao<Supplier> implements ISupplierDao{

	/**
	 * 描述:代码优化，升级离线查询，提取为私有公共方法
	 *@return
	 */
	public DetachedCriteria getDetachedCriteria(Supplier supplier,Supplier supplier2,Object param) {
		DetachedCriteria dc=DetachedCriteria.forClass(Supplier.class);
		if(supplier!=null) {
			if(null != supplier.getType()) {
				dc.add(Restrictions.eq("type", supplier.getType()));
			}
		}
		return dc;
	}
}
