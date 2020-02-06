package cn.erp.biz.impl;

import java.util.Date;
import java.util.List;

import cn.erp.biz.IPurchaseBiz;
import cn.erp.dao.IPurchaseDao;

/**
 * @ClassName: PurchaseBiz
 * @author: ycs
 * @date: 2020��1��25�� ����8:48:38 
 * @Description:�ɹ�����ͳ��
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
