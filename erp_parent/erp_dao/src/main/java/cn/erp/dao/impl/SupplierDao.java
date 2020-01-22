package cn.erp.dao.impl;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
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
			
			//���ֹ�Ӧ�̺Ϳͻ�
			if(null != supplier.getType()&&supplier.getType().trim().length()>0) {
				dc.add(Restrictions.eq("type", supplier.getType()));
			}

			//����
			if(null!=supplier.getName()&&supplier.getName().trim().length()>0) {
				dc.add(Restrictions.like("name", supplier.getName(), MatchMode.ANYWHERE));
			}
			//��ַ
			if(null!=supplier.getAddress()&&supplier.getAddress().trim().length()>0) {
				dc.add(Restrictions.like("address", supplier.getAddress(),MatchMode.ANYWHERE));
			}
			//��ϵ��
			if(null!=supplier.getContact()&&supplier.getContact().trim().length()>0) {
				dc.add(Restrictions.like("contact", supplier.getContact(),MatchMode.ANYWHERE));
			}
			//�绰
			if(null!=supplier.getTele()&&supplier.getTele().trim().length()>0) {
				dc.add(Restrictions.like("tele", supplier.getTele(),MatchMode.ANYWHERE));
			}
			//�����ʼ�
			if(null!=supplier.getEmail()&&supplier.getEmail().trim().length()>0) {
				dc.add(Restrictions.like("email", supplier.getEmail(),MatchMode.ANYWHERE));
			}
		}
		return dc;
	}
}
