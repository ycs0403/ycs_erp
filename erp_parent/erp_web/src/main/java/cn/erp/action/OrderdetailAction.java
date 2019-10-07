package cn.erp.action;

import cn.erp.actioncommon.BaseAction;
import cn.erp.biz.IOrderdetailBiz;
import cn.erp.entity.Orderdetail;


/**
 * @author ��С��-��
  * ����ʱ�䣺2019��8��5�� ����9:59:24  
 * @version 1.0 
  * ������
 */
public class OrderdetailAction extends BaseAction<Orderdetail>{

	private IOrderdetailBiz iOrderdetailBiz;

	public void setiOrderdetailBiz(IOrderdetailBiz iOrderdetailBiz) {
		this.iOrderdetailBiz = iOrderdetailBiz;
		super.setiBaseBiz(this.iOrderdetailBiz);
	}
	
}
