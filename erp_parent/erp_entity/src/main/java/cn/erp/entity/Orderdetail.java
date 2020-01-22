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
 **��  ����Orderdetail
 **��  ����������ϸ
 **�����ߣ�changsheng-yu
 **����ʱ�䣺2019-07-2911:08:24
 ****************************************************************/

package cn.erp.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * ������ϸ(orderdetail)
 *
 * @author changsheng-yu
 */
@Entity
@Table(name = "orderdetail")
public class Orderdetail implements java.io.Serializable {
	/** �汾�� */
	private static final long serialVersionUID = 8868366824617197355L;

	/**δ��� */
	public static final String STATE_NOT_IN = "0";
	/**�����*/
	public static final String STATE_IN = "1";
	
	/** ��� */
	@Id
	@Column(name = "uuid", unique = true, nullable = false)
	private Long uuid;

	/** ��Ʒ��� */
	@Column(name = "goodsuuid", nullable = true)
	private Long goodsuuid;

	/** ��Ʒ���� */
	@Column(name = "goodsname", nullable = true, length = 50)
	private String goodsname;

	/** �۸� */
	@Column(name = "price", nullable = true, length = 10)
	private Long price;

	/** ���� */
	@Column(name = "num", nullable = true)
	private Long num;

	/** ��� */
	@Column(name = "money", nullable = true, length = 10)
	private Long money;

	/** �������� */
	@Column(name = "endtime", nullable = true, length = 7)
	private Date endtime;

	/** ���Ա */
	@Column(name = "ender", nullable = true)
	private Long ender;

	/** �ֿ��� */
	@Column(name = "storeuuid", nullable = true)
	private Long storeuuid;

	/** �ɹ���0=δ��⣬1=����� ���ۣ�0=δ���⣬1=�ѳ��� */
	@Column(name = "state", nullable = true, length = 1)
	private String state;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	/** �������-���� */
	/*
	 * @Column(name = "ordersuuid", nullable = true) private Long ordersuuid;
	 */

	/* �������󣬶��һ */
	@JSONField(serialize=false)
	private Orders orders;

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
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
	 * @param uuid ���
	 */
	public void setUuid(Long uuid) {
		this.uuid = uuid;
	}

	/**
	 * ��ȡ��Ʒ���
	 * 
	 * @return ��Ʒ���
	 */
	public Long getGoodsuuid() {
		return this.goodsuuid;
	}

	/**
	 * ������Ʒ���
	 * 
	 * @param goodsuuid ��Ʒ���
	 */
	public void setGoodsuuid(Long goodsuuid) {
		this.goodsuuid = goodsuuid;
	}

	/**
	 * ��ȡ��Ʒ����
	 * 
	 * @return ��Ʒ����
	 */
	public String getGoodsname() {
		return this.goodsname;
	}

	/**
	 * ������Ʒ����
	 * 
	 * @param goodsname ��Ʒ����
	 */
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	/**
	 * ��ȡ�۸�
	 * 
	 * @return �۸�
	 */
	public Long getPrice() {
		return this.price;
	}

	/**
	 * ���ü۸�
	 * 
	 * @param price �۸�
	 */
	public void setPrice(Long price) {
		this.price = price;
	}

	/**
	 * ��ȡ����
	 * 
	 * @return ����
	 */
	public Long getNum() {
		return this.num;
	}

	/**
	 * ��������
	 * 
	 * @param num ����
	 */
	public void setNum(Long num) {
		this.num = num;
	}

	/**
	 * ��ȡ���
	 * 
	 * @return ���
	 */
	public Long getMoney() {
		return this.money;
	}

	/**
	 * ���ý��
	 * 
	 * @param money ���
	 */
	public void setMoney(Long money) {
		this.money = money;
	}

	/**
	 * ��ȡ��������
	 * 
	 * @return ��������
	 */
	public Date getEndtime() {
		return this.endtime;
	}

	/**
	 * ���ý�������
	 * 
	 * @param endtime ��������
	 */
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
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
	 * @param ender ���Ա
	 */
	public void setEnder(Long ender) {
		this.ender = ender;
	}

	/**
	 * ��ȡ�ֿ���
	 * 
	 * @return �ֿ���
	 */
	public Long getStoreuuid() {
		return this.storeuuid;
	}

	/**
	 * ���òֿ���
	 * 
	 * @param storeuuid �ֿ���
	 */
	public void setStoreuuid(Long storeuuid) {
		this.storeuuid = storeuuid;
	}



	/*    *//**
	 * ��ȡ�������
	 * 
	 * @return �������
	 */
	/*
	 * public Long getOrdersuuid() { return this.ordersuuid; }
	 * 
	 *//**
	 * ���ö������
	 * 
	 * @param ordersuuid �������
	 *//*
	 * public void setOrdersuuid(Long ordersuuid) { this.ordersuuid = ordersuuid; }
	 */
}