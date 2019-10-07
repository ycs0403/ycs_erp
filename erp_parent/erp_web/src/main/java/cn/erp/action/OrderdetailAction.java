package cn.erp.action;

import cn.erp.actioncommon.BaseAction;
import cn.erp.biz.IOrderdetailBiz;
import cn.erp.entity.Orderdetail;


/**
 * @author 黑小子-余
  * 创建时间：2019年8月5日 下午9:59:24  
 * @version 1.0 
  * 描述：
 */
public class OrderdetailAction extends BaseAction<Orderdetail>{

	private IOrderdetailBiz iOrderdetailBiz;

	public void setiOrderdetailBiz(IOrderdetailBiz iOrderdetailBiz) {
		this.iOrderdetailBiz = iOrderdetailBiz;
		super.setiBaseBiz(this.iOrderdetailBiz);
	}
	
}
