package cn.erp.dao.impl;

import org.hibernate.criterion.DetachedCriteria;

import cn.erp.dao.IStoredetailDao;
import cn.erp.daocommon.impl.BaseDao;
import cn.erp.entity.Storedetail;



/**
* @ClassName: StoredetailDao
* @author: ycs
* @date: 2019年12月17日 上午10:21:02 
* @Description:仓库库存
*/
public class StoredetailDao extends BaseDao<Storedetail> implements IStoredetailDao{
	/**
	 * 描述:代码优化，升级离线查询，提取为私有公共方法
	 *@return
	 */
	public DetachedCriteria getDetachedCriteria(Storedetail storedetail,Storedetail storedetail2,Object param) {
		DetachedCriteria dc=DetachedCriteria.forClass(Storedetail.class);
		if(storedetail!=null) {

		}
		return dc;
	}
}
