package cn.erp.dao.impl;

import org.hibernate.criterion.DetachedCriteria;

import cn.erp.dao.IStoreOperDao;
import cn.erp.daocommon.impl.BaseDao;
import cn.erp.entity.Storeoper;

/**
* @ClassName: StoreOperDao
* @author: ycs
* @date: 2019年11月9日 上午12:07:46 
* @Description:仓库操作记录
*/
public class StoreOperDao extends BaseDao<Storeoper> implements IStoreOperDao{

	/**
	 * 描述:代码优化，升级离线查询，提取为私有公共方法
	 *@return
	 */
	public DetachedCriteria getDetachedCriteria(Storeoper storeOper,Storeoper storeOper2,Object param) {
		DetachedCriteria dc=DetachedCriteria.forClass(Storeoper.class);
		if(storeOper!=null) {
			
		}
		return dc;
	}
}
