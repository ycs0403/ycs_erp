package cn.erp.biz.impl;

import cn.erp.biz.IMenuBiz;
import cn.erp.bizcommon.impl.BaseBiz;
import cn.erp.dao.IMenuDao;
import cn.erp.entity.Menu;


/**
 * @author ��С��-��
  * ����ʱ�䣺2019��7��30�� ����10:49:01  
 * @version 1.0 
  * ������
 */
public class MenuBiz extends BaseBiz<Menu> implements IMenuBiz{

	private IMenuDao iMenuDao;

	public void setiMenuDao(IMenuDao iMenuDao) {
		this.iMenuDao = iMenuDao;
		super.setiBaseDao(this.iMenuDao);
	}

	@Override
	public Menu getPrimaryId(Long id) {
		// TODO Auto-generated method stub
		return iMenuDao.getPrimaryId(id);
	}

}
