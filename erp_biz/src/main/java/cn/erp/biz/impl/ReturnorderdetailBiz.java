package cn.erp.biz.impl;


import cn.erp.biz.IReturnorderdetailBiz;
import cn.erp.bizcommon.impl.BaseBiz;
import cn.erp.dao.IReturnorderdetailDao;
import cn.erp.entity.Returnorderdetail;



/**
* @ClassName: ReturnorderdetailBiz
* @author: ycs
* @date: 2019��12��19�� ����10:59:12 
* @Description:�˻�������ϸ
*/
public class ReturnorderdetailBiz extends BaseBiz<Returnorderdetail> implements IReturnorderdetailBiz{

	private IReturnorderdetailDao iReturnorderdetailDao;

	public void setiReturnorderdetailDao(IReturnorderdetailDao iReturnorderdetailDao) {
		this.iReturnorderdetailDao = iReturnorderdetailDao;
		super.setiBaseDao(this.iReturnorderdetailDao);
	}
	
	



}
