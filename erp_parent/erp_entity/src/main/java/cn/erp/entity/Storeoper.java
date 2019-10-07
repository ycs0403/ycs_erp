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
**��  ����Storeoper
**��  �����ֿ������¼
**�����ߣ�changsheng-yu
**����ʱ�䣺2019-07-2911:08:24
****************************************************************/

package cn.erp.entity;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
*�ֿ������¼(storeoper)
*
*@author changsheng-yu
*/
@Entity
@Table(name = "storeoper")
public class Storeoper implements java.io.Serializable {
    /** �汾�� */
    private static final long serialVersionUID = 2948306475083875755L;

    /** ��� */
    @Id
    @Column(name = "uuid", unique = true, nullable = false)
    private Long uuid;

    /** ����Ա����� */
    @Column(name = "empuuid", nullable = true)
    private Long empuuid;

    /** �������� */
    @Column(name = "opertime", nullable = true, length = 7)
    private Date opertime;

    /** �ֿ��� */
    @Column(name = "storeuuid", nullable = true)
    private Long storeuuid;

    /** ��Ʒ��� */
    @Column(name = "goodsuuid", nullable = true)
    private Long goodsuuid;

    /** ���� */
    @Column(name = "num", nullable = true)
    private Long num;

    /** 1����� 2������ */
    @Column(name = "type", nullable = true, length = 1)
    private Integer type;

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
     * ��ȡ����Ա�����
     * 
     * @return ����Ա�����
     */
    public Long getEmpuuid() {
        return this.empuuid;
    }

    /**
     * ���ò���Ա�����
     * 
     * @param empuuid
     *          ����Ա�����
     */
    public void setEmpuuid(Long empuuid) {
        this.empuuid = empuuid;
    }

    /**
     * ��ȡ��������
     * 
     * @return ��������
     */
    public Date getOpertime() {
        return this.opertime;
    }

    /**
     * ���ò�������
     * 
     * @param opertime
     *          ��������
     */
    public void setOpertime(Date opertime) {
        this.opertime = opertime;
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
     * @param storeuuid
     *          �ֿ���
     */
    public void setStoreuuid(Long storeuuid) {
        this.storeuuid = storeuuid;
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
     * @param goodsuuid
     *          ��Ʒ���
     */
    public void setGoodsuuid(Long goodsuuid) {
        this.goodsuuid = goodsuuid;
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
     * @param num
     *          ����
     */
    public void setNum(Long num) {
        this.num = num;
    }

    /**
     * ��ȡ1����� 2������
     * 
     * @return 1����� 2������
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * ����1����� 2������
     * 
     * @param type
     *          1����� 2������
     */
    public void setType(Integer type) {
        this.type = type;
    }
}