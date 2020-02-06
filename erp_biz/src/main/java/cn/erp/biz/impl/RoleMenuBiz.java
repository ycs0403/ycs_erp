package cn.erp.biz.impl;


import cn.erp.biz.IRoleMenuBiz;
import cn.erp.bizcommon.impl.BaseBiz;
import cn.erp.dao.IRoleMenuDao;
import cn.erp.entity.RoleMenu;



/**
* @ClassName: RoleMenuBiz
* @author: ycs
* @date: 2019年12月17日 上午10:02:40 
* @Description:角色菜单管理
*/
public class RoleMenuBiz extends BaseBiz<RoleMenu> implements IRoleMenuBiz{

	private IRoleMenuDao iRoleMenuDao;

	public void setiRoleMenuDao(IRoleMenuDao iRoleMenuDao) {
		this.iRoleMenuDao = iRoleMenuDao;
		super.setiBaseDao(this.iRoleMenuDao);
	}
	
	



}
