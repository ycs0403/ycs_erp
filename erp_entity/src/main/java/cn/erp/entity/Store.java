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
**类  名：Store
**描  述：仓库
**创建者：changsheng-yu
**创建时间：2019-07-2911:08:24
****************************************************************/

package cn.erp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
*仓库(store)
*
*@author changsheng-yu
*/
@Entity
@Table(name = "store")
public class Store implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -3329083878098658455L;

    /** 编号 */
    @Id
    @Column(name = "uuid", unique = true, nullable = false)
    private Long uuid;

    /** 名称 */
    @Column(name = "name", nullable = true, length = 30)
    private String name;

    /** 员工编号 */
    @Column(name = "empuuid", nullable = true)
    private Long empuuid;

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
     * 获取员工编号
     * 
     * @return 员工编号
     */
    public Long getEmpuuid() {
        return this.empuuid;
    }

    /**
     * 设置员工编号
     * 
     * @param empuuid
     *          员工编号
     */
    public void setEmpuuid(Long empuuid) {
        this.empuuid = empuuid;
    }
}