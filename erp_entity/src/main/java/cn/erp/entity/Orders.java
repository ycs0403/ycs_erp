/*
 * Welcome to use the TableGo Tools.
 * 
 * http://vipbooks.iteye.com
 * http://blog.csdn.net/vipbooks
 * http://www.cnblogs.com/vipbooks
 * 
 * Author:bianj
 * Email:edinsker@163.com
 * Version:5.8.8
 */

/****************************************************************
 **��  ����Orders
 **��  ��������
 **�����ߣ�changsheng-yu
 **����ʱ�䣺2019-07-2911:08:24
 ****************************************************************/

package cn.erp.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *����(orders)
 *
 *@author changsheng-yu
 */
@Entity
@Table(name = "orders")
public class Orders implements java.io.Serializable {
	/** �汾�� */
	private static final long serialVersionUID = -3615693274737621297L;

	/** δ��� */
	public static final String STATE_CREATE = "0";
	/** ����� */
	public static final String STATE_CHECK = "1";
	/** ��ȷ�� */
	public static final String STATE_START = "2";
	/** ����� */
	public static final String STATE_END = "3";
	
	/** �ɹ����� */
	public static final String TYPE_IN = "1";
	/** ���۶��� */
	public static final String TYPE_OUT = "2";
	
	/** ��� */
	@Id
	@Column(name = "uuid", unique = true, nullable = false)
	private Long uuid;

	/** �������� */
	@Column(name = "createtime", nullable = true, length = 7)
	private Date createtime;

	/** ������� */
	@Column(name = "checktime", nullable = true, length = 7)
	private Date checktime;

	/** ȷ������ */
	@Column(name = "starttime", nullable = true, length = 7)
	private Date starttime;

	/** ����������� */
	@Column(name = "endtime", nullable = true, length = 7)
	private Date endtime;

	/** 1:�ɹ� 2:���� */
	@Column(name = "type", nullable = true, length = 1)
	private String type;

	/** �µ�Ա */
	@Column(name = "creater", nullable = true)
	private Long creater;

	/** ���Ա */
	@Column(name = "checker", nullable = true)
	private Long checker;

	/** �ɹ�Ա */
	@Column(name = "starter", nullable = true)
	private Long starter;

	/** ���Ա */
	@Column(name = "ender", nullable = true)
	private Long ender;

	/** ��Ӧ�̻�ͻ� */
	@Column(name = "supplieruuid", nullable = true)
	private Long supplieruuid;
	
	private String createrName;//�µ�Ա����
	private String checkerName;//���Ա����
	private String starterName;//�ɹ�Ա����
	private String enderName;//���Ա����
	private String supplierName;//��Ӧ�̻�ͻ�����
	public String getCreaterName() {
		return createrName;
	}
	public void setCreaterName(String createrName) {
		this.createrName = createrName;
	}
	public String getCheckerName() {
		return checkerName;
	}
	public void setCheckerName(String checkerName) {
		this.checkerName = checkerName;
	}
	public String getStarterName() {
		return starterName;
	}
	public void setStarterName(String starterName) {
		this.starterName = starterName;
	}
	public String getEnderName() {
		return enderName;
	}
	public void setEnderName(String enderName) {
		this.enderName = enderName;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	/** �ϼƽ�� */
	@Column(name = "totalmoney", nullable = true, length = 10)
	private double totalmoney;

	/** �ɹ�: 0:δ��� 1:�����, 2:��ȷ��, 3:����⣻���ۣ�0:δ���� 1:�ѳ��� */
	@Column(name = "state", nullable = true, length = 1)
	private String state;

	/** �˵��� */
	@Column(name = "waybillsn", nullable = true)
	private Long waybillsn;

	/** 
	 * һ��orders��Ӧ�����ϸ
	 **/
	private List<Orderdetail> orderdetail;

	public List<Orderdetail> getOrderdetail() {
		return orderdetail;
	}
	public void setOrderdetail(List<Orderdetail> orderdetail) {
		this.orderdetail = orderdetail;
	}

	/**
	 * ��ȡ���
	 * 
	 * @return ���
	 */
	public Long getUuid() {
		return this.uuid;
	}

	/**
	 * ���ñ��
	 * 
	 * @param uuid
	 *          ���
	 */
	public void setUuid(Long uuid) {
		this.uuid = uuid;
	}

	/**
	 * ��ȡ��������
	 * 
	 * @return ��������
	 */
	public Date getCreatetime() {
		return this.createtime;
	}

	/**
	 * ������������
	 * 
	 * @param createtime
	 *          ��������
	 */
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	/**
	 * ��ȡ�������
	 * 
	 * @return �������
	 */
	public Date getChecktime() {
		return this.checktime;
	}

	/**
	 * �����������
	 * 
	 * @param checktime
	 *          �������
	 */
	public void setChecktime(Date checktime) {
		this.checktime = checktime;
	}

	/**
	 * ��ȡȷ������
	 * 
	 * @return ȷ������
	 */
	public Date getStarttime() {
		return this.starttime;
	}

	/**
	 * ����ȷ������
	 * 
	 * @param starttime
	 *          ȷ������
	 */
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	/**
	 * ��ȡ�����������
	 * 
	 * @return �����������
	 */
	public Date getEndtime() {
		return this.endtime;
	}

	/**
	 * ���������������
	 * 
	 * @param endtime
	 *          �����������
	 */
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}



