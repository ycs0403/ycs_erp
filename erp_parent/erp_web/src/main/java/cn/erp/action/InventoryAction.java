package cn.erp.action;

import cn.erp.actioncommon.BaseAction;
import cn.erp.biz.IInventoryBiz;
import cn.erp.entity.Inventory;



/**
* @ClassName: InventoryAction
* @author: ycs
* @date: 2019年12月17日 上午10:58:10 
* @Description:盘盈盘亏
*/
public class InventoryAction extends BaseAction<Inventory>{

	private IInventoryBiz iInventoryBiz;

	public void setiInventoryBiz(IInventoryBiz iInventoryBiz) {
		this.iInventoryBiz = iInventoryBiz;
		super.setiBaseBiz(this.iInventoryBiz);
	}
	


}
