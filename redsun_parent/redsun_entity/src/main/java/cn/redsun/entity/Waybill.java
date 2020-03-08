/****************************************************************
**类  名：Waybill
**描  述：运单
**创建者：ycs
**创建时间：2020-02-2117:49:45
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
    /** 版本号 */
    private static final long serialVersionUID = 4675277921843877949L;

    /** 运单号 */
    @Id
    @Column(name = "sn", unique = true, nullable = false, length = 19)
    private Long sn;

    /** 用户ID */
    @Column(name = "userid", nullable = true, length = 19)
    private Long userid;

    /** 收货地址 */
    @Column(name = "toaddress", nullable = true, length = 100)
    private String toaddress;

    /** 收货人 */
    @Column(name = "addressee", nullable = true, length = 100)
    private String addressee;

    /** 收件人电话 */
    @Column(name = "tele", nullable = true, length = 100)
    private String tele;

    /** 运单详情 */
    @Column(name = "info", nullable = true, length = 2000)
    private String info;

    /** 运单状态 */
    @Column(name = "state", nullable = true, length = 1)
    private String state;

    /**
     * 获取运单号
     * 
     * @return 运单号
     */
    public Long getSn() {
        return this.sn;
    }

    /**
     * 设置运单号
     * 
     * @param sn
     *          运单号
     */
    public void setSn(Long sn) {
        this.sn = sn;
    }

    /**
     * 获取用户ID
     * 
     * @return 用户ID
     */
    public Long getUserid() {
        return this.userid;
    }

    /**
     * 设置用户ID
     * 
     * @param userid
     *          用户ID
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * 获取收货地址
     * 
     * @return 收货地址
     */
    public String getToaddress() {
        return this.toaddress;
    }

    /**
     * 设置收货地址
     * 
     * @param toaddress
     *          收货地址
     */
    public void setToaddress(String toaddress) {
        this.toaddress = toaddress;
    }

    /**
     * 获取收货人
     * 
     * @return 收货人
     */
    public String getAddressee() {
        return this.addressee;
    }

    /**
     * 设置收货人
     * 
     * @param addressee
     *          收货人
     */
    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }

    /**
     * 获取收件人电话
     * 
     * @return 收件人电话
     */
    public String getTele() {
        return this.tele;
    }

    /**
     * 设置收件人电话
     * 
     * @param tele
     *          收件人电话
     */
    public void setTele(String tele) {
        this.tele = tele;
    }

    /**
     * 获取运单详情
     * 
     * @return 运单详情
     */
    public String getInfo() {
        return this.info;
    }

    /**
     * 设置运单详情
     * 
     * @param info
     *          运单详情
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * 获取运单状态
     * 
     * @return 运单状态
     */
    public String getState() {
        return this.state;
    }

    /**
     * 设置运单状态
     * 
     * @param state
     *          运单状态
     */
    public void setState(String state) {
        this.state = state;
    }
}