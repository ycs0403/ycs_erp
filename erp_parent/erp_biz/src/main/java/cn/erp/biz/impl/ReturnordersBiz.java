package cn.erp.biz.impl;


import cn.erp.biz.IReturnordersBiz;
import cn.erp.bizcommon.impl.BaseBiz;
import cn.erp.dao.IReturnordersDao;
import cn.erp.entity.Returnorders;



/**
* @ClassName: ReturnordersBiz
* @author: ycs
* @date: 2019年12月19日 上午10:57:47 
* @Description:退货订单
*/
public class ReturnordersBiz extends BaseBiz<Returnorders> implements IReturnordersBiz{

	private IReturnordersDao iReturnordersDao;

	public void setiReturnordersDao(IReturnordersDao iReturnordersDao) {
		this.iReturnordersDao = iReturnordersDao;
		super.setiBaseDao(this.iReturnordersDao);
	}
	
	



}
