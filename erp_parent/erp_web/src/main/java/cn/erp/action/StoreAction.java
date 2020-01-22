package cn.erp.action;

import cn.erp.actioncommon.BaseAction;
import cn.erp.biz.IStoreBiz;
import cn.erp.entity.Emp;
import cn.erp.entity.Store;


/**
* @ClassName: StoreAction
* @author: ycs
* @date: 2019年11月1日 上午10:22:15 
* @Description:仓库
*/
public class StoreAction extends BaseAction<Store>{

	private IStoreBiz iStoreBiz;
	
	public void setiStoreBiz(IStoreBiz iStoreBiz) {
		this.iStoreBiz = iStoreBiz;
		super.setiBaseBiz(this.iStoreBiz);
	}
	
	
	/**   
	 * @Title: myStoreList   
	 * @Description: 只显示当前用户下的仓库 
	 * @param:       
	 * @return: void      
	 * @throws   
	 */ 
	public void myStoreList() { 
		if (null==getT1()) {
			setT1(new Store());
		}
		Emp emp=getUser();
		//查找当前用户下的仓库
		getT1().setEmpuuid(emp.getUuid());
		super.getList();
	}
	
}
