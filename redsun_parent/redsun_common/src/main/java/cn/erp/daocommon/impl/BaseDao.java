package cn.erp.daocommon.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import cn.erp.daocommon.IBaseDao;


/**
 * @author ��С��-��
 * ����ʱ�䣺2019��6��5�� ����6:12:46  
 * @version 1.0 
 * @param <T>
 * �������������ݷ�����
 */
@SuppressWarnings("unchecked")
public class BaseDao<T> extends HibernateDaoSupport implements IBaseDao<T>{
	
	public static String sql="";//����һ������

	private Class<T> entityClass;//T.class��T�����Ƿ��ͣ��ǲ�����class�����

	public BaseDao() {
		Type type=(Type) this.getClass().getGenericSuperclass();//�õ������class�ĸ�һ��Class
		ParameterizedType pType=(ParameterizedType) type;//���Եõ��������͵�Type
		Type[] types=pType.getActualTypeArguments();//�õ����з��͵�����
		entityClass=(Class<T>) types[0];//ȡ��һ�����͵�����
	}

	/**
	 * ����:�����Ż����������߲�ѯ����ȡΪ��������
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
		dc.setProjection(Projections.rowCount());//ͶӰ��ѯ���൱��select count(*)
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