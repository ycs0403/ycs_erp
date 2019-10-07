package cn.erp.action;

import com.alibaba.fastjson.JSON;

import cn.erp.actioncommon.BaseAction;
import cn.erp.biz.IMenuBiz;
import cn.erp.common.CommonAction;
import cn.erp.entity.Menu;

/**
 * @author ��С��-��
  * ����ʱ�䣺2019��7��30�� ����10:53:51  
 * @version 1.0 
  * ������
 */
public class MenuAction extends BaseAction<Menu>{

	private IMenuBiz iMenuBiz;

	public void setiMenuBiz(IMenuBiz iMenuBiz) {
		this.iMenuBiz = iMenuBiz;
		super.setiBaseBiz(this.iMenuBiz);
	}
	
	private CommonAction<Menu> commonAction=new CommonAction<Menu>();
	
	/**
	  * ����:��ȡȫ���˵�
	 *@return
	 */
	public void getMenuTree() {
		Menu menu=iMenuBiz.getPrimaryId("0");//0�Ǹ��˵�
		String jsonString =JSON.toJSONString(menu,true);//true��ʾ��ʽ�����json
		commonAction.write(jsonString);
	}

}
