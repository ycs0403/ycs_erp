package cn.erp.action;

import cn.erp.actioncommon.BaseAction;
import cn.erp.biz.IStoredetailBiz;
import cn.erp.entity.Storedetail;



/**
* @ClassName: StoredetailAction
* @author: ycs
* @date: 2019��12��17�� ����11:00:16 
* @Description:�ֿ���
*/
public class StoredetailAction extends BaseAction<Storedetail>{

	private IStoredetailBiz iStoredetailBiz;

	public void setiStoredetailBiz(IStoredetailBiz iStoredetailBiz) {
		this.iStoredetailBiz = iStoredetailBiz;
		super.setiBaseBiz(this.iStoredetailBiz);
	}
	


}
