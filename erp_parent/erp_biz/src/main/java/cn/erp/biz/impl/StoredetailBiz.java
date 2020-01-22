package cn.erp.biz.impl;


import cn.erp.biz.IStoredetailBiz;
import cn.erp.bizcommon.impl.BaseBiz;
import cn.erp.dao.IStoredetailDao;
import cn.erp.entity.Storedetail;



/**
* @ClassName: StoredetailBiz
* @author: ycs
* @date: 2019��12��17�� ����10:55:22 
* @Description:�ֿ���
*/
public class StoredetailBiz extends BaseBiz<Storedetail> implements IStoredetailBiz{

	private IStoredetailDao iStoredetailDao;

	public void setiStoredetailDao(IStoredetailDao iStoredetailDao) {
		this.iStoredetailDao = iStoredetailDao;
		super.setiBaseDao(this.iStoredetailDao);
	}
	



}
