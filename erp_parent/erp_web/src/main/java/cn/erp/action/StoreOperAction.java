package cn.erp.action;

import cn.erp.actioncommon.BaseAction;
import cn.erp.biz.IStoreOperBiz;
import cn.erp.entity.Storeoper;


/**
* @ClassName: StoreOperAction
* @author: ycs
* @date: 2019年11月9日 上午12:11:10 
* @Description:仓库操作记录
*/
public class StoreOperAction extends BaseAction<Storeoper>{

	private IStoreOperBiz iStoreOperBiz;

	public void setiStoreOperBiz(IStoreOperBiz iStoreOperBiz) {
		this.iStoreOperBiz = iStoreOperBiz;
		super.setiBaseBiz(this.iStoreOperBiz);
	}
	
	
	
}
