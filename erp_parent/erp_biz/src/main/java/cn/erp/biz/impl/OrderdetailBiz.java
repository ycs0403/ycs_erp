package cn.erp.biz.impl;

import cn.erp.biz.IOrderdetailBiz;
import cn.erp.bizcommon.impl.BaseBiz;
import cn.erp.dao.IOrderdetailDao;
import cn.erp.entity.Orderdetail;


/**
 * @author 黑小子-余
  * 创建时间：2019年8月5日 下午9:57:32  
 * @version 1.0 
  * 描述：
 */
public class OrderdetailBiz extends BaseBiz<Orderdetail> implements IOrderdetailBiz{

	private IOrderdetailDao iOrderdetailDao;

	public void setiOrderdetailDao(IOrderdetailDao iOrderdetailDao) {
		this.iOrderdetailDao = iOrderdetailDao;
		super.setiBaseDao(this.iOrderdetailDao);
	}


}
