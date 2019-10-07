package cn.erp.dao.impl;

import org.hibernate.criterion.DetachedCriteria;
import cn.erp.dao.IGoodsTypeDao;
import cn.erp.daocommon.impl.BaseDao;
import cn.erp.entity.GoodsType;

/**
 * @author 黑小子-余
  * 创建时间：2019年7月29日 上午11:43:07  
 * @version 1.0 
  * 描述：
 */
public class GoodsTypeDao extends BaseDao<GoodsType> implements IGoodsTypeDao{
	
	public DetachedCriteria getDetachedCriteria(GoodsType goodsType1,GoodsType goodsType2,Object param){
		DetachedCriteria dc=DetachedCriteria.forClass(GoodsType.class);
		if(goodsType1!=null){
			
		}
		return dc;
	}
	
}
