package cn.erp.dao.impl;

import org.hibernate.criterion.DetachedCriteria;

import cn.erp.dao.IRoleMenuDao;
import cn.erp.daocommon.impl.BaseDao;
import cn.erp.entity.RoleMenu;



/**
 * @ClassName: RoleMenuDao
 * @author: ycs
 * @date: 2019��12��17�� ����9:55:31 
 * @Description:��ɫ�˵�����
 */
public class RoleMenuDao extends BaseDao<RoleMenu> implements IRoleMenuDao{
	/**
	 * ����:�����Ż����������߲�ѯ����ȡΪ˽�й�������
	 *@return
	 */
	public DetachedCriteria getDetachedCriteria(RoleMenu roleMenu,RoleMenu roleMenu2,Object param) {
		DetachedCriteria dc=DetachedCriteria.forClass(RoleMenu.class);
		if(roleMenu!=null) {

		}
		return dc;
	}
}
