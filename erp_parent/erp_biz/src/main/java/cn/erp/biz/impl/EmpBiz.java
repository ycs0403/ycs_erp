package cn.erp.biz.impl;

import org.apache.shiro.crypto.hash.Md5Hash;

import cn.erp.biz.IEmpBiz;
import cn.erp.bizcommon.impl.BaseBiz;
import cn.erp.common_util.ErpException;
import cn.erp.dao.IEmpDao;
import cn.erp.entity.Emp;

/**
 * @author 黑小子-余
 * 创建时间：2019年7月4日 下午10:36:11  
 * @version 1.0 
 * 描述：
 */
public class EmpBiz extends BaseBiz<Emp> implements IEmpBiz{

	private IEmpDao iEmpDao;

	public void setiEmpDao(IEmpDao iEmpDao) {
		this.iEmpDao = iEmpDao;
		super.setiBaseDao(this.iEmpDao);
	}
	
	

	/**
	 * 根据用户名和密码查询用户实体
	 */
	@Override
	public Emp findByUserNameAndPwd(String userName, String pwd) {
		// 对密码进行加密
		Md5Hash md5=new Md5Hash(userName,pwd,2);
		return iEmpDao.findByUserNameAndPwd(userName,md5.toString());
	}

	/**
	 * 新增员工-md5-shiro安全框架密码加密
	 */
	@Override
	public void add(Emp emp) {
		//设置盐
		String salt=emp.getUsername();
		//参数1：原始密码   参数2：盐  参数3：散列次数
		Md5Hash md5=new Md5Hash(emp.getPwd(),salt,2);
		
		//我们在新增员工时给他一个默认密码：当前登录用户名
		//Md5Hash md5=new Md5Hash(emp.getUsername(),emp.getUsername(),2);
		
		//设置加密口令
		emp.setPwd(md5.toString());
		iEmpDao.add(emp);
	}
	
	/**
	 *管理员重置用户密码
	 */
	@Override
	public void updatePwd_reset(Long uuid, String newPwd) {
		Emp emp=iEmpDao.getPrimaryId(uuid);
		//保存新密码
		Md5Hash md5_2=new Md5Hash(newPwd,emp.getUsername(),2);
		emp.setPwd(md5_2.toString());
		iEmpDao.updatePwd_reset(uuid, newPwd);
	}

	private EmpBiz empBiz=null;
	
	/**
	  * 员工修改密码
	 *@param uuid   用户id
	 *@param oldPwd 原密码
	 *@param newPwd 新密码
	 */
	@Override
	public void updateUserPwd(Long uuid, String oldPwd, String newPwd) {
		Emp emp=iEmpDao.getPrimaryId(uuid);//拿到当前用户的uuid
		//加密原密码
		Md5Hash md5_1=new Md5Hash(oldPwd,emp.getUsername(),2);
		if(!emp.getPwd().equals(md5_1.toString())) {
			throw new ErpException("原密码不正确");
		}
		//加密新密码
		iEmpDao.updatePwd_reset(uuid, empBiz.encrypt(newPwd,emp.getUsername()));
		
	}
	
	private int hashIterations = 2;
	
	/**
	 * 加密
	 * @param source
	 * @param salt
	 * @return
	 */
	private String encrypt(String source, String salt){
		Md5Hash md5 = new Md5Hash(source, salt, hashIterations);
		return md5.toString();
	}

}
