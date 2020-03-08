package cn.redsun.biz.impl;

import cn.erp.bizcommon.impl.BaseBiz;
import cn.redsun.biz.IWaybilldetailBiz;
import cn.redsun.dao.IWaybilldetailDao;
import cn.redsun.entity.Waybilldetail;

public class WaybilldetailBiz extends BaseBiz<Waybilldetail> implements IWaybilldetailBiz {

	private IWaybilldetailDao iWaybilldetailDao;

	public void setiWaybilldetailDao(IWaybilldetailDao iWaybilldetailDao) {
		this.iWaybilldetailDao = iWaybilldetailDao;
		super.setiBaseDao(this.iWaybilldetailDao);
	}
	
	
}
