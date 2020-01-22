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
**类  名：Returnorders
**描  述：退货订单
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
*退货订单(returnorders)
*
*@author changsheng-yu
*/
@Entity
@Table(name = "returnorders")
public class Returnorders implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 3199564026696293965L;

    /** 编号 */
    @Id
    @Column(name = "uuid", unique = true, nullable = false)
    private Long uuid;

    /** 生成日期 */
    @Column(name = "createtime", nullable = true, length = 7)
    private Date createtime;

    /** 检查日期 */
    @Column(name = "checktime", nullable = true, length = 7)
    private Date checktime;

    /** 结束日期 */
    @Column(name = "endtime", nullable = true, length = 7)
    private Date endtime;

    /** 订单类型 */
    @Column(name = "type", nullable = true, length = 1)
    private Integer type;

    /** 下单员 */
    @Column(name = "creater", nullable = true)
    private Long creater;

    /** 审核员工编号 */
    @Column(name = "checker", nullable = true)
    private Long checker;

    /** 库管员 */
    @Column(name = "ender", nullable = true)
    private Long ender;

    /** 供应商及客户编号 */
    @Column(name = "supplieruuid", nullable = true)
    private Long supplieruuid;

    /** 合计金额 */
    @Column(name = "totalmoney", nullable = true, length = 10)
    private Long totalmoney;

    /** 订单状态 */
    @Column(name = "state", nullable = true, length = 1)
    private Integer state;

    /** 运单号 */
    @Column(name = "waybillsn", nullable = true)
    private Long waybillsn;

    /** 原订单编号 */
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
     * 获取生成日期
     * 
     * @return 生成日期
     */
    public Date getCreatetime() {
        return this.createtime;
    }

    /**
     * 设置生成日期
     * 
     * @param createtime
     *          生成日期
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取检查日期
     * 
     * @return 检查日期
     */
    public Date getChecktime() {
        return this.checktime;
    }

    /**
     * 设置检查日期
     * 
     * @param checktime
     *          检查日期
     */
    public void setChecktime(Date checktime) {
        this.checktime = checktime;
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
     * 获取订单类型
     * 
     * @return 订单类型
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * 设置订单类型
     * 
     * @param type
     *          订单类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取下单员
     * 
     * @return 下单员
     */
    public Long getCreater() {
        return this.creater;
    }

    /**
     * 设置下单员
     * 
     * @param creater
     *          下单员
     */
    public void setCreater(Long creater) {
        this.creater = creater;
    }

    /**
     * 获取审核员工编号
     * 
     * @return 审核员工编号
     */
    public Long getChecker() {
        return this.checker;
    }

    /**
     * 设置审核员工编号
     * 
     * @param checker
     *          审核员工编号
     */
    public void setChecker(Long checker) {
        this.checker = checker;
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
     * 获取供应商及客户编号
     * 
     * @return 供应商及客户编号
     */
    public Long getSupplieruuid() {
        return this.supplieruuid;
    }

    /**
     * 设置供应商及客户编号
     * 
     * @param supplieruuid
     *          供应商及客户编号
     */
    public void setSupplieruuid(Long supplieruuid) {
        this.supplieruuid = supplieruuid;
    }

    /**
     * 获取合计金额
     * 
     * @return 合计金额
     */
    public Long getTotalmoney() {
        return this.totalmoney;
    }

    /**
     * 设置合计金额
     * 
     * @param totalmoney
     *          合计金额
     */
    public void setTotalmoney(Long totalmoney) {
        this.totalmoney = totalmoney;
    }

    /**
     * 获取订单状态
     * 
     * @return 订单状态
     */
    public Integer getState() {
        return this.state;
    }

    /**
     * 设置订单状态
     * 
     * @param state
     *          订单状态
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取运单号
     * 
     * @return 运单号
     */
    public Long getWaybillsn() {
        return this.waybillsn;
    }

    /**
     * 设置运单号
     * 
     * @param waybillsn
     *          运单号
     */
    public void setWaybillsn(Long waybillsn) {
        this.waybillsn = waybillsn;
    }

    /**
     * 获取原订单编号
     * 
     * @return 原订单编号
     */
    public Long getOrdersuuid() {
        return this.ordersuuid;
    }

    /**
     * 设置原订单编号
     * 
     * @param ordersuuid
     *          原订单编号
     */
    public void setOrdersuuid(Long ordersuuid) {
        this.ordersuuid = ordersuuid;
    }
}