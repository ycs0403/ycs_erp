package cn.erp.dao.impl;

import org.hibernate.criterion.DetachedCriteria;

import cn.erp.dao.IRoleDao;
import cn.erp.daocommon.impl.BaseDao;
import cn.erp.entity.Role;


/**
 * @ClassName: RoleDao
 * @author: ycs
 * @date: 2019年12月16日 下午9:14:53 
 * @Description:角色管理
 */
public class RoleDao extends BaseDao<Role> implements IRoleDao{
	/**
	 * 描述:代码优化，升级离线查询，提取为私有公共方法
	 *@return
	 */
	public DetachedCriteria getDetachedCriteria(Role role,Role role2,Object param) {
		DetachedCriteria dc=DetachedCriteria.forClass(Role.class);
		if(role!=null) {

		}
		return dc;
	}
}
