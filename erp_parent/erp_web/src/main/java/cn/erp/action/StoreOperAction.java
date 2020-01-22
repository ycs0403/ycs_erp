package cn.erp.action;

import cn.erp.actioncommon.BaseAction;
import cn.erp.biz.IStoreOperBiz;
import cn.erp.entity.Storeoper;


/**
* @ClassName: StoreOperAction
* @author: ycs
* @date: 2019��11��9�� ����12:11:10 
* @Description:�ֿ������¼
*/
public class StoreOperAction extends BaseAction<Storeoper>{

	private IStoreOperBiz iStoreOperBiz;

	public void setiStoreOperBiz(IStoreOperBiz iStoreOperBiz) {
		this.iStoreOperBiz = iStoreOperBiz;
		super.setiBaseBiz(this.iStoreOperBiz);
	}
	
	
	
}
