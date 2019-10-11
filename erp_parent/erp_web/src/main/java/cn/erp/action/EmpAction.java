package cn.erp.action;

import com.opensymphony.xwork2.ActionContext;

import cn.erp.actioncommon.BaseAction;
import cn.erp.biz.IEmpBiz;
import cn.erp.common.CommonAction;
import cn.erp.common.ErpException;
import cn.erp.entity.Emp;

/**
 * @author ��С��-��
 * ����ʱ�䣺2019��7��4�� ����10:00:08  
 * @version 1.0 
 * ������
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
		// ��ȡ��ǰ��¼�û�
		return (Emp) ActionContext.getContext().getSession().get("user");
	}

	private String oldPwd;//ԭ����
	private String newPwd;//������

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
	  * ����:�û��޸�����
	 *@return
	 */
	public void update_reset() {
		System.out.println("���뷽��");
		try {
			iEmpBiz.updatePwd_reset(getId(), newPwd);
			System.out.println("��ǰ�û���id��"+getId()+"ԭ���룺"+oldPwd+"---�����룺"+newPwd);
			commonAction.ajaxReturn(true, "�����޸ĳɹ���");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			commonAction.ajaxReturn(false, "�����޸�ʧ�ܣ�");
		}
	}
	
	/**
	 * ����:����Ա��������
	 *@return
	 */
	public void updateUserPwd() {
		try {
			iEmpBiz.updateUserPwd(getUser().getUuid(), oldPwd, newPwd);
			System.out.println("��ǰ�û���id��"+getUser().getUuid()+"ԭ���룺"+oldPwd+"---�����룺"+newPwd);
			commonAction.ajaxReturn(true, "�����޸ĳɹ���");
		} catch (ErpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			commonAction.ajaxReturn(false, e.getMessage());
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			commonAction.ajaxReturn(false, "�����޸�ʧ�ܣ�");
		}
	}
	
	

}
