package cn.erp.dao.impl;

import org.hibernate.criterion.DetachedCriteria;
import cn.erp.dao.IGoodsDao;
import cn.erp.daocommon.impl.BaseDao;
import cn.erp.entity.Goods;

/**
 * @author ��С��-��
  * ����ʱ�䣺2019��7��29�� ����11:43:07  
 * @version 1.0 
  * ������
 */
public class GoodsDao extends BaseDao<Goods> implements IGoodsDao{
	
	public DetachedCriteria getDetachedCriteria(Goods goods1,Goods goods2,Object param){
		DetachedCriteria dc=DetachedCriteria.forClass(Goods.class);
		if(goods1!=null){
			
		}
		return dc;
	}
	
}
