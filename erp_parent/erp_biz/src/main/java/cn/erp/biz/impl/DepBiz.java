package cn.erp.biz.impl;


import cn.erp.biz.IDepBiz;
import cn.erp.bizcommon.impl.BaseBiz;
import cn.erp.dao.IDepDao;
import cn.erp.entity.Dep;

/**
 * @author ��С��-��
  * ����ʱ�䣺2019��5��29�� ����11:37:58  
 * @version 1.0 
  * ����������ҵ���߼�ʵ����
 */
public class DepBiz extends BaseBiz<Dep> implements IDepBiz{

	private IDepDao iDepDao;//ע�벿��dao
	
	public void setiDepDao(IDepDao iDepDao) {
		this.iDepDao = iDepDao;
		super.setiBaseDao(this.iDepDao);
	}
	
}
