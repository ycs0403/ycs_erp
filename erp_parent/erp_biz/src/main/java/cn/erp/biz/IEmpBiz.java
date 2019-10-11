package cn.erp.biz;

import cn.erp.bizcommon.IBaseBiz;
import cn.erp.entity.Emp;

/**
 * @author ��С��-��
  * ����ʱ�䣺2019��7��4�� ����11:33:05  
 * @version 1.0 
  * ������
 */
public interface IEmpBiz extends IBaseBiz<Emp>{
	
	/**
	  * ����:��¼��֤�û���������
	 *@return
	 */
	public Emp findByUserNameAndPwd(String userName,String pwd);
	
	/**
	  * ����:�û��޸�����
	 *@return
	 */
	public void updatePwd_reset(Long uuid,String newPwd);
	
	/**
	  * ����:����Ա��������
	 *@return
	 */
	public void updateUserPwd(Long uuid,String oldPwd,String newPwd);
	
}
