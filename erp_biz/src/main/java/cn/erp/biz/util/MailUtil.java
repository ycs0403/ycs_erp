package cn.erp.biz.util;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

/**
 * @ClassName: MailUtil
 * @author: ycs
 * @date: 2020年1月27日 下午9:22:18 
 * @Description:邮件工具类
 */
public class MailUtil {

	private JavaMailSender javaMailSender;

	public void setJavaMailSender(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}

	private String fromAddress;//发件人

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	/**
	 * @throws MessagingException    
	 * @Title: sendMail   
	 * @Description: 发送邮件
	 * @param: @param toAddress
	 * @param: @param subject
	 * @param: @param text      
	 * @return: void      
	 * @throws   
	 */  
	public void sendMail(String toAddress,String subject,String text) throws MessagingException {
		//1. 创建邮件信息
		MimeMessage mimeMessage=javaMailSender.createMimeMessage();
		//2. 使用spring邮件工具类
		MimeMessageHelper helper=new MimeMessageHelper(mimeMessage);
		//3.收件人
		helper.setTo(toAddress);
		//4.发件人
		helper.setFrom(fromAddress);
		//5.设置邮件的标题
		helper.setSubject(subject);
		//6.邮件的内容
		helper.setText(text);
		
		System.out.println("进入了："+mimeMessage+"+helper+"+"---"+subject+"---"+fromAddress+"---"+toAddress+"---"+text);
		
		//7.发送邮件
		javaMailSender.send(mimeMessage);

		
	}

}
