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
**��  ����Menu
**��  �����˵�
**�����ߣ�changsheng-yu
**����ʱ�䣺2019-07-2911:08:24
****************************************************************/

package cn.erp.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
*�˵�(menu)
*
*@author changsheng-yu
*/
@Entity
@Table(name = "menu")
public class Menu implements java.io.Serializable {
    /** �汾�� */
    private static final long serialVersionUID = -3549650215870902328L;

    /** �˵�ID */
    @Id
    @Column(name = "menuid", unique = true, nullable = false, length = 20)
    private String menuid;

    /** �˵����� */
    @Column(name = "menuname", nullable = true, length = 30)
    private String menuname;

    /** ͼ�� */
    @Column(name = "icon", nullable = true, length = 20)
    private String icon;

    /** URL */
    @Column(name = "url", nullable = true, length = 255)
    private String url;

    /** �ϼ��˵�ID */
    //@Column(name = "pid", nullable = true, length = 20)
    //private String pid;
    
    private List<Menu> menus;//�¼��˵�
    
    public List<Menu> getMenus() {
		return menus;
	}
	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	/**
     * ��ȡ�˵�ID
     * 
     * @return �˵�ID
     */
    public String getMenuid() {
        return this.menuid;
    }

    /**
     * ���ò˵�ID
     * 
     * @param menuid
     *          �˵�ID
     */
    public void setMenuid(String menuid) {
        this.menuid = menuid;
    }

    /**
     * ��ȡ�˵�����
     * 
     * @return �˵�����
     */
    public String getMenuname() {
        return this.menuname;
    }

    /**
     * ���ò˵�����
     * 
     * @param menuname
     *          �˵�����
     */
    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    /**
     * ��ȡͼ��
     * 
     * @return ͼ��
     */
    public String getIcon() {
        return this.icon;
    }

    /**
     * ����ͼ��
     * 
     * @param icon
     *          ͼ��
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * ��ȡURL
     * 
     * @return URL
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * ����URL
     * 
     * @param url
     *          URL
     */
    public void setUrl(String url) {
        this.url = url;
    }
}