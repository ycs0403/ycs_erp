package cn.erp.action;

import cn.erp.actioncommon.BaseAction;
import cn.erp.biz.IRoleMenuBiz;
import cn.erp.entity.RoleMenu;



/**
* @ClassName: RoleMenuAction
* @author: ycs
* @date: 2019年12月17日 上午10:03:18 
* @Description:角色菜单管理
*/
public class RoleMenuAction extends BaseAction<RoleMenu>{

	private IRoleMenuBiz iRoleMenuBiz;

	public void setiRoleMenuBiz(IRoleMenuBiz iRoleMenuBiz) {
		this.iRoleMenuBiz = iRoleMenuBiz;
		super.setiBaseBiz(this.iRoleMenuBiz);
	}
	


}
