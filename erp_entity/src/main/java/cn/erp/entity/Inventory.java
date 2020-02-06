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
**��  ����Inventory
**��  ������ӯ�̿�
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
*��ӯ�̿�(inventory)
*
*@author changsheng-yu
*/
@Entity
@Table(name = "inventory")
public class Inventory implements java.io.Serializable {
    /** �汾�� */
    private static final long serialVersionUID = -2766573535959965527L;

    /** ��� */
    @Id
    @Column(name = "uuid", unique = true, nullable = false)
    private Long uuid;

    /** ��Ʒ */
    @Column(name = "goodsuuid", nullable = true)
    private Long goodsuuid;

    /** �ֿ� */
    @Column(name = "storeuuid", nullable = true)
    private Long storeuuid;

    /** ���� */
    @Column(name = "num", nullable = true)
    private Long num;

    /** ���� */
    @Column(name = "type", nullable = true, length = 1)
    private Integer type;

    /** �Ǽ����� */
    @Column(name = "createtime", nullable = true, length = 7)
    private Date createtime;

    /** ������� */
    @Column(name = "checktime", nullable = true, length = 7)
    private Date checktime;

    /** �Ǽ��� */
    @Column(name = "creater", nullable = true)
    private Long creater;

    /** ����� */
    @Column(name = "checker", nullable = true)
    private Long checker;

    /** ״̬ */
    @Column(name = "state", nullable = true, length = 1)
    private Integer state;

    /** ��ע */
    @Column(name = "remark", nullable = true, length = 200)
    private String remark;

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
     * ��ȡ��Ʒ
     * 
     * @return ��Ʒ
     */
    public Long getGoodsuuid() {
        return this.goodsuuid;
    }

    /**
     * ������Ʒ
     * 
     * @param goodsuuid
     *          ��Ʒ
     */
    public void setGoodsuuid(Long goodsuuid) {
        this.goodsuuid = goodsuuid;
    }

    /**
     * ��ȡ�ֿ�
     * 
     * @return �ֿ�
     */
    public Long getStoreuuid() {
        return this.storeuuid;
    }

    /**
     * ���òֿ�
     * 
     * @param storeuuid
     *          �ֿ�
     */
    public void setStoreuuid(Long storeuuid) {
        this.storeuuid = storeuuid;
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
     * ��ȡ����
     * 
     * @return ����
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * ��������
     * 
     * @param type
     *          ����
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * ��ȡ�Ǽ�����
     * 
     * @return �Ǽ�����
     */
    public Date getCreatetime() {
        return this.createtime;
    }

    /**
     * ���õǼ�����
     * 
     * @param createtime
     *          �Ǽ�����
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
     * ��ȡ�Ǽ���
     * 
     * @return �Ǽ���
     */
    public Long getCreater() {
        return this.creater;
    }

    /**
     * ���õǼ���
     * 
     * @param creater
     *          �Ǽ���
     */
    public void setCreater(Long creater) {
        this.creater = creater;
    }

    /**
     * ��ȡ�����
     * 
     * @return �����
     */
    public Long getChecker() {
        return this.checker;
    }

    /**
     * ���������
     * 
     * @param checker
     *          �����
     */
    public void setChecker(Long checker) {
        this.checker = checker;
    }

    /**
     * ��ȡ״̬
     * 
     * @return ״̬
     */
    public Integer getState() {
        return this.state;
    }

    /**
     * ����״̬
     * 
     * @param state
     *          ״̬
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * ��ȡ��ע
     * 
     * @return ��ע
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * ���ñ�ע
     * 
     * @param remark
     *          ��ע
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}