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
**��  ����RoleMenu
**��  ������ɫ�˵�
**�����ߣ�changsheng-yu
**����ʱ�䣺2019-07-2911:08:24
****************************************************************/

package cn.erp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
*��ɫ�˵�(role_menu)
*
*@author changsheng-yu
*/
@Entity
@Table(name = "role_menu")
public class RoleMenu implements java.io.Serializable {
    /** �汾�� */
    private static final long serialVersionUID = -2812442941520409068L;

    /** ��� */
    @Id
    @Column(name = "uuid", unique = true, nullable = false)
    private Long uuid;

    /** ��ɫ��� */
    @Column(name = "roleuuid", nullable = true)
    private Long roleuuid;

    /** �˵���� */
    @Column(name = "menuuuid", nullable = true, length = 10)
    private String menuuuid;

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
     * ��ȡ��ɫ���
     * 
     * @return ��ɫ���
     */
    public Long getRoleuuid() {
        return this.roleuuid;
    }

    /**
     * ���ý�ɫ���
     * 
     * @param roleuuid
     *          ��ɫ���
     */
    public void setRoleuuid(Long roleuuid) {
        this.roleuuid = roleuuid;
    }

    /**
     * ��ȡ�˵����
     * 
     * @return �˵����
     */
    public String getMenuuuid() {
        return this.menuuuid;
    }

    /**
     * ���ò˵����
     * 
     * @param menuuuid
     *          �˵����
     */
    public void setMenuuuid(String menuuuid) {
        this.menuuuid = menuuuid;
    }
}