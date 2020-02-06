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
**��  ����Goodstype
**��  ������Ʒ����
**�����ߣ�changsheng-yu
**����ʱ�䣺2019-07-2911:08:24
****************************************************************/

package cn.erp.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
*��Ʒ����(goodstype)
*
*@author changsheng-yu
*/
@Entity
@Table(name = "goodstype")
public class GoodsType implements java.io.Serializable {
    /** �汾�� */
    private static final long serialVersionUID = -7446961050151671230L;

    /** ��Ʒ���ͱ�� */
    @Id
    @Column(name = "uuid", unique = true, nullable = false)
    private Long uuid;

    /** ��Ʒ�������� */
    @Column(name = "name", nullable = true, length = 30)
    private String name;

    /**
     * ��ȡ��Ʒ���ͱ��
     * 
     * @return ��Ʒ���ͱ��
     */
    public Long getUuid() {
        return this.uuid;
    }

    /**
     * ������Ʒ���ͱ��
     * 
     * @param uuid
     *          ��Ʒ���ͱ��
     */
    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    /**
     * ��ȡ��Ʒ��������
     * 
     * @return ��Ʒ��������
     */
    public String getName() {
        return this.name;
    }

    /**
     * ������Ʒ��������
     * 
     * @param name
     *          ��Ʒ��������
     */
    public void setName(String name) {
        this.name = name;
    }
}