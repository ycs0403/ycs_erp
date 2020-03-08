package cn.redsun.action;

import cn.erp.actioncommon.BaseAction;
import cn.redsun.biz.IWaybilldetailBiz;
import cn.redsun.entity.Waybilldetail;

/**
* @ClassName: WaybillAction
* @author: ycs
* @date: 2020年2月21日 下午9:49:14 
* @Description:运单
*/
public class WaybilldetailAction extends BaseAction<Waybilldetail>{

	private IWaybilldetailBiz iWaybilldetailBiz;

	public void setiWaybilldetailBiz(IWaybilldetailBiz iWaybilldetailBiz) {
		this.iWaybilldetailBiz = iWaybilldetailBiz;
		super.setiBaseBiz(this.iWaybilldetailBiz);
	}

	

	
	
	
}
