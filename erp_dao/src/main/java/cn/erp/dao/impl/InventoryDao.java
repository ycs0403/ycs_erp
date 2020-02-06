package cn.erp.dao.impl;

import org.hibernate.criterion.DetachedCriteria;

import cn.erp.dao.IInventoryDao;
import cn.erp.daocommon.impl.BaseDao;
import cn.erp.entity.Inventory;



/**
* @ClassName: InventoryDao
* @author: ycs
* @date: 2019年12月17日 上午10:28:54 
* @Description:盘盈盘亏
*/
public class InventoryDao extends BaseDao<Inventory> implements IInventoryDao{
	/**
	 * 描述:代码优化，升级离线查询，提取为私有公共方法
	 *@return
	 */
	public DetachedCriteria getDetachedCriteria(Inventory inventory,Inventory inventory2,Object param) {
		DetachedCriteria dc=DetachedCriteria.forClass(Inventory.class);
		if(inventory!=null) {

		}
		return dc;
	}
}
