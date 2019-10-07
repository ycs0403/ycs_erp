package cn.erp.action;

import com.opensymphony.xwork2.ActionContext;

import cn.erp.actioncommon.BaseAction;
import cn.erp.biz.IEmpBiz;
import cn.erp.common.CommonAction;
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

	private String userName;//登录名
	private String pwd;//密码
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	/**
	 * 描述:登录方法-应该获取到数据库的密码，并且转换
	 *@return
	 */
	public void Login() {
		userName="admin";
		pwd="3ef7164d1f6167cb9f2658c07d3c2f0a";
		
		try {
			Emp emp=iEmpBiz.findByUserNameAndPwd(userName, pwd);
			System.out.println("---"+userName+"***"+pwd);
			if(null == emp) {
				commonAction.ajaxReturn(false, "登录失败，用户名或密码错误!");
				return ;
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
