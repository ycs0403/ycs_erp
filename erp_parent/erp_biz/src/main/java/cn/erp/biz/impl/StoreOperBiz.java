package cn.erp.biz.impl;

import cn.erp.biz.IStoreOperBiz;
import cn.erp.bizcommon.impl.BaseBiz;
import cn.erp.dao.IStoreOperDao;
import cn.erp.entity.Storeoper;


/**
 * @ClassName: StoreOperBiz
 * @author: ycs
 * @date: 2019��11��9�� ����12:10:38 
 * @Description:�ֿ������¼
 */
public class StoreOperBiz extends BaseBiz<Storeoper> implements IStoreOperBiz{

	private IStoreOperDao iStoreOperDao;

	public void setiStoreOperDao(IStoreOperDao iStoreOperDao) {
		this.iStoreOperDao = iStoreOperDao;
		super.setiBaseDao(this.iStoreOperDao);
	}

	


}
