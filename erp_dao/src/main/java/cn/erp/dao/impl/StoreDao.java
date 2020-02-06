package cn.erp.dao.impl;

import org.hibernate.criterion.DetachedCriteria;

import cn.erp.dao.IStoreDao;
import cn.erp.daocommon.impl.BaseDao;
import cn.erp.entity.Store;


/**
* @ClassName: StoreDao
* @author: ycs
* @date: 2019年11月1日 上午10:16:37 
* @Description:仓库
*/
public class StoreDao extends BaseDao<Store> implements IStoreDao{

	/**
	 * 描述:代码优化，升级离线查询，提取为私有公共方法
	 *@return
	 */
	public DetachedCriteria getDetachedCriteria(Store store,Store store2,Object param) {
		DetachedCriteria dc=DetachedCriteria.forClass(Store.class);
		if(store!=null) {
			
		}
		return dc;
	}
}
