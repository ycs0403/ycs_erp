package cn.erp.biz.util;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

/**
 * @ClassName: MailUtil
 * @author: ycs
 * @date: 2020��1��27�� ����9:22:18 
 * @Description:�ʼ�������
 */
public class MailUtil {

	private JavaMailSender javaMailSender;

	public void setJavaMailSender(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}

	private String fromAddress;//������

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	/**
	 * @throws MessagingException    
	 * @Title: sendMail   
	 * @Description: �����ʼ�
	 * @param: @param toAddress
	 * @param: @param subject
	 * @param: @param text      
	 * @return: void      
	 * @throws   
	 */  
	public void sendMail(String toAddress,String subject,String text) throws MessagingException {
		//1. �����ʼ���Ϣ
		MimeMessage mimeMessage=javaMailSender.createMimeMessage();
		//2. ʹ��spring�ʼ�������
		MimeMessageHelper helper=new MimeMessageHelper(mimeMessage);
		//3.�ռ���
		helper.setTo(toAddress);
		//4.������
		helper.setFrom(fromAddress);
		//5.�����ʼ��ı���
		helper.setSubject(subject);
		//6.�ʼ�������
		helper.setText(text);
		
		System.out.println("�����ˣ�"+mimeMessage+"+helper+"+"---"+subject+"---"+fromAddress+"---"+toAddress+"---"+text);
		
		//7.�����ʼ�
		javaMailSender.send(mimeMessage);

		
	}

}
