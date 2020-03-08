package cn.erp.bizcommon.impl;

import java.util.List;

import cn.erp.bizcommon.IBaseBiz;
import cn.erp.daocommon.IBaseDao;

/**
 * @author 黑小子-余
 * 创建时间：2019年6月5日 下午8:59:49  
 * @version 1.0 
 * 描述：
 */
public class BaseBiz<T> implements IBaseBiz<T>{

	private IBaseDao<T> iBaseDao;//注入IBaseDao
	
	public void setiBaseDao(IBaseDao<T> iBaseDao) {
		this.iBaseDao = iBaseDao;
	}
	

	public List<T> getList(T t1, T t2, Object param) {
		// TODO Auto-generated method stub
		return iBaseDao.getList(t1, t2, param);
	}
	public List<T> getPageList(T t1, T t2, Object param, int firstResult, int maxResults) {
		// TODO Auto-generated method stub
		return iBaseDao.getPageList(t1, t2, param, firstResult, maxResults);
	}
	public long getCount(T t1, T t2, Object param) {
		// TODO Auto-generated method stub
		return 0;
	}
	public void add(T t1) {
		// TODO Auto-generated method stub
		iBaseDao.add(t1);
	}
	public void delete(Long id) {
		iBaseDao.delete(id);
	}
	public T getPrimaryId(Long id) {
		// TODO Auto-generated method stub
		return iBaseDao.getPrimaryId(id);
	}
	public void update(T t1) {
		// TODO Auto-generated method stub
		iBaseDao.update(t1);
	}

}
