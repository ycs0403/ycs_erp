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
**类  名：Menu
**描  述：菜单
**创建者：changsheng-yu
**创建时间：2019-07-2911:08:24
****************************************************************/

package cn.erp.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
*菜单(menu)
*
*@author changsheng-yu
*/
@Entity
@Table(name = "menu")
public class Menu implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -3549650215870902328L;

    /** 菜单ID */
    @Id
    @Column(name = "menuid", unique = true, nullable = false, length = 20)
    private String menuid;

    /** 菜单名称 */
    @Column(name = "menuname", nullable = true, length = 30)
    private String menuname;

    /** 图标 */
    @Column(name = "icon", nullable = true, length = 20)
    private String icon;

    /** URL */
    @Column(name = "url", nullable = true, length = 255)
    private String url;

    /** 上级菜单ID */
    //@Column(name = "pid", nullable = true, length = 20)
    //private String pid;
    
    private List<Menu> menus;//下级菜单
    
    public List<Menu> getMenus() {
		return menus;
	}
	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	/**
     * 获取菜单ID
     * 
     * @return 菜单ID
     */
    public String getMenuid() {
        return this.menuid;
    }

    /**
     * 设置菜单ID
     * 
     * @param menuid
     *          菜单ID
     */
    public void setMenuid(String menuid) {
        this.menuid = menuid;
    }

    /**
     * 获取菜单名称
     * 
     * @return 菜单名称
     */
    public String getMenuname() {
        return this.menuname;
    }

    /**
     * 设置菜单名称
     * 
     * @param menuname
     *          菜单名称
     */
    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    /**
     * 获取图标
     * 
     * @return 图标
     */
    public String getIcon() {
        return this.icon;
    }

    /**
     * 设置图标
     * 
     * @param icon
     *          图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取URL
     * 
     * @return URL
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * 设置URL
     * 
     * @param url
     *          URL
     */
    public void setUrl(String url) {
        this.url = url;
    }
}