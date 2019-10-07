package cn.erp.biz.impl;

import cn.erp.biz.ISupplierBiz;
import cn.erp.bizcommon.impl.BaseBiz;
import cn.erp.dao.ISupplierDao;
import cn.erp.entity.Supplier;

/**
 * @author 黑小子-余
  * 创建时间：2019年8月2日 下午8:09:05  
 * @version 1.0 
  * 描述：
 */
public class SupplierBiz extends BaseBiz<Supplier> implements ISupplierBiz{

	private ISupplierDao iSupplierDao;//注入dao

	public void setiSupplierDao(ISupplierDao iSupplierDao) {
		this.iSupplierDao = iSupplierDao;
		super.setiBaseDao(this.iSupplierDao);
	}

	
}
