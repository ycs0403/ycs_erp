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
**类  名：EmpRole
**描  述：员工角色
**创建者：changsheng-yu
**创建时间：2019-07-2911:08:24
****************************************************************/

package cn.erp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
*员工角色(emp_role)
*
*@author changsheng-yu
*/
@Entity
@Table(name = "emp_role")
public class EmpRole implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 2823618096226312026L;

    /** 编号 */
    @Id
    @Column(name = "uuid", unique = true, nullable = false)
    private Long uuid;

    /** 员工编号 */
    @Column(name = "empuuid", nullable = true)
    private Long empuuid;

    /** 角色编号 */
    @Column(name = "roleuuid", nullable = true)
    private Long roleuuid;

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

    /**
     * 获取角色编号
     * 
     * @return 角色编号
     */
    public Long getRoleuuid() {
        return this.roleuuid;
    }

    /**
     * 设置角色编号
     * 
     * @param roleuuid
     *          角色编号
     */
    public void setRoleuuid(Long roleuuid) {
        this.roleuuid = roleuuid;
    }
}