package cn.redsun.action;

import cn.erp.actioncommon.BaseAction;
import cn.redsun.biz.IWaybilldetailBiz;
import cn.redsun.entity.Waybilldetail;

/**
* @ClassName: WaybillAction
* @author: ycs
* @date: 2020��2��21�� ����9:49:14 
* @Description:�˵�
*/
public class WaybilldetailAction extends BaseAction<Waybilldetail>{

	private IWaybilldetailBiz iWaybilldetailBiz;

	public void setiWaybilldetailBiz(IWaybilldetailBiz iWaybilldetailBiz) {
		this.iWaybilldetailBiz = iWaybilldetailBiz;
		super.setiBaseBiz(this.iWaybilldetailBiz);
	}

	

	
	
	
}
