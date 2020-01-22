package cn.erp.action;

import cn.erp.actioncommon.BaseAction;
import cn.erp.biz.IReturnordersBiz;
import cn.erp.entity.Returnorders;



/**
* @ClassName: ReturnordersAction
* @author: ycs
* @date: 2019年12月19日 上午11:01:13 
* @Description:退货订单
*/
public class ReturnordersAction extends BaseAction<Returnorders>{

	private IReturnordersBiz iReturnordersBiz;

	public void setiReturnordersBiz(IReturnordersBiz iReturnordersBiz) {
		this.iReturnordersBiz = iReturnordersBiz;
		super.setiBaseBiz(this.iReturnordersBiz);
	}
	
	


}
