package cn.erp.biz.impl;

import cn.erp.biz.IGoodsTypeBiz;
import cn.erp.bizcommon.impl.BaseBiz;
import cn.erp.dao.IGoodsTypeDao;
import cn.erp.entity.GoodsType;

/**
 * @author ��С��-��
  * ����ʱ�䣺2019��7��29�� ����11:49:20  
 * @version 1.0 
  * ������
 */
public class GoodsTypeBiz extends BaseBiz<GoodsType> implements IGoodsTypeBiz{

	private IGoodsTypeDao iGoodsTypeDao;

	public void setiGoodsTypeDao(IGoodsTypeDao iGoodsTypeDao) {
		this.iGoodsTypeDao = iGoodsTypeDao;
		super.setiBaseDao(this.iGoodsTypeDao);
	}
	
}
