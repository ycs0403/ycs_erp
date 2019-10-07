package cn.erp.dao;

import cn.erp.daocommon.IBaseDao;
import cn.erp.entity.Emp;


/**
 * @author 黑小子-余
  * 创建时间：2019年7月4日 下午11:30:39  
 * @version 1.0 
  * 描述：
 */
public interface IEmpDao extends IBaseDao<Emp>{
	
	/**
	  * 描述:根据用户名和密码查询登录信息
	 *@return
	 */
	public Emp findByUserNameAndPwd(String userName,String pwd);

}
