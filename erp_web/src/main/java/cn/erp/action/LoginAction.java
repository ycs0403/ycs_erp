package cn.erp.action;

import com.opensymphony.xwork2.ActionContext;

import cn.erp.actioncommon.BaseAction;
import cn.erp.biz.IEmpBiz;
import cn.erp.common_util.CommonAction;
import cn.erp.common_util.ErpException;
import cn.erp.entity.Emp;

/**
 * @author 黑小子-余
 * 创建时间：2019年7月30日 上午12:24:44  
 * @version 1.0 
 * 描述：登录Action
 */
public class LoginAction extends BaseAction<Emp>{

	private IEmpBiz iEmpBiz;

	public void setiEmpBiz(IEmpBiz iEmpBiz) {
		this.iEmpBiz = iEmpBiz;
		super.setiBaseBiz(this.iEmpBiz);
	}

	private CommonAction<Emp> commonAction=new CommonAction<Emp>();

	private String username;//登录名
	private String pwd;//密码

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	/**
	 * 描述:登录方法
	 * 
	 *@return
	 */
	public void Login() {
		//管理员账号
		String username="admin"; 
		String pwd="admin";

		try {
			Emp emp=iEmpBiz.findByUserNameAndPwd(username, pwd);
			System.out.println("用户名："+username+"密码:"+pwd);
			if(null == emp) {
				commonAction.ajaxReturn(false, "登录失败，用户名或密码错误!");
				throw new ErpException("登录失败"+username+"---"+pwd);
			}
			//保存到session，表示用户已经登陆了
			ActionContext.getContext().getSession().put("user", emp);//将emp对象放入session中
			commonAction.ajaxReturn(true, "登录成功!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			commonAction.ajaxReturn(false, "登录失败!");
		}
	}

	/**
	 * 描述:显示用户名
	 *@return
	 */
	public void showName() {
		Emp emp=(Emp) ActionContext.getContext().getSession().get("user");
		if(emp==null) {
			commonAction.ajaxReturn(false, "");
		}else {
			commonAction.ajaxReturn(true, emp.getName());
		}
	}

	/**
	 * 描述:退出登录
	 *@return
	 */
	public void loginOut() {
		ActionContext.getContext().getSession().remove("user");
	}
}
