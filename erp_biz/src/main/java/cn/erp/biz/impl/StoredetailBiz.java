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
 * @date: 2019年12月17日 上午10:55:22 
 * @Description:仓库库存
 */
public class StoredetailBiz extends BaseBiz<Storedetail> implements IStoredetailBiz{

	private IStoredetailDao iStoredetailDao;

	public void setiStoredetailDao(IStoredetailDao iStoredetailDao) {
		this.iStoredetailDao = iStoredetailDao;
		super.setiBaseDao(this.iStoredetailDao);
	}

	/**
	 *库存预警列表
	 */
	@Override
	public List<StoreAlert> getStoreAlertList() {
		// TODO Auto-generated method stub
		return iStoredetailDao.getStoreAlertList();
	}

	
	private MailUtil mailUtil;//导入邮件工具类
	private String toAddress;//报警邮件接收人
	private String subject;//主体
	private String mailContent;//发送邮件内容
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
	 *发送库存预警警告邮件
	 */
	@Override
	public void sendStoreAlertMail() {
		//得到库存预警警告列表
		List<StoreAlert> storeAlerts=iStoredetailDao.getStoreAlertList();
		//乳沟有报警信息
		if(storeAlerts.size()>0) {
			SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			try {
				mailUtil.sendMail(toAddress, subject.replace("[time]",format.format(new Date())), mailContent.replace("[count]", storeAlerts.size()+""));
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new ErpException("发送预警邮件失败");
			}
		}else {
			throw new ErpException("当前系统没有商品发生预警信息");
		}
	}


}
