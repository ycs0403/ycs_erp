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
**类  名：Supplier
**描  述：供应商
**创建者：changsheng-yu
**创建时间：2019-07-2911:08:24
****************************************************************/

package cn.erp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
*供应商(supplier)
*
*@author changsheng-yu
*/
@Entity
@Table(name = "supplier")
public class Supplier implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -5628579166242817894L;

    /** 编号 */
    @Id
    @Column(name = "uuid", unique = true, nullable = false)
    private Long uuid;

    /** 名称 */
    @Column(name = "name", nullable = true, length = 30)
    private String name;

    /** 联系地址 */
    @Column(name = "address", nullable = true, length = 100)
    private String address;

    /** 联系人 */
    @Column(name = "contact", nullable = true, length = 30)
    private String contact;

    /** 联系电话 */
    @Column(name = "tele", nullable = true, length = 30)
    private String tele;

    /** 邮件地址 */
    @Column(name = "email", nullable = true, length = 100)
    private String email;

    /** 1：供应商 2：客户 */
    @Column(name = "type", nullable = true, length = 1)
    private Integer type;

    /**
     * 获取编号
     * 
     * @return 编号
     */
    public Long getUuid() {
        return this.uuid;
    }

    /**
     * 设置编号
     * 
     * @param uuid
     *          编号
     */
    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    /**
     * 获取名称
     * 
     * @return 名称
     */
    public String getName() {
        return this.name;
    }

    /**
     * 设置名称
     * 
     * @param name
     *          名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取联系地址
     * 
     * @return 联系地址
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * 设置联系地址
     * 
     * @param address
     *          联系地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取联系人
     * 
     * @return 联系人
     */
    public String getContact() {
        return this.contact;
    }

    /**
     * 设置联系人
     * 
     * @param contact
     *          联系人
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * 获取联系电话
     * 
     * @return 联系电话
     */
    public String getTele() {
        return this.tele;
    }

    /**
     * 设置联系电话
     * 
     * @param tele
     *          联系电话
     */
    public void setTele(String tele) {
        this.tele = tele;
    }

    /**
     * 获取邮件地址
     * 
     * @return 邮件地址
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * 设置邮件地址
     * 
     * @param email
     *          邮件地址
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取1：供应商 2：客户
     * 
     * @return 1：供应商 2：客户
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * 设置1：供应商 2：客户
     * 
     * @param type
     *          1：供应商 2：客户
     */
    public void setType(Integer type) {
        this.type = type;
    }
}