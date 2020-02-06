package cn.erp.biz.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.mail.MessagingException;
import cn.erp.biz.IStoredetailBiz;
import cn.erp.biz.util.MailUtil;
import cn.erp.bizcommon.impl.BaseBiz;
import cn.erp.common_util.ErpException;
import cn.erp.dao.IStoredetailDao;
import cn.erp.entity.StoreAlert;
import cn.erp.entity.Storedetail;


/**
 * @ClassName: StoredetailBiz
 * @author: ycs
 * @date: 2019��12��17�� ����10:55:22 
 * @Description:�ֿ���
 */
public class StoredetailBiz extends BaseBiz<Storedetail> implements IStoredetailBiz{

	private IStoredetailDao iStoredetailDao;

	public void setiStoredetailDao(IStoredetailDao iStoredetailDao) {
		this.iStoredetailDao = iStoredetailDao;
		super.setiBaseDao(this.iStoredetailDao);
	}

	/**
	 *���Ԥ���б�
	 */
	@Override
	public List<StoreAlert> getStoreAlertList() {
		// TODO Auto-generated method stub
		return iStoredetailDao.getStoreAlertList();
	}

	
	private MailUtil mailUtil;//�����ʼ�������
	private String toAddress;//�����ʼ�������
	private String subject;//����
	private String mailContent;//�����ʼ�����
	public void setMailUtil(MailUtil mailUtil) {
		this.mailUtil = mailUtil;
	}
	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setMailContent(String mailContent) {
		this.mailContent = mailContent;
	}

	
	/**
	 *���Ϳ��Ԥ�������ʼ�
	 */
	@Override
	public void sendStoreAlertMail() {
		//�õ����Ԥ�������б�
		List<StoreAlert> storeAlerts=iStoredetailDao.getStoreAlertList();
		//�鹵�б�����Ϣ
		if(storeAlerts.size()>0) {
			SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			try {
				mailUtil.sendMail(toAddress, subject.replace("[time]",format.format(new Date())), mailContent.replace("[count]", storeAlerts.size()+""));
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new ErpException("����Ԥ���ʼ�ʧ��");
			}
		}else {
			throw new ErpException("��ǰϵͳû����Ʒ����Ԥ����Ϣ");
		}
	}


}
