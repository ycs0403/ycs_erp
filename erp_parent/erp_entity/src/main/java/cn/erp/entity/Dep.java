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
*部门(dep)
*
*@author changsheng-yu
*/
@Entity
@Table(name = "dep")
public class Dep implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 8466233684747387098L;

    /** 编号 */
    @Id
    @Column(name = "uuid", unique = true, nullable = false)
    private Long uuid;

    /** 部门名称 */
    @Column(name = "name", nullable = true, length = 30)
    private String name;

    /** 联系电话 */
    @Column(name = "tele", nullable = true, length = 30)
    private String tele;

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
     * 获取部门名称
     * 
     * @return 部门名称
     */
    public String getName() {
        return this.name;
    }

    /**
     * 设置部门名称
     * 
     * @param name
     *          部门名称
     */
    public void setName(String name) {
        this.name = name;
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
}