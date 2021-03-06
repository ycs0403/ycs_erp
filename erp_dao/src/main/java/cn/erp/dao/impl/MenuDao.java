package cn.erp.dao.impl;

import org.hibernate.criterion.DetachedCriteria;

import cn.erp.dao.IMenuDao;
import cn.erp.daocommon.impl.BaseDao;
import cn.erp.entity.Menu;

/**
 * @author 黑小子-余
  * 创建时间：2019年7月29日 上午11:43:07  
 * @version 1.0 
  * 描述：菜单管理
 */
public class MenuDao extends BaseDao<Menu> implements IMenuDao{
	
	public DetachedCriteria getDetachedCriteria(Menu menu1,Menu menu2,Object param){
		DetachedCriteria dc=DetachedCriteria.forClass(Menu.class);
		if(menu1!=null){
			//dc.addOrder(Order.desc("menuid"));
		}
		return dc;
	}

	@Override
	public Menu getPrimaryId(Long id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().get(Menu.class, id);
	}

	
	/*待用
	 * @SuppressWarnings("unchecked")
	 * 
	 * @Override public List<Menu> getPageList(Menu t1, Menu t2, Object param, int
	 * firstResult, int maxResults) { sql="from Menu t order by t.menuid asc";
	 * List<Menu> list=(List<Menu>) getHibernateTemplate().find(sql,
	 * t1,t2,firstResult,maxResults); return list;
	 * 
	 * }
	 */
	
}
