package cn.erp.action;

import cn.erp.actioncommon.BaseAction;
import cn.erp.biz.IXsopHistBiz;
import cn.erp.entity.XsopHist;



/**
* @ClassName: XsopHistAction
* @author: ycs
* @date: 2019��12��17�� ����10:57:04 
* @Description:�����깤��¼��
*/
public class XsopHistAction extends BaseAction<XsopHist>{

	private IXsopHistBiz iXsopHistBiz;

	public void setiXsopHistBiz(IXsopHistBiz iXsopHistBiz) {
		this.iXsopHistBiz = iXsopHistBiz;
		super.setiBaseBiz(this.iXsopHistBiz);
	}
	


}
