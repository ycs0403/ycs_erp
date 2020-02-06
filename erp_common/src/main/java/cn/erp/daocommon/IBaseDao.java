package cn.erp.daocommon;

import java.util.List;


/**
 * @author ��С��-��
  * ����ʱ�䣺2019��6��5�� ����5:54:39  
 * @version 1.0 
  * ����������������Dao�ӿڲ�
 */
public interface IBaseDao<T> {
	
	/**
	  * ����:������ѯ��ȫ���б�
	 *@return
	 */
	public List<T> getList(T t1,T t2,Object param);
	
	/**
	 * ����:��ҳ��������ѯ��ȫ�������б�
	 *@return
	 */
	public List<T> getPageList(T t1,T t2,Object param,int firstResult,int maxResults);

	/**
	 * ����:ͳ�Ʒ�ҳ��¼����
	 *@return
	 */
	public long getCount(T t1,T t2,Object param);

	/**
	 * ����:���
	 *@return
	 */
	public void add(T t1);

	/**
	 * ����:ɾ��
	 *@return
	 */
	public void delete(Long id);

	/**
	 * ����:����Id��ѯʵ��
	 *@return
	 */
	public T getPrimaryId(Long id);

	/**
	 * ����:�޸�
	 *@return
	 */
	public void update(T t1);
}
