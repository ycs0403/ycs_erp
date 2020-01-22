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
**类  名：RoleMenu
**描  述：角色菜单
**创建者：changsheng-yu
**创建时间：2019-07-2911:08:24
****************************************************************/

package cn.erp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
*角色菜单(role_menu)
*
*@author changsheng-yu
*/
@Entity
@Table(name = "role_menu")
public class RoleMenu implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -2812442941520409068L;

    /** 编号 */
    @Id
    @Column(name = "uuid", unique = true, nullable = false)
    private Long uuid;

    /** 角色编号 */
    @Column(name = "roleuuid", nullable = true)
    private Long roleuuid;

    /** 菜单编号 */
    @Column(name = "menuuuid", nullable = true, length = 10)
    private String menuuuid;

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

    /**
     * 获取菜单编号
     * 
     * @return 菜单编号
     */
    public String getMenuuuid() {
        return this.menuuuid;
    }

    /**
     * 设置菜单编号
     * 
     * @param menuuuid
     *          菜单编号
     */
    public void setMenuuuid(String menuuuid) {
        this.menuuuid = menuuuid;
    }
}