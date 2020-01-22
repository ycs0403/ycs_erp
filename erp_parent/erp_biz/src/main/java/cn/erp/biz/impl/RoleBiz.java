package cn.erp.biz.impl;


import cn.erp.biz.IRoleBiz;
import cn.erp.bizcommon.impl.BaseBiz;
import cn.erp.dao.IRoleDao;
import cn.erp.entity.Role;


/**
* @ClassName: RoleBiz
* @author: ycs
* @date: 2019��12��16�� ����9:19:13 
* @Description:��ɫ����
*/
public class RoleBiz extends BaseBiz<Role> implements IRoleBiz{

	private IRoleDao iRoleDao;

	public void setiRoleDao(IRoleDao iRoleDao) {
		this.iRoleDao = iRoleDao;
		super.setiBaseDao(this.iRoleDao);
	}



}
