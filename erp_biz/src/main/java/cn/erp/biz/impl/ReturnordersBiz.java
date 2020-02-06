package cn.erp.biz.impl;


import cn.erp.biz.IReturnordersBiz;
import cn.erp.bizcommon.impl.BaseBiz;
import cn.erp.dao.IReturnordersDao;
import cn.erp.entity.Returnorders;



/**
* @ClassName: ReturnordersBiz
* @author: ycs
* @date: 2019��12��19�� ����10:57:47 
* @Description:�˻�����
*/
public class ReturnordersBiz extends BaseBiz<Returnorders> implements IReturnordersBiz{

	private IReturnordersDao iReturnordersDao;

	public void setiReturnordersDao(IReturnordersDao iReturnordersDao) {
		this.iReturnordersDao = iReturnordersDao;
		super.setiBaseDao(this.iReturnordersDao);
	}
	
	



}
