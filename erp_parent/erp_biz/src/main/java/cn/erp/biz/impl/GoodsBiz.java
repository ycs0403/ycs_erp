package cn.erp.biz.impl;

import cn.erp.biz.IGoodsBiz;
import cn.erp.bizcommon.impl.BaseBiz;
import cn.erp.dao.IGoodsDao;
import cn.erp.entity.Goods;

/**
 * @author 黑小子-余
  * 创建时间：2019年7月29日 上午11:49:20  
 * @version 1.0 
  * 描述：
 */
public class GoodsBiz extends BaseBiz<Goods> implements IGoodsBiz{

	private IGoodsDao iGoodsDao;

	public void setiGoodsDao(IGoodsDao iGoodsDao) {
		this.iGoodsDao = iGoodsDao;
		super.setiBaseDao(this.iGoodsDao);
	}
	
}
