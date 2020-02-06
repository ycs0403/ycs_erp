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
**��  ����Storedetail
**��  �����ֿ���
**�����ߣ�changsheng-yu
**����ʱ�䣺2019-07-2911:08:24
****************************************************************/

package cn.erp.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
*�ֿ���(storedetail)
*
*@author changsheng-yu
*/
@Entity
@Table(name = "storedetail")
public class Storedetail implements java.io.Serializable {
    /** �汾�� */
    private static final long serialVersionUID = -7143198391267379901L;

    /** ��� */
    @Id
    @Column(name = "uuid", unique = true, nullable = false)
    private Long uuid;

    /** �ֿ��� */
    @Column(name = "storeuuid", nullable = true)
    private Long storeuuid;

    /** ��Ʒ��� */
    @Column(name = "goodsuuid", nullable = true)
    private Long goodsuuid;

    /** ���� */
    @Column(name = "num", nullable = true)
    private Long num;

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
}