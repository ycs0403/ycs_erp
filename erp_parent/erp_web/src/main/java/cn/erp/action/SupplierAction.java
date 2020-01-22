package cn.erp.action;

import cn.erp.actioncommon.BaseAction;
import cn.erp.biz.ISupplierBiz;
import cn.erp.entity.Supplier;

/**
 * @author 黑小子-余
  * 创建时间：2019年8月2日 下午8:12:28  
 * @version 1.0 
  * 描述：供应商
 */
public class SupplierAction extends BaseAction<Supplier>{

	private ISupplierBiz iSupplierBiz;

	public void setiSupplierBiz(ISupplierBiz iSupplierBiz) {
		this.iSupplierBiz = iSupplierBiz;
		super.setiBaseBiz(this.iSupplierBiz);
	}	
	
}
