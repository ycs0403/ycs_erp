/****************************************************************
**��  ����Waybilldetail
**��  �����˵���ϸ
**�����ߣ�ycs
**����ʱ�䣺2020-02-2117:49:45
****************************************************************/

package cn.redsun.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
*(waybilldetail)
*
*@author ycs
*/
@Entity
@Table(name = "waybilldetail")
public class Waybilldetail implements java.io.Serializable {
    /** �汾�� */
    private static final long serialVersionUID = 8280381566521226444L;

    /** ID */
    @Id
    @Column(name = "id", unique = true, nullable = false, length = 19)
    private Long id;

    /** �˵��� */
    @Column(name = "sn", nullable = true, length = 19)
    private Long sn;

    /** ִ������ */
    @Column(name = "exedate", nullable = true, length = 10)
    private String exedate;

    /** ִ��ʱ�� */
    @Column(name = "exetime", nullable = true, length = 10)
    private String exetime;

    /** ִ����Ϣ */
    @Column(name = "info", nullable = true, length = 100)
    private String info;

    /**
     * ��ȡID
     * 
     * @return ID
     */
    public Long getId() {
        return this.id;
    }

    /**
     * ����ID
     * 
     * @param id
     *          ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * ��ȡ�˵���
     * 
     * @return �˵���
     */
    public Long getSn() {
        return this.sn;
    }

    /**
     * �����˵���
     * 
     * @param sn
     *          �˵���
     */
    public void setSn(Long sn) {
        this.sn = sn;
    }

    /**
     * ��ȡִ������
     * 
     * @return ִ������
     */
    public String getExedate() {
        return this.exedate;
    }

    /**
     * ����ִ������
     * 
     * @param exedate
     *          ִ������
     */
    public void setExedate(String exedate) {
        this.exedate = exedate;
    }

    /**
     * ��ȡִ��ʱ��
     * 
     * @return ִ��ʱ��
     */
    public String getExetime() {
        return this.exetime;
    }

    /**
     * ����ִ��ʱ��
     * 
     * @param exetime
     *          ִ��ʱ��
     */
    public void setExetime(String exetime) {
        this.exetime = exetime;
    }

    /**
     * ��ȡִ����Ϣ
     * 
     * @return ִ����Ϣ
     */
    public String getInfo() {
        return this.info;
    }

    /**
     * ����ִ����Ϣ
     * 
     * @param info
     *          ִ����Ϣ
     */
    public void setInfo(String info) {
        this.info = info;
    }
}