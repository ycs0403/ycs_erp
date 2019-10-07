package cn.erp.action;

import com.alibaba.fastjson.JSON;

import cn.erp.actioncommon.BaseAction;
import cn.erp.biz.IMenuBiz;
import cn.erp.common.CommonAction;
import cn.erp.entity.Menu;

/**
 * @author 黑小子-余
  * 创建时间：2019年7月30日 上午10:53:51  
 * @version 1.0 
  * 描述：
 */
public class MenuAction extends BaseAction<Menu>{

	private IMenuBiz iMenuBiz;

	public void setiMenuBiz(IMenuBiz iMenuBiz) {
		this.iMenuBiz = iMenuBiz;
		super.setiBaseBiz(this.iMenuBiz);
	}
	
	private CommonAction<Menu> commonAction=new CommonAction<Menu>();
	
	/**
	  * 描述:读取全部菜单
	 *@return
	 */
	public void getMenuTree() {
		Menu menu=iMenuBiz.getPrimaryId("0");//0是父菜单
		String jsonString =JSON.toJSONString(menu,true);//true表示格式化输出json
		commonAction.write(jsonString);
	}

}
