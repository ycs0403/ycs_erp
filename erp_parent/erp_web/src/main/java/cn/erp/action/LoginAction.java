package cn.erp.action;

import com.opensymphony.xwork2.ActionContext;

import cn.erp.actioncommon.BaseAction;
import cn.erp.biz.IEmpBiz;
import cn.erp.common.CommonAction;
import cn.erp.entity.Emp;

/**
 * @author ��С��-��
 * ����ʱ�䣺2019��7��30�� ����12:24:44  
 * @version 1.0 
 * ��������¼Action
 */
public class LoginAction extends BaseAction<Emp>{

	private IEmpBiz iEmpBiz;

	public void setiEmpBiz(IEmpBiz iEmpBiz) {
		this.iEmpBiz = iEmpBiz;
		super.setiBaseBiz(this.iEmpBiz);
	}

	private CommonAction<Emp> commonAction=new CommonAction<Emp>();

	private String userName;//��¼��
	private String pwd;//����
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
	 * ����:��¼����-Ӧ�û�ȡ�����ݿ�����룬����ת��
	 *@return
	 */
	public void Login() {
		userName="admin";
		pwd="3ef7164d1f6167cb9f2658c07d3c2f0a";
		
		try {
			Emp emp=iEmpBiz.findByUserNameAndPwd(userName, pwd);
			System.out.println("---"+userName+"***"+pwd);
			if(null == emp) {
				commonAction.ajaxReturn(false, "��¼ʧ�ܣ��û������������!");
				return ;
			}
			//���浽session����ʾ�û��Ѿ���½��
				ActionContext.getContext().getSession().put("user", emp);//��emp�������session��
				commonAction.ajaxReturn(true, "��¼�ɹ�!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			commonAction.ajaxReturn(false, "��¼ʧ��!");
		}
		
	}

	/**
	 * ����:��ʾ�û���
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
	 * ����:�˳���¼
	 *@return
	 */
	public void loginOut() {
		ActionContext.getContext().getSession().remove("user");
	}
}
