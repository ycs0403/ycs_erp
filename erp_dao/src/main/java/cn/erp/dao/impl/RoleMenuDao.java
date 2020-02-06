package cn.erp.dao.impl;

import org.hibernate.criterion.DetachedCriteria;

import cn.erp.dao.IRoleMenuDao;
import cn.erp.daocommon.impl.BaseDao;
import cn.erp.entity.RoleMenu;



/**
 * @ClassName: RoleMenuDao
 * @author: ycs
 * @date: 2019年12月17日 上午9:55:31 
 * @Description:角色菜单管理
 */
public class RoleMenuDao extends BaseDao<RoleMenu> implements IRoleMenuDao{
	/**
	 * 描述:代码优化，升级离线查询，提取为私有公共方法
	 *@return
	 */
	public DetachedCriteria getDetachedCriteria(RoleMenu roleMenu,RoleMenu roleMenu2,Object param) {
		DetachedCriteria dc=DetachedCriteria.forClass(RoleMenu.class);
		if(roleMenu!=null) {

		}
		return dc;
	}
}
