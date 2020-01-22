package cn.erp.biz.impl;


import cn.erp.biz.IInventoryBiz;
import cn.erp.bizcommon.impl.BaseBiz;
import cn.erp.dao.IInventoryDao;
import cn.erp.entity.Inventory;



/**
* @ClassName: InventoryBiz
* @author: ycs
* @date: 2019年12月17日 上午10:35:05 
* @Description:盘盈盘亏
*/
public class InventoryBiz extends BaseBiz<Inventory> implements IInventoryBiz{

	private IInventoryDao iInventoryDao;

	public void setiInventoryDao(IInventoryDao iInventoryDao) {
		this.iInventoryDao = iInventoryDao;
		super.setiBaseDao(this.iInventoryDao);
	}
	



}
