package cn.erp.action;

import cn.erp.actioncommon.BaseAction;
import cn.erp.biz.ISupplierBiz;
import cn.erp.entity.Supplier;

/**
 * @author ��С��-��
  * ����ʱ�䣺2019��8��2�� ����8:12:28  
 * @version 1.0 
  * ��������Ӧ��
 */
public class SupplierAction extends BaseAction<Supplier>{

	private ISupplierBiz iSupplierBiz;

	public void setiSupplierBiz(ISupplierBiz iSupplierBiz) {
		this.iSupplierBiz = iSupplierBiz;
		super.setiBaseBiz(this.iSupplierBiz);
	}	
	
}
