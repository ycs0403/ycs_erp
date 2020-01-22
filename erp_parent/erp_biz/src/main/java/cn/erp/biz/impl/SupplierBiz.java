package cn.erp.biz.impl;

import cn.erp.biz.ISupplierBiz;
import cn.erp.bizcommon.impl.BaseBiz;
import cn.erp.dao.ISupplierDao;
import cn.erp.entity.Supplier;

/**
 * @author ��С��-��
  * ����ʱ�䣺2019��8��2�� ����8:09:05  
 * @version 1.0 
  * ������
 */
public class SupplierBiz extends BaseBiz<Supplier> implements ISupplierBiz{

	private ISupplierDao iSupplierDao;//ע��dao

	public void setiSupplierDao(ISupplierDao iSupplierDao) {
		this.iSupplierDao = iSupplierDao;
		super.setiBaseDao(this.iSupplierDao);
	}

	
}
