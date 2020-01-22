package cn.erp.biz.impl;

import cn.erp.biz.IGoodsBiz;
import cn.erp.bizcommon.impl.BaseBiz;
import cn.erp.dao.IGoodsDao;
import cn.erp.entity.Goods;

/**
 * @author ��С��-��
  * ����ʱ�䣺2019��7��29�� ����11:49:20  
 * @version 1.0 
  * ������
 */
public class GoodsBiz extends BaseBiz<Goods> implements IGoodsBiz{

	private IGoodsDao iGoodsDao;

	public void setiGoodsDao(IGoodsDao iGoodsDao) {
		this.iGoodsDao = iGoodsDao;
		super.setiBaseDao(this.iGoodsDao);
	}
	
}
