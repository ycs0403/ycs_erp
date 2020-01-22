package cn.erp.action;

import cn.erp.actioncommon.BaseAction;
import cn.erp.biz.IRoleBiz;
import cn.erp.entity.Role;


/**
 * @ClassName: RoleAction
 * @author: ycs
 * @date: 2019年12月16日 下午9:21:45 
 * @Description:角色管理
 */
public class RoleAction extends BaseAction<Role>{

	private IRoleBiz iRoleBiz;

	public void setiRoleBiz(IRoleBiz iRoleBiz) {
		this.iRoleBiz = iRoleBiz;
		super.setiBaseBiz(this.iRoleBiz);
	}


}
