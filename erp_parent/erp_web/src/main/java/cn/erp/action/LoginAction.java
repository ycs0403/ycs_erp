package cn.erp.action;

import com.opensymphony.xwork2.ActionContext;

import cn.erp.actioncommon.BaseAction;
import cn.erp.biz.IEmpBiz;
import cn.erp.common_util.CommonAction;
import cn.erp.common_util.ErpException;
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

	private String username;//��¼��
	private String pwd;//����

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
	 * ����:��¼����
	 * 
	 *@return
	 */
	public void Login() {
		//����Ա�˺�
		String username="admin"; 
		String pwd="admin";

		try {
			Emp emp=iEmpBiz.findByUserNameAndPwd(username, pwd);
			System.out.println("�û�����"+username+"����:"+pwd);
			if(null == emp) {
				commonAction.ajaxReturn(false, "��¼ʧ�ܣ��û������������!");
				throw new ErpException("��¼ʧ��"+username+"---"+pwd);
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
