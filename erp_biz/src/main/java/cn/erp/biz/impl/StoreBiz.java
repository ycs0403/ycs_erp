package cn.erp.biz.impl;

import cn.erp.biz.IStoreBiz;
import cn.erp.bizcommon.impl.BaseBiz;
import cn.erp.dao.IStoreDao;
import cn.erp.entity.Store;

/**
 * @ClassName: StoreBiz
 * @author: ycs
 * @date: 2019��11��1�� ����10:20:05 
 * @Description:�ֿ�
 */
public class StoreBiz extends BaseBiz<Store> implements IStoreBiz{

	private IStoreDao iStoreDao;

	public void setiStoreDao(IStoreDao iStoreDao) {
		this.iStoreDao = iStoreDao;
		super.setiBaseDao(this.iStoreDao);
	}


}
