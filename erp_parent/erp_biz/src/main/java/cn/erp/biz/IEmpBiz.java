package cn.erp.biz;

import cn.erp.bizcommon.IBaseBiz;
import cn.erp.entity.Emp;

/**
 * @author 黑小子-余
  * 创建时间：2019年7月4日 下午11:33:05  
 * @version 1.0 
  * 描述：
 */
public interface IEmpBiz extends IBaseBiz<Emp>{
	
	/**
	  * 描述:登录验证用户名和密码
	 *@return
	 */
	public Emp findByUserNameAndPwd(String userName,String pwd);
	
	/**
	  * 描述:用户修改密码
	 *@return
	 */
	public void updatePwd_reset(Long uuid,String newPwd);
	
	/**
	  * 描述:管理员重置密码
	 *@return
	 */
	public void updateUserPwd(Long uuid,String oldPwd,String newPwd);
	
}
