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
**��  ����Returnorders
**��  �����˻�����
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
*�˻�����(returnorders)
*
*@author changsheng-yu
*/
@Entity
@Table(name = "returnorders")
public class Returnorders implements java.io.Serializable {
    /** �汾�� */
    private static final long serialVersionUID = 3199564026696293965L;

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

    /** �������� */
    @Column(name = "endtime", nullable = true, length = 7)
    private Date endtime;

    /** �������� */
    @Column(name = "type", nullable = true, length = 1)
    private Integer type;

    /** �µ�Ա */
    @Column(name = "creater", nullable = true)
    private Long creater;

    /** ���Ա����� */
    @Column(name = "checker", nullable = true)
    private Long checker;

    /** ���Ա */
    @Column(name = "ender", nullable = true)
    private Long ender;

    /** ��Ӧ�̼��ͻ���� */
    @Column(name = "supplieruuid", nullable = true)
    private Long supplieruuid;

    /** �ϼƽ�� */
    @Column(name = "totalmoney", nullable = true, length = 10)
    private Long totalmoney;

    /** ����״̬ */
    @Column(name = "state", nullable = true, length = 1)
    private Integer state;

    /** �˵��� */
    @Column(name = "waybillsn", nullable = true)
    private Long waybillsn;

    /** ԭ������� */
    @Column(name = "ordersuuid", nullable = true)
    private Long ordersuuid;

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
     * ���ü������
     * 
     * @param checktime
     *          �������
     */
    public void setChecktime(Date checktime) {
        this.checktime = checktime;
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
     * @param endtime
     *          ��������
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * ��ȡ��������
     * 
     * @return ��������
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * ���ö�������
     * 
     * @param type
     *          ��������
     */
    public void setType(Integer type) {
        this.type = type;
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
     * ��ȡ���Ա�����
     * 
     * @return ���Ա�����
     */
    public Long getChecker() {
        return this.checker;
    }

    /**
     * �������Ա�����
     * 
     * @param checker
     *          ���Ա�����
     */
    public void setChecker(Long checker) {
        this.checker = checker;
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
     * ��ȡ��Ӧ�̼��ͻ����
     * 
     * @return ��Ӧ�̼��ͻ����
     */
    public Long getSupplieruuid() {
        return this.supplieruuid;
    }

    /**
     * ���ù�Ӧ�̼��ͻ����
     * 
     * @param supplieruuid
     *          ��Ӧ�̼��ͻ����
     */
    public void setSupplieruuid(Long supplieruuid) {
        this.supplieruuid = supplieruuid;
    }

    /**
     * ��ȡ�ϼƽ��
     * 
     * @return �ϼƽ��
     */
    public Long getTotalmoney() {
        return this.totalmoney;
    }

    /**
     * ���úϼƽ��
     * 
     * @param totalmoney
     *          �ϼƽ��
     */
    public void setTotalmoney(Long totalmoney) {
        this.totalmoney = totalmoney;
    }

    /**
     * ��ȡ����״̬
     * 
     * @return ����״̬
     */
    public Integer getState() {
        return this.state;
    }

    /**
     * ���ö���״̬
     * 
     * @param state
     *          ����״̬
     */
    public void setState(Integer state) {
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

    /**
     * ��ȡԭ�������
     * 
     * @return ԭ�������
     */
    public Long getOrdersuuid() {
        return this.ordersuuid;
    }

    /**
     * ����ԭ�������
     * 
     * @param ordersuuid
     *          ԭ�������
     */
    public void setOrdersuuid(Long ordersuuid) {
        this.ordersuuid = ordersuuid;
    }
}