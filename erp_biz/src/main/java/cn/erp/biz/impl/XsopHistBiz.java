package cn.erp.biz.impl;


import cn.erp.biz.IXsopHistBiz;
import cn.erp.bizcommon.impl.BaseBiz;
import cn.erp.dao.IXsopHistDao;
import cn.erp.entity.XsopHist;



/**
* @ClassName: XsopHistBiz
* @author: ycs
* @date: 2019年12月17日 上午10:42:35 
* @Description:工序完工记录表
*/
public class XsopHistBiz extends BaseBiz<XsopHist> implements IXsopHistBiz{

	private IXsopHistDao iXsopHistDao;

	public void setiXsopHistDao(IXsopHistDao iXsopHistDao) {
		this.iXsopHistDao = iXsopHistDao;
		super.setiBaseDao(this.iXsopHistDao);
	}
	



}
