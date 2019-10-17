package cn.erp.biz.impl;

import org.apache.shiro.crypto.hash.Md5Hash;

import cn.erp.biz.IEmpBiz;
import cn.erp.bizcommon.impl.BaseBiz;
import cn.erp.common_util.ErpException;
import cn.erp.dao.IEmpDao;
import cn.erp.entity.Emp;

/**
 * @author ��С��-��
 * ����ʱ�䣺2019��7��4�� ����10:36:11  
 * @version 1.0 
 * ������
 */
public class EmpBiz extends BaseBiz<Emp> implements IEmpBiz{

	private IEmpDao iEmpDao;

	public void setiEmpDao(IEmpDao iEmpDao) {
		this.iEmpDao = iEmpDao;
		super.setiBaseDao(this.iEmpDao);
	}
	
	

	/**
	 * �����û����������ѯ�û�ʵ��
	 */
	@Override
	public Emp findByUserNameAndPwd(String userName, String pwd) {
		// ��������м���
		Md5Hash md5=new Md5Hash(userName,pwd,2);
		return iEmpDao.findByUserNameAndPwd(userName,md5.toString());
	}

	/**
	 * ����Ա��-md5-shiro��ȫ����������
	 */
	@Override
	public void add(Emp emp) {
		//������
		String salt=emp.getUsername();
		//����1��ԭʼ����   ����2����  ����3��ɢ�д���
		Md5Hash md5=new Md5Hash(emp.getPwd(),salt,2);
		
		//����������Ա��ʱ����һ��Ĭ�����룺��ǰ��¼�û���
		//Md5Hash md5=new Md5Hash(emp.getUsername(),emp.getUsername(),2);
		
		//���ü��ܿ���
		emp.setPwd(md5.toString());
		iEmpDao.add(emp);
	}
	
	/**
	 *����Ա�����û�����
	 */
	@Override
	public void updatePwd_reset(Long uuid, String newPwd) {
		Emp emp=iEmpDao.getPrimaryId(uuid);
		//����������
		Md5Hash md5_2=new Md5Hash(newPwd,emp.getUsername(),2);
		emp.setPwd(md5_2.toString());
		iEmpDao.updatePwd_reset(uuid, newPwd);
	}

	private EmpBiz empBiz=null;
	
	/**
	  * Ա���޸�����
	 *@param uuid   �û�id
	 *@param oldPwd ԭ����
	 *@param newPwd ������
	 */
	@Override
	public void updateUserPwd(Long uuid, String oldPwd, String newPwd) {
		Emp emp=iEmpDao.getPrimaryId(uuid);//�õ���ǰ�û���uuid
		//����ԭ����
		Md5Hash md5_1=new Md5Hash(oldPwd,emp.getUsername(),2);
		if(!emp.getPwd().equals(md5_1.toString())) {
			throw new ErpException("ԭ���벻��ȷ");
		}
		//����������
		iEmpDao.updatePwd_reset(uuid, empBiz.encrypt(newPwd,emp.getUsername()));
		
	}
	
	private int hashIterations = 2;
	
	/**
	 * ����
	 * @param source
	 * @param salt
	 * @return
	 */
	private String encrypt(String source, String salt){
		Md5Hash md5 = new Md5Hash(source, salt, hashIterations);
		return md5.toString();
	}

}
