package cn.erp.action;

import cn.erp.actioncommon.BaseAction;
import cn.erp.biz.IRoleMenuBiz;
import cn.erp.entity.RoleMenu;



/**
* @ClassName: RoleMenuAction
* @author: ycs
* @date: 2019��12��17�� ����10:03:18 
* @Description:��ɫ�˵�����
*/
public class RoleMenuAction extends BaseAction<RoleMenu>{

	private IRoleMenuBiz iRoleMenuBiz;

	public void setiRoleMenuBiz(IRoleMenuBiz iRoleMenuBiz) {
		this.iRoleMenuBiz = iRoleMenuBiz;
		super.setiBaseBiz(this.iRoleMenuBiz);
	}
	


}
