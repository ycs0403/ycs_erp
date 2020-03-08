package cn.redsun.action;

import cn.erp.actioncommon.BaseAction;
import cn.redsun.biz.IWaybillBiz;
import cn.redsun.entity.Waybill;

/**
* @ClassName: WaybillAction
* @author: ycs
* @date: 2020年2月21日 下午9:49:14 
* @Description:运单
*/
public class WaybillAction extends BaseAction<Waybill>{

	private IWaybillBiz iWaybillBiz;

	public void setiWaybillBiz(IWaybillBiz iWaybillBiz) {
		this.iWaybillBiz = iWaybillBiz;
		super.setiBaseBiz(this.iWaybillBiz);
	}
	
}
