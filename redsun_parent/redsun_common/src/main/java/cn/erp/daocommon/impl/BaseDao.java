package cn.erp.daocommon.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import cn.erp.daocommon.IBaseDao;


/**
 * @author 黑小子-余
 * 创建时间：2019年6月5日 下午6:12:46  
 * @version 1.0 
 * @param <T>
 * 描述：公共数据访问类
 */
@SuppressWarnings("unchecked")
public class BaseDao<T> extends HibernateDaoSupport implements IBaseDao<T>{
	
	public static String sql="";//定义一个常量

	private Class<T> entityClass;//T.class，T本身是泛型，是不能做class处理的

	public BaseDao() {
		Type type=(Type) this.getClass().getGenericSuperclass();//得到子类的class的父一级Class
		ParameterizedType pType=(ParameterizedType) type;//可以得到泛型类型的Type
		Type[] types=pType.getActualTypeArguments();//得到所有泛型的类型
		entityClass=(Class<T>) types[0];//取第一个泛型的类型
	}

	/**
	 * 描述:代码优化，升级离线查询，提取为公共方法
	 *@return
	 */
	public DetachedCriteria getDetachedCriteria(T t1,T t2,Object param) {
		return null;
	}

	public List<T> getList(T t1,T t2,Object param) {
		DetachedCriteria dc=getDetachedCriteria(t1, t2, param);
		return (List<T>) this.getHibernateTemplate().findByCriteria(dc);
	}

	public List<T> getPageList(T t1,T t2, Object param, int firstResult, int maxResults) {
		DetachedCriteria dc=getDetachedCriteria(t1, t2, param);
		return (List<T>) this.getHibernateTemplate().findByCriteria(dc,firstResult,maxResults);
	}

	public long getCount(T t1,T t2, Object param) {
		DetachedCriteria dc=getDetachedCriteria(t1, t2, param);
		dc.setProjection(Projections.rowCount());//投影查询，相当于select count(*)
		List<Long> list=(List<Long>) this.getHibernateTemplate().findByCriteria(dc);
		return list.get(0);
	}

	public void add(T t1) {
		this.getHibernateTemplate().save(t1);
	}

	public void delete(Long id) {
		T t= getHibernateTemplate().get(entityClass, id);
		this.getHibernateTemplate().delete(t);
	}

	public T getPrimaryId(Long id) {
		return getHibernateTemplate().get(entityClass, id);
	}

	public void update(T t1) {
		this.getHibernateTemplate().saveOrUpdate(t1);
	}

}