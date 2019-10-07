package cn.erp.action;

import cn.erp.actioncommon.BaseAction;
import cn.erp.biz.IDepBiz;
import cn.erp.entity.Dep;

/**
 * @author ��С��-�� ����ʱ�䣺2019��5��29�� ����11:39:24
 * @version 1.0 ����������Action
 */
public class DepAction extends BaseAction<Dep>{

	private IDepBiz iDepBiz;
	
	public void setiDepBiz(IDepBiz iDepBiz) {
		this.iDepBiz = iDepBiz;
		super.setiBaseBiz(this.iDepBiz);
	}
	
}
