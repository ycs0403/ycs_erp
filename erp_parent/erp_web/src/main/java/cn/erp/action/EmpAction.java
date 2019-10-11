package cn.erp.action;

import com.opensymphony.xwork2.ActionContext;

import cn.erp.actioncommon.BaseAction;
import cn.erp.biz.IEmpBiz;
import cn.erp.common.CommonAction;
import cn.erp.common.ErpException;
import cn.erp.entity.Emp;

/**
 * @author 黑小子-余
 * 创建时间：2019年7月4日 下午10:00:08  
 * @version 1.0 
 * 描述：
 */
public class EmpAction extends BaseAction<Emp>{

	private IEmpBiz iEmpBiz;

	public void setiEmpBiz(IEmpBiz iEmpBiz) {
		this.iEmpBiz = iEmpBiz;
		super.setiBaseBiz(this.iEmpBiz);
	}

	private CommonAction<Emp> commonAction=new CommonAction<Emp>();

	@Override
	public Emp getUser() {
		// 获取当前登录用户
		return (Emp) ActionContext.getContext().getSession().get("user");
	}

	private String oldPwd;//原密码
	private String newPwd;//新密码

	public String getOldPwd() {
		return oldPwd;
	}
	public void setOldPwd(String oldPwd) {
		this.oldPwd = oldPwd;
	}
	public String getNewPwd() {
		return newPwd;
	}
	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}

	/**
	  * 描述:用户修改密码
	 *@return
	 */
	public void update_reset() {
		System.out.println("进入方法");
		try {
			iEmpBiz.updatePwd_reset(getId(), newPwd);
			System.out.println("当前用户的id："+getId()+"原密码："+oldPwd+"---新密码："+newPwd);
			commonAction.ajaxReturn(true, "密码修改成功！");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			commonAction.ajaxReturn(false, "密码修改失败！");
		}
	}
	
	/**
	 * 描述:管理员重置密码
	 *@return
	 */
	public void updateUserPwd() {
		try {
			iEmpBiz.updateUserPwd(getUser().getUuid(), oldPwd, newPwd);
			System.out.println("当前用户的id："+getUser().getUuid()+"原密码："+oldPwd+"---新密码："+newPwd);
			commonAction.ajaxReturn(true, "密码修改成功！");
		} catch (ErpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			commonAction.ajaxReturn(false, e.getMessage());
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			commonAction.ajaxReturn(false, "密码修改失败！");
		}
	}
	
	

}
