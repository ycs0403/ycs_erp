package cn.erp.dao;

import cn.erp.daocommon.IBaseDao;
import cn.erp.entity.Menu;

/**
 * @author ��С��-��
  * ����ʱ�䣺2019��7��30�� ����10:45:18  
 * @version 1.0 
  * ������
 */
public interface IMenuDao extends IBaseDao<Menu> {

	/**
	 * ����:�����ַ���Id��ѯʵ��
	 *@return
	 */
	public Menu getPrimaryId(String id);
	
}
