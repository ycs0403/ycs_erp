package cn.erp.dao.impl;

import org.hibernate.criterion.DetachedCriteria;
import cn.erp.dao.IGoodsTypeDao;
import cn.erp.daocommon.impl.BaseDao;
import cn.erp.entity.GoodsType;

/**
 * @author ��С��-��
  * ����ʱ�䣺2019��7��29�� ����11:43:07  
 * @version 1.0 
  * ������
 */
public class GoodsTypeDao extends BaseDao<GoodsType> implements IGoodsTypeDao{
	
	public DetachedCriteria getDetachedCriteria(GoodsType goodsType1,GoodsType goodsType2,Object param){
		DetachedCriteria dc=DetachedCriteria.forClass(GoodsType.class);
		if(goodsType1!=null){
			
		}
		return dc;
	}
	
}
