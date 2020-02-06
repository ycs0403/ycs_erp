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
**类  名：Returnorderdetail
**描  述：退货订单明细
**创建者：changsheng-yu
**创建时间：2019-07-2911:08:24
****************************************************************/

package cn.erp.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
*退货订单明细(returnorderdetail)
*
*@author changsheng-yu
*/
@Entity
@Table(name = "returnorderdetail")
public class Returnorderdetail implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 1680660276840377606L;

    /** 编号 */
    @Id
    @Column(name = "uuid", unique = true, nullable = false)
    private Long uuid;

    /** 商品编号 */
    @Column(name = "goodsuuid", nullable = true)
    private Long goodsuuid;

    /** 商品名称 */
    @Column(name = "goodsname", nullable = true, length = 50)
    private String goodsname;

    /** 价格 */
    @Column(name = "price", nullable = true, length = 10)
    private Long price;

    /** 数量 */
    @Column(name = "num", nullable = true)
    private Long num;

    /** 金额 */
    @Column(name = "money", nullable = true, length = 10)
    private Long money;

    /** 结束日期 */
    @Column(name = "endtime", nullable = true, length = 7)
    private Date endtime;

    /** 库管员 */
    @Column(name = "ender", nullable = true)
    private Long ender;

    /** 仓库编号 */
    @Column(name = "storeuuid", nullable = true)
    private Long storeuuid;

    /** 状态 */
    @Column(name = "state", nullable = true, length = 1)
    private Integer state;

    /** 退货订单编号 */
    @Column(name = "ordersuuid", nullable = true)
    private Long ordersuuid;

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
     * 获取商品编号
     * 
     * @return 商品编号
     */
    public Long getGoodsuuid() {
        return this.goodsuuid;
    }

    /**
     * 设置商品编号
     * 
     * @param goodsuuid
     *          商品编号
     */
    public void setGoodsuuid(Long goodsuuid) {
        this.goodsuuid = goodsuuid;
    }

    /**
     * 获取商品名称
     * 
     * @return 商品名称
     */
    public String getGoodsname() {
        return this.goodsname;
    }

    /**
     * 设置商品名称
     * 
     * @param goodsname
     *          商品名称
     */
    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    /**
     * 获取价格
     * 
     * @return 价格
     */
    public Long getPrice() {
        return this.price;
    }

    /**
     * 设置价格
     * 
     * @param price
     *          价格
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * 获取数量
     * 
     * @return 数量
     */
    public Long getNum() {
        return this.num;
    }

    /**
     * 设置数量
     * 
     * @param num
     *          数量
     */
    public void setNum(Long num) {
        this.num = num;
    }

    /**
     * 获取金额
     * 
     * @return 金额
     */
    public Long getMoney() {
        return this.money;
    }

    /**
     * 设置金额
     * 
     * @param money
     *          金额
     */
    public void setMoney(Long money) {
        this.money = money;
    }

    /**
     * 获取结束日期
     * 
     * @return 结束日期
     */
    public Date getEndtime() {
        return this.endtime;
    }

    /**
     * 设置结束日期
     * 
     * @param endtime
     *          结束日期
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * 获取库管员
     * 
     * @return 库管员
     */
    public Long getEnder() {
        return this.ender;
    }

    /**
     * 设置库管员
     * 
     * @param ender
     *          库管员
     */
    public void setEnder(Long ender) {
        this.ender = ender;
    }

    /**
     * 获取仓库编号
     * 
     * @return 仓库编号
     */
    public Long getStoreuuid() {
        return this.storeuuid;
    }

    /**
     * 设置仓库编号
     * 
     * @param storeuuid
     *          仓库编号
     */
    public void setStoreuuid(Long storeuuid) {
        this.storeuuid = storeuuid;
    }

    /**
     * 获取状态
     * 
     * @return 状态
     */
    public Integer getState() {
        return this.state;
    }

    /**
     * 设置状态
     * 
     * @param state
     *          状态
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取退货订单编号
     * 
     * @return 退货订单编号
     */
    public Long getOrdersuuid() {
        return this.ordersuuid;
    }

    /**
     * 设置退货订单编号
     * 
     * @param ordersuuid
     *          退货订单编号
     */
    public void setOrdersuuid(Long ordersuuid) {
        this.ordersuuid = ordersuuid;
    }
}