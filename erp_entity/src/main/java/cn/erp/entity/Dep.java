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

package cn.erp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
*����(dep)
*
*@author changsheng-yu
*/
@Entity
@Table(name = "dep")
public class Dep implements java.io.Serializable {
    /** �汾�� */
    private static final long serialVersionUID = 8466233684747387098L;

    /** ��� */
    @Id
    @Column(name = "uuid", unique = true, nullable = false)
    private Long uuid;

    /** �������� */
    @Column(name = "name", nullable = true, length = 30)
    private String name;

    /** ��ϵ�绰 */
    @Column(name = "tele", nullable = true, length = 30)
    private String tele;

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
    public String getName() {
        return this.name;
    }

    /**
     * ���ò�������
     * 
     * @param name
     *          ��������
     */
    public void setName(String name) {
        this.name = name;
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
}