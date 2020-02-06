package cn.erp.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import cn.erp.dao.IEmpDao;
import cn.erp.daocommon.impl.BaseDao;
import cn.erp.entity.Emp;

/**
 * @author ��С��-��
 * ����ʱ�䣺2019��7��4�� ����10:31:07  
 * @version 1.0 
 * ������greater than ������ ����д��gt
 *     less than      �� С�� ����д��lt
 *     great than or equal to �����ڵ��� �� ��д��ge
 *     less than or equal to  : С�ڵ��� �� ��д��le
 */
public class EmpDao extends BaseDao<Emp> implements IEmpDao{

	public DetachedCriteria getDetachedCriteria(Emp emp1,Emp emp2,Object param){
		DetachedCriteria dc=DetachedCriteria.forClass(Emp.class);
		if(emp1!=null){
			if(emp1.getName()!=null&&emp1.getName().equals("")) {//����
				dc.add(Restrictions.like("name", emp1.getName()));
			}
			if(emp1.getGender()!=null) {//�Ա�
				dc.add(Restrictions.eq("gender", emp1.getGender()));
			}
			//������ڻ���ڵ�һ������
			if(emp1.getBirthday()!=null) {
				dc.add(Restrictions.ge("birthday", emp1.getBirthday()));
			}
			//���С�ڻ���ڵڶ�������
			if(emp2.getBirthday()!=null) {
				dc.add(Restrictions.le("birthday", emp2.getBirthday()));
			}
			//��������
			if(emp1.getDep()!=null && emp1.getDep().getUuid()!=null) {
				dc.add(Restrictions.eq("dep", emp1.getDep()));
			}
		}
		return dc;
	}

	/**
	 *����:�����û����������ѯ��¼��Ϣ
	 */
	public Emp findByUserNameAndPwd(String userName, String pwd) {
		sql="from Emp where username=? and pwd=?";
		@SuppressWarnings("unchecked")
		List<Emp> list=(List<Emp>) getHibernateTemplate().find(sql, userName,pwd);
		if(list.size()>0) {
			return list.get(0);
		}else {
			return null;
		}
	}

	
	/**
	 *����:����Ա�޸�����
	 */
	@Override
	public void updatePwd_reset(Long uuid, String newPwd) {
		sql="update Emp set pwd=? where uuid=?";
		this.getHibernateTemplate().bulkUpdate(sql, newPwd,uuid);
	}

}
