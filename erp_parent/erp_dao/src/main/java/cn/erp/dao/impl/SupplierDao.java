package cn.erp.dao.impl;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import cn.erp.dao.ISupplierDao;
import cn.erp.daocommon.impl.BaseDao;
import cn.erp.entity.Supplier;


/**
 * @author ��С��-��
  * ����ʱ�䣺2019��8��2�� ����10:27:42  
 * @version 1.0 
  * ������
 */
public class SupplierDao extends BaseDao<Supplier> implements ISupplierDao{

	/**
	 * ����:�����Ż����������߲�ѯ����ȡΪ˽�й�������
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
