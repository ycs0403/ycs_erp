package cn.erp.biz;

import cn.erp.bizcommon.IBaseBiz;
import cn.erp.entity.Menu;

/**
 * @author 黑小子-余
  * 创建时间：2019年7月30日 上午10:47:58  
 * @version 1.0 
  * 描述：
 */
public interface IMenuBiz extends IBaseBiz<Menu> {

	/**
	 * 描述:根据字符串Id查询实体
	 *@return
	 */
	public Menu getPrimaryId(String id);
}
