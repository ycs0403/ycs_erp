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
**��  ����Role
**��  ������ɫ
**�����ߣ�changsheng-yu
**����ʱ�䣺2019-07-2911:08:24
****************************************************************/

package cn.erp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
*��ɫ(role)
*
*@author changsheng-yu
*/
@Entity
@Table(name = "role")
public class Role implements java.io.Serializable {
    /** �汾�� */
    private static final long serialVersionUID = -5251090211098090768L;

    /** ��� */
    @Id
    @Column(name = "uuid", unique = true, nullable = false)
    private Long uuid;

    /** ���� */
    @Column(name = "name", nullable = true, length = 30)
    private String name;

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
     * ��ȡ����
     * 
     * @return ����
     */
    public String getName() {
        return this.name;
    }

    /**
     * ��������
     * 
     * @param name
     *          ����
     */
    public void setName(String name) {
        this.name = name;
    }
}