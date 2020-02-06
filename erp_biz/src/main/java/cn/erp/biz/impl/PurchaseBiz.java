package cn.erp.biz.impl;

import java.util.Date;
import java.util.List;

import cn.erp.biz.IPurchaseBiz;
import cn.erp.dao.IPurchaseDao;

/**
 * @ClassName: PurchaseBiz
 * @author: ycs
 * @date: 2020年1月25日 下午8:48:38 
 * @Description:采购表报表统计
 */
public class PurchaseBiz implements IPurchaseBiz {

	private IPurchaseDao iPurchaseDao;

	public void setiPurchaseDao(IPurchaseDao iPurchaseDao) {
		this.iPurchaseDao = iPurchaseDao;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List orderPurchase(Date startDate, Date endDate) {
			return iPurchaseDao.orderPurchase(startDate, endDate);
	}


}
