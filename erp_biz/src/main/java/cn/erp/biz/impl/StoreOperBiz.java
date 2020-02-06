package cn.erp.biz.impl;

import cn.erp.biz.IStoreOperBiz;
import cn.erp.bizcommon.impl.BaseBiz;
import cn.erp.dao.IStoreOperDao;
import cn.erp.entity.Storeoper;


/**
 * @ClassName: StoreOperBiz
 * @author: ycs
 * @date: 2019年11月9日 上午12:10:38 
 * @Description:仓库操作记录
 */
public class StoreOperBiz extends BaseBiz<Storeoper> implements IStoreOperBiz{

	private IStoreOperDao iStoreOperDao;

	public void setiStoreOperDao(IStoreOperDao iStoreOperDao) {
		this.iStoreOperDao = iStoreOperDao;
		super.setiBaseDao(this.iStoreOperDao);
	}

	


}
