package cn.erp.dao;

import cn.erp.daocommon.IBaseDao;
import cn.erp.entity.Emp;


/**
 * @author ��С��-��
  * ����ʱ�䣺2019��7��4�� ����11:30:39  
 * @version 1.0 
  * ������
 */
public interface IEmpDao extends IBaseDao<Emp>{
	
	/**
	  * ����:�����û����������ѯ��¼��Ϣ
	 *@return
	 */
	public Emp findByUserNameAndPwd(String userName,String pwd);

}
