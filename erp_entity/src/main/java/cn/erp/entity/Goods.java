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
**��  ����Goods
**��  ������Ʒ
**�����ߣ�changsheng-yu
**����ʱ�䣺2019-07-2911:08:24
****************************************************************/

package cn.erp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
*��Ʒ(goods)
*
*@author changsheng-yu
*/
@Entity
@Table(name = "goods")
public class Goods implements java.io.Serializable {
    /** �汾�� */
    private static final long serialVersionUID = -5583072927074511031L;

    /** ��� */
    @Id
    @Column(name = "uuid", unique = true, nullable = false)
    private Long uuid;

    /** ���� */
    @Column(name = "name", nullable = true, length = 30)
    private String name;

    /** ���� */
    @Column(name = "origin", nullable = true, length = 30)
    private String origin;

    /** ���� */
    @Column(name = "producer", nullable = true, length = 30)
    private String producer;

    /** ������λ */
    @Column(name = "unit", nullable = true, length = 30)
    private String unit;

    /** �����۸� */
    @Column(name = "inprice", nullable = true, length = 8)
    private Long inprice;

    /** ���ۼ۸� */
    @Column(name = "outprice", nullable = true, length = 8)
    private Long outprice;

    /** ��Ʒ���� */
    //@Column(name = "goodstypeuuid", nullable = true)
    //private Long goodstypeuuid;
    private GoodsType goodsType;
 
    public GoodsType getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(GoodsType goodsType) {
		this.goodsType = goodsType;
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
     * ��ȡ����
     * 
     * @return ����
     */
    public String getName() {
        return this.name;
    }

    /**
     * ��������
     * 
     * @param name
     *          ����
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ��ȡ����
     * 
     * @return ����
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * ���ò���
     * 
     * @param origin
     *          ����
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * ��ȡ����
     * 
     * @return ����
     */
    public String getProducer() {
        return this.producer;
    }

    /**
     * ���ó���
     * 
     * @param producer
     *          ����
     */
    public void setProducer(String producer) {
        this.producer = producer;
    }

    /**
     * ��ȡ������λ
     * 
     * @return ������λ
     */
    public String getUnit() {
        return this.unit;
    }

    /**
     * ���ü�����λ
     * 
     * @param unit
     *          ������λ
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * ��ȡ�����۸�
     * 
     * @return �����۸�
     */
    public Long getInprice() {
        return this.inprice;
    }

    /**
     * ���ý����۸�
     * 
     * @param inprice
     *          �����۸�
     */
    public void setInprice(Long inprice) {
        this.inprice = inprice;
    }

    /**
     * ��ȡ���ۼ۸�
     * 
     * @return ���ۼ۸�
     */
    public Long getOutprice() {
        return this.outprice;
    }

    /**
     * �������ۼ۸�
     * 
     * @param outprice
     *          ���ۼ۸�
     */
    public void setOutprice(Long outprice) {
        this.outprice = outprice;
    }

}