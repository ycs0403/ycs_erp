package cn.erp.action;

import cn.erp.actioncommon.BaseAction;
import cn.erp.biz.IReturnorderdetailBiz;
import cn.erp.entity.Returnorderdetail;



/**
* @ClassName: ReturnorderdetailAction
* @author: ycs
* @date: 2019��12��19�� ����11:02:33 
* @Description:�˻�������ϸ
*/
public class ReturnorderdetailAction extends BaseAction<Returnorderdetail>{

	private IReturnorderdetailBiz iReturnorderdetailBiz;

	public void setiReturnorderdetailBiz(IReturnorderdetailBiz iReturnorderdetailBiz) {
		this.iReturnorderdetailBiz = iReturnorderdetailBiz;
		super.setiBaseBiz(this.iReturnorderdetailBiz);
	}
	


}
