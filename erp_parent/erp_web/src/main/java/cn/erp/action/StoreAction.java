package cn.erp.action;

import cn.erp.actioncommon.BaseAction;
import cn.erp.biz.IStoreBiz;
import cn.erp.entity.Emp;
import cn.erp.entity.Store;


/**
* @ClassName: StoreAction
* @author: ycs
* @date: 2019��11��1�� ����10:22:15 
* @Description:�ֿ�
*/
public class StoreAction extends BaseAction<Store>{

	private IStoreBiz iStoreBiz;
	
	public void setiStoreBiz(IStoreBiz iStoreBiz) {
		this.iStoreBiz = iStoreBiz;
		super.setiBaseBiz(this.iStoreBiz);
	}
	
	
	/**   
	 * @Title: myStoreList   
	 * @Description: ֻ��ʾ��ǰ�û��µĲֿ� 
	 * @param:       
	 * @return: void      
	 * @throws   
	 */ 
	public void myStoreList() { 
		if (null==getT1()) {
			setT1(new Store());
		}
		Emp emp=getUser();
		//���ҵ�ǰ�û��µĲֿ�
		getT1().setEmpuuid(emp.getUuid());
		super.getList();
	}
	
}
