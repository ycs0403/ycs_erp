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
**��  ����Supplier
**��  ������Ӧ��
**�����ߣ�changsheng-yu
**����ʱ�䣺2019-07-2911:08:24
****************************************************************/

package cn.erp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
*��Ӧ��(supplier)
*
*@author changsheng-yu
*/
@Entity
@Table(name = "supplier")
public class Supplier implements java.io.Serializable {
    /** �汾�� */
    private static final long serialVersionUID = -5628579166242817894L;

    /** ��� */
    @Id
    @Column(name = "uuid", unique = true, nullable = false)
    private Long uuid;

    /** ���� */
    @Column(name = "name", nullable = true, length = 30)
    private String name;

    /** ��ϵ��ַ */
    @Column(name = "address", nullable = true, length = 100)
    private String address;

    /** ��ϵ�� */
    @Column(name = "contact", nullable = true, length = 30)
    private String contact;

    /** ��ϵ�绰 */
    @Column(name = "tele", nullable = true, length = 30)
    private String tele;

    /** �ʼ���ַ */
    @Column(name = "email", nullable = true, length = 100)
    private String email;

    /** 1����Ӧ�� 2���ͻ� */
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
     * ��ȡ��ϵ��ַ
     * 
     * @return ��ϵ��ַ
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * ������ϵ��ַ
     * 
     * @param address
     *          ��ϵ��ַ
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * ��ȡ��ϵ��
     * 
     * @return ��ϵ��
     */
    public String getContact() {
        return this.contact;
    }

    /**
     * ������ϵ��
     * 
     * @param contact
     *          ��ϵ��
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * ��ȡ��ϵ�绰
     * 
     * @return ��ϵ�绰
     */
    public String getTele() {
        return this.tele;
    }

    /**
     * ������ϵ�绰
     * 
     * @param tele
     *          ��ϵ�绰
     */
    public void setTele(String tele) {
        this.tele = tele;
    }

    /**
     * ��ȡ�ʼ���ַ
     * 
     * @return �ʼ���ַ
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * �����ʼ���ַ
     * 
     * @param email
     *          �ʼ���ַ
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * ��ȡ1����Ӧ�� 2���ͻ�
     * 
     * @return 1����Ӧ�� 2���ͻ�
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * ����1����Ӧ�� 2���ͻ�
     * 
     * @param type
     *          1����Ӧ�� 2���ͻ�
     */
    public void setType(Integer type) {
        this.type = type;
    }
}