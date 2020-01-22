package cn.erp.dao.impl;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
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
			
			//区分供应商和客户
			if(null != supplier.getType()&&supplier.getType().trim().length()>0) {
				dc.add(Restrictions.eq("type", supplier.getType()));
			}

			//名称
			if(null!=supplier.getName()&&supplier.getName().trim().length()>0) {
				dc.add(Restrictions.like("name", supplier.getName(), MatchMode.ANYWHERE));
			}
			//地址
			if(null!=supplier.getAddress()&&supplier.getAddress().trim().length()>0) {
				dc.add(Restrictions.like("address", supplier.getAddress(),MatchMode.ANYWHERE));
			}
			//联系人
			if(null!=supplier.getContact()&&supplier.getContact().trim().length()>0) {
				dc.add(Restrictions.like("contact", supplier.getContact(),MatchMode.ANYWHERE));
			}
			//电话
			if(null!=supplier.getTele()&&supplier.getTele().trim().length()>0) {
				dc.add(Restrictions.like("tele", supplier.getTele(),MatchMode.ANYWHERE));
			}
			//电子邮件
			if(null!=supplier.getEmail()&&supplier.getEmail().trim().length()>0) {
				dc.add(Restrictions.like("email", supplier.getEmail(),MatchMode.ANYWHERE));
			}
		}
		return dc;
	}
}
