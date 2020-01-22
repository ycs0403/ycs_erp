package cn.erp.action;

import cn.erp.actioncommon.BaseAction;
import cn.erp.biz.IXsopHistBiz;
import cn.erp.entity.XsopHist;



/**
* @ClassName: XsopHistAction
* @author: ycs
* @date: 2019年12月17日 上午10:57:04 
* @Description:工序完工记录表
*/
public class XsopHistAction extends BaseAction<XsopHist>{

	private IXsopHistBiz iXsopHistBiz;

	public void setiXsopHistBiz(IXsopHistBiz iXsopHistBiz) {
		this.iXsopHistBiz = iXsopHistBiz;
		super.setiBaseBiz(this.iXsopHistBiz);
	}
	


}