	/**
	 * ��ȡ�µ�Ա
	 * 
	 * @return �µ�Ա
	 */
	public Long getCreater() {
		return this.creater;
	}

	/**
	 * �����µ�Ա
	 * 
	 * @param creater
	 *          �µ�Ա
	 */
	public void setCreater(Long creater) {
		this.creater = creater;
	}

	/**
	 * ��ȡ���Ա
	 * 
	 * @return ���Ա
	 */
	public Long getChecker() {
		return this.checker;
	}

	/**
	 * �������Ա
	 * 
	 * @param checker
	 *          ���Ա
	 */
	public void setChecker(Long checker) {
		this.checker = checker;
	}

	/**
	 * ��ȡ�ɹ�Ա
	 * 
	 * @return �ɹ�Ա
	 */
	public Long getStarter() {
		return this.starter;
	}

	/**
	 * ���òɹ�Ա
	 * 
	 * @param starter
	 *          �ɹ�Ա
	 */
	public void setStarter(Long starter) {
		this.starter = starter;
	}

	/**
	 * ��ȡ���Ա
	 * 
	 * @return ���Ա
	 */
	public Long getEnder() {
		return this.ender;
	}

	/**
	 * ���ÿ��Ա
	 * 
	 * @param ender
	 *          ���Ա
	 */
	public void setEnder(Long ender) {
		this.ender = ender;
	}

	/**
	 * ��ȡ��Ӧ�̻�ͻ�
	 * 
	 * @return ��Ӧ�̻�ͻ�
	 */
	public Long getSupplieruuid() {
		return this.supplieruuid;
	}

	/**
	 * ���ù�Ӧ�̻�ͻ�
	 * 
	 * @param supplieruuid
	 *          ��Ӧ�̻�ͻ�
	 */
	public void setSupplieruuid(Long supplieruuid) {
		this.supplieruuid = supplieruuid;
	}

	/**
	 * ��ȡ�ϼƽ��
	 * 
	 * @return �ϼƽ��
	 */
	public Double getTotalmoney() {
		return this.totalmoney;
	}

	/**
	 * ���úϼƽ��
	 * 
	 * @param totalmoney
	 *          �ϼƽ��
	 */
	public void setTotalmoney(Double totalmoney) {
		this.totalmoney = totalmoney;
	}



	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * ��ȡ�˵���
	 * 
	 * @return �˵���
	 */
	public Long getWaybillsn() {
		return this.waybillsn;
	}

	/**
	 * �����˵���
	 * 
	 * @param waybillsn
	 *          �˵���
	 */
	public void setWaybillsn(Long waybillsn) {
		this.waybillsn = waybillsn;
	}
}