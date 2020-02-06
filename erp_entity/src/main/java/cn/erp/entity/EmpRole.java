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
**��  ����EmpRole
**��  ����Ա����ɫ
**�����ߣ�changsheng-yu
**����ʱ�䣺2019-07-2911:08:24
****************************************************************/

package cn.erp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
*Ա����ɫ(emp_role)
*
*@author changsheng-yu
*/
@Entity
@Table(name = "emp_role")
public class EmpRole implements java.io.Serializable {
    /** �汾�� */
    private static final long serialVersionUID = 2823618096226312026L;

    /** ��� */
    @Id
    @Column(name = "uuid", unique = true, nullable = false)
    private Long uuid;

    /** Ա����� */
    @Column(name = "empuuid", nullable = true)
    private Long empuuid;

    /** ��ɫ��� */
    @Column(name = "roleuuid", nullable = true)
    private Long roleuuid;

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
     * ��ȡԱ�����
     * 
     * @return Ա�����
     */
    public Long getEmpuuid() {
        return this.empuuid;
    }

    /**
     * ����Ա�����
     * 
     * @param empuuid
     *          Ա�����
     */
    public void setEmpuuid(Long empuuid) {
        this.empuuid = empuuid;
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
}