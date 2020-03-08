package cn.redsun.biz.impl;

import cn.erp.bizcommon.impl.BaseBiz;
import cn.redsun.biz.IWaybillBiz;
import cn.redsun.dao.IWaybillDao;
import cn.redsun.entity.Waybill;

/**
* @ClassName: WaybillBiz
* @author: ycs
* @date: 2020年2月21日 下午8:53:16 
* @Description:运单
*/
public class WaybillBiz extends BaseBiz<Waybill>  implements IWaybillBiz {

	private IWaybillDao iWaybillDao;
	
	public void setiWaybillDao(IWaybillDao iWaybillDao) {
		this.iWaybillDao = iWaybillDao;
		super.setiBaseDao(this.iWaybillDao);
	}


	

}
