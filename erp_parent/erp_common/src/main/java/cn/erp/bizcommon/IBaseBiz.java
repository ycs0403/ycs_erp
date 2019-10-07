package cn.erp.bizcommon;

import java.util.List;

/**
 * @author ��С��-��
  * ����ʱ�䣺2019��7��23�� ����7:23:55  
 * @version 1.0 
  * ����������������Biz�ӿڲ�
 */
public interface IBaseBiz<T> {
	
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
