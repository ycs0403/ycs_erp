package cn.erp.daocommon;

import java.util.List;


/**
 * @author 黑小子-余
  * 创建时间：2019年6月5日 下午5:54:39  
 * @version 1.0 
  * 描述：创建公共的Dao接口层
 */
public interface IBaseDao<T> {
	
	/**
	  * 描述:条件查询、全部列表
	 *@return
	 */
	public List<T> getList(T t1,T t2,Object param);
	
	/**
	 * 描述:分页、条件查询、全部数据列表
	 *@return
	 */
	public List<T> getPageList(T t1,T t2,Object param,int firstResult,int maxResults);

	/**
	 * 描述:统计分页记录个数
	 *@return
	 */
	public long getCount(T t1,T t2,Object param);

	/**
	 * 描述:添加
	 *@return
	 */
	public void add(T t1);

	/**
	 * 描述:删除
	 *@return
	 */
	public void delete(Long id);

	/**
	 * 描述:根据Id查询实体
	 *@return
	 */
	public T getPrimaryId(Long id);

	/**
	 * 描述:修改
	 *@return
	 */
	public void update(T t1);
}
