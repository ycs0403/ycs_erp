package cn.erp.biz.impl;

import cn.erp.biz.IGoodsTypeBiz;
import cn.erp.bizcommon.impl.BaseBiz;
import cn.erp.dao.IGoodsTypeDao;
import cn.erp.entity.GoodsType;

/**
 * @author 黑小子-余
  * 创建时间：2019年7月29日 上午11:49:20  
 * @version 1.0 
  * 描述：
 */
public class GoodsTypeBiz extends BaseBiz<GoodsType> implements IGoodsTypeBiz{

	private IGoodsTypeDao iGoodsTypeDao;

	public void setiGoodsTypeDao(IGoodsTypeDao iGoodsTypeDao) {
		this.iGoodsTypeDao = iGoodsTypeDao;
		super.setiBaseDao(this.iGoodsTypeDao);
	}
	
}
