package cn.erp.action;

import cn.erp.actioncommon.BaseAction;
import cn.erp.biz.IRoleBiz;
import cn.erp.entity.Role;


/**
 * @ClassName: RoleAction
 * @author: ycs
 * @date: 2019��12��16�� ����9:21:45 
 * @Description:��ɫ����
 */
public class RoleAction extends BaseAction<Role>{

	private IRoleBiz iRoleBiz;

	public void setiRoleBiz(IRoleBiz iRoleBiz) {
		this.iRoleBiz = iRoleBiz;
		super.setiBaseBiz(this.iRoleBiz);
	}


}
