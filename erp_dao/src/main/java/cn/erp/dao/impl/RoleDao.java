package cn.erp.dao.impl;

import org.hibernate.criterion.DetachedCriteria;

import cn.erp.dao.IRoleDao;
import cn.erp.daocommon.impl.BaseDao;
import cn.erp.entity.Role;


/**
 * @ClassName: RoleDao
 * @author: ycs
 * @date: 2019��12��16�� ����9:14:53 
 * @Description:��ɫ����
 */
public class RoleDao extends BaseDao<Role> implements IRoleDao{
	/**
	 * ����:�����Ż����������߲�ѯ����ȡΪ˽�й�������
	 *@return
	 */
	public DetachedCriteria getDetachedCriteria(Role role,Role role2,Object param) {
		DetachedCriteria dc=DetachedCriteria.forClass(Role.class);
		if(role!=null) {

		}
		return dc;
	}
}
