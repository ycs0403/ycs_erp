package cn.erp.dao.impl;

import org.hibernate.criterion.DetachedCriteria;
import cn.erp.dao.IMenuDao;
import cn.erp.daocommon.impl.BaseDao;
import cn.erp.entity.Menu;

/**
 * @author ��С��-��
  * ����ʱ�䣺2019��7��29�� ����11:43:07  
 * @version 1.0 
  * ������
 */
public class MenuDao extends BaseDao<Menu> implements IMenuDao{
	
	public DetachedCriteria getDetachedCriteria(Menu menu1,Menu menu2,Object param){
		DetachedCriteria dc=DetachedCriteria.forClass(Menu.class);
		if(menu1!=null){
			
		}
		return dc;
	}

	@Override
	public Menu getPrimaryId(String id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().get(Menu.class, id);
	}
	
}
