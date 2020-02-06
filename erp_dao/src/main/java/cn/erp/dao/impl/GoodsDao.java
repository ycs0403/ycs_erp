package cn.erp.dao.impl;

import org.hibernate.criterion.DetachedCriteria;
import cn.erp.dao.IGoodsDao;
import cn.erp.daocommon.impl.BaseDao;
import cn.erp.entity.Goods;

/**
 * @author 黑小子-余
  * 创建时间：2019年7月29日 上午11:43:07  
 * @version 1.0 
  * 描述：
 */
public class GoodsDao extends BaseDao<Goods> implements IGoodsDao{
	
	public DetachedCriteria getDetachedCriteria(Goods goods1,Goods goods2,Object param){
		DetachedCriteria dc=DetachedCriteria.forClass(Goods.class);
		if(goods1!=null){
			
		}
		return dc;
	}
	
}
