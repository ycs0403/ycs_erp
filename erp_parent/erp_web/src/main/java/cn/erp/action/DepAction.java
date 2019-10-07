package cn.erp.action;

import cn.erp.actioncommon.BaseAction;
import cn.erp.biz.IDepBiz;
import cn.erp.entity.Dep;

/**
 * @author 黑小子-余 创建时间：2019年5月29日 下午11:39:24
 * @version 1.0 描述：部门Action
 */
public class DepAction extends BaseAction<Dep>{

	private IDepBiz iDepBiz;
	
	public void setiDepBiz(IDepBiz iDepBiz) {
		this.iDepBiz = iDepBiz;
		super.setiBaseBiz(this.iDepBiz);
	}
	
}
