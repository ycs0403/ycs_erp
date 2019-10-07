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
**类  名：Role
**描  述：角色
**创建者：changsheng-yu
**创建时间：2019-07-2911:08:24
****************************************************************/

package cn.erp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
*角色(role)
*
*@author changsheng-yu
*/
@Entity
@Table(name = "role")
public class Role implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -5251090211098090768L;

    /** 编号 */
    @Id
    @Column(name = "uuid", unique = true, nullable = false)
    private Long uuid;

    /** 名称 */
    @Column(name = "name", nullable = true, length = 30)
    private String name;

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
}