/****************************************************************
**��  ����Waybill
**��  �����˵�
**�����ߣ�ycs
**����ʱ�䣺2020-02-2117:49:45
****************************************************************/

package cn.redsun.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
*(waybill)
*
*@author ycs
*/
@Entity
@Table(name = "waybill")
public class Waybill implements java.io.Serializable {
    /** �汾�� */
    private static final long serialVersionUID = 4675277921843877949L;

    /** �˵��� */
    @Id
    @Column(name = "sn", unique = true, nullable = false, length = 19)
    private Long sn;

    /** �û�ID */
    @Column(name = "userid", nullable = true, length = 19)
    private Long userid;

    /** �ջ���ַ */
    @Column(name = "toaddress", nullable = true, length = 100)
    private String toaddress;

    /** �ջ��� */
    @Column(name = "addressee", nullable = true, length = 100)
    private String addressee;

    /** �ռ��˵绰 */
    @Column(name = "tele", nullable = true, length = 100)
    private String tele;

    /** �˵����� */
    @Column(name = "info", nullable = true, length = 2000)
    private String info;

    /** �˵�״̬ */
    @Column(name = "state", nullable = true, length = 1)
    private String state;

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
     * ��ȡ�û�ID
     * 
     * @return �û�ID
     */
    public Long getUserid() {
        return this.userid;
    }

    /**
     * �����û�ID
     * 
     * @param userid
     *          �û�ID
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * ��ȡ�ջ���ַ
     * 
     * @return �ջ���ַ
     */
    public String getToaddress() {
        return this.toaddress;
    }

    /**
     * �����ջ���ַ
     * 
     * @param toaddress
     *          �ջ���ַ
     */
    public void setToaddress(String toaddress) {
        this.toaddress = toaddress;
    }

    /**
     * ��ȡ�ջ���
     * 
     * @return �ջ���
     */
    public String getAddressee() {
        return this.addressee;
    }

    /**
     * �����ջ���
     * 
     * @param addressee
     *          �ջ���
     */
    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }

    /**
     * ��ȡ�ռ��˵绰
     * 
     * @return �ռ��˵绰
     */
    public String getTele() {
        return this.tele;
    }

    /**
     * �����ռ��˵绰
     * 
     * @param tele
     *          �ռ��˵绰
     */
    public void setTele(String tele) {
        this.tele = tele;
    }

    /**
     * ��ȡ�˵�����
     * 
     * @return �˵�����
     */
    public String getInfo() {
        return this.info;
    }

    /**
     * �����˵�����
     * 
     * @param info
     *          �˵�����
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * ��ȡ�˵�״̬
     * 
     * @return �˵�״̬
     */
    public String getState() {
        return this.state;
    }

    /**
     * �����˵�״̬
     * 
     * @param state
     *          �˵�״̬
     */
    public void setState(String state) {
        this.state = state;
    }
}