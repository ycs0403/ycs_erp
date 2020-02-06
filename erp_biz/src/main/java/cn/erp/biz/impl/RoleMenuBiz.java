package cn.erp.biz.impl;


import cn.erp.biz.IRoleMenuBiz;
import cn.erp.bizcommon.impl.BaseBiz;
import cn.erp.dao.IRoleMenuDao;
import cn.erp.entity.RoleMenu;



/**
* @ClassName: RoleMenuBiz
* @author: ycs
* @date: 2019��12��17�� ����10:02:40 
* @Description:��ɫ�˵�����
*/
public class RoleMenuBiz extends BaseBiz<RoleMenu> implements IRoleMenuBiz{

	private IRoleMenuDao iRoleMenuDao;

	public void setiRoleMenuDao(IRoleMenuDao iRoleMenuDao) {
		this.iRoleMenuDao = iRoleMenuDao;
		super.setiBaseDao(this.iRoleMenuDao);
	}
	
	



}
