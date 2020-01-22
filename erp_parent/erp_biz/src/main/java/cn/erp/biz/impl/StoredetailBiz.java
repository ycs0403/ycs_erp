package cn.erp.biz.impl;


import cn.erp.biz.IStoredetailBiz;
import cn.erp.bizcommon.impl.BaseBiz;
import cn.erp.dao.IStoredetailDao;
import cn.erp.entity.Storedetail;



/**
* @ClassName: StoredetailBiz
* @author: ycs
* @date: 2019年12月17日 上午10:55:22 
* @Description:仓库库存
*/
public class StoredetailBiz extends BaseBiz<Storedetail> implements IStoredetailBiz{

	private IStoredetailDao iStoredetailDao;

	public void setiStoredetailDao(IStoredetailDao iStoredetailDao) {
		this.iStoredetailDao = iStoredetailDao;
		super.setiBaseDao(this.iStoredetailDao);
	}
	



}
