package cn.erp.biz;

import cn.erp.bizcommon.IBaseBiz;
import cn.erp.entity.Menu;

/**
 * @author ��С��-��
  * ����ʱ�䣺2019��7��30�� ����10:47:58  
 * @version 1.0 
  * ������
 */
public interface IMenuBiz extends IBaseBiz<Menu> {

	/**
	 * ����:�����ַ���Id��ѯʵ��
	 *@return
	 */
	public Menu getPrimaryId(String id);
}
