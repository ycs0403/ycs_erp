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
**类  名：XsopHist
**描  述：工序完工记录表
**创建者：changsheng-yu
**创建时间：2019-07-2911:08:24
****************************************************************/

package cn.erp.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
*工序完工记录表(xsop_hist)
*
*@author changsheng-yu
*/
@Entity
@Table(name = "xsop_hist")
public class XsopHist implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 2342937435278007701L;

    /** 域 */
    @Column(name = "op_domain", nullable = false, length = 16)
    private String opDomain;

    /** 地点 */
    @Column(name = "op_site", nullable = false, length = 16)
    private String opSite;

    /** 生产线 */
    @Column(name = "op_line", nullable = false, length = 16)
    private String opLine;

    /** 加工单 */
    @Column(name = "op_wo_nbr", nullable = true, length = 16)
    private String opWoNbr;

    /** 账务日期 */
    @Column(name = "op_date", nullable = true, length = 7)
    private Date opDate;

    /** 班次 */
    @Column(name = "op_shift", nullable = true, length = 16)
    private String opShift;

    /** 工序 */
    @Column(name = "op_wo_op", nullable = false, length = 5)
    private Integer opWoOp;

    /** 产品 */
    @Column(name = "op_part", nullable = false, length = 18)
    private String opPart;

    /** 计划数 */
    @Column(name = "op_qty_wip", nullable = false, length = 10)
    private Long opQtyWip;

    /** 本次完工数 */
    @Column(name = "op_qty_comp", nullable = true, length = 10)
    private Long opQtyComp;

    /** 运行环境 */
    @Column(name = "op_eng_code", nullable = true, length = 18)
    private String opEngCode;

    /** 工人 */
    @Column(name = "op_userid", nullable = true, length = 16)
    private String opUserid;

    /** 系统日期 */
    @Column(name = "op_tran_date", nullable = true, length = 7)
    private Date opTranDate;

    /**
     * 获取域
     * 
     * @return 域
     */
    public String getOpDomain() {
        return this.opDomain;
    }

    /**
     * 设置域
     * 
     * @param opDomain
     *          域
     */
    public void setOpDomain(String opDomain) {
        this.opDomain = opDomain;
    }

    /**
     * 获取地点
     * 
     * @return 地点
     */
    public String getOpSite() {
        return this.opSite;
    }

    /**
     * 设置地点
     * 
     * @param opSite
     *          地点
     */
    public void setOpSite(String opSite) {
        this.opSite = opSite;
    }

    /**
     * 获取生产线
     * 
     * @return 生产线
     */
    public String getOpLine() {
        return this.opLine;
    }

    /**
     * 设置生产线
     * 
     * @param opLine
     *          生产线
     */
    public void setOpLine(String opLine) {
        this.opLine = opLine;
    }

    /**
     * 获取加工单
     * 
     * @return 加工单
     */
    public String getOpWoNbr() {
        return this.opWoNbr;
    }

    /**
     * 设置加工单
     * 
     * @param opWoNbr
     *          加工单
     */
    public void setOpWoNbr(String opWoNbr) {
        this.opWoNbr = opWoNbr;
    }

    /**
     * 获取账务日期
     * 
     * @return 账务日期
     */
    public Date getOpDate() {
        return this.opDate;
    }

    /**
     * 设置账务日期
     * 
     * @param opDate
     *          账务日期
     */
    public void setOpDate(Date opDate) {
        this.opDate = opDate;
    }

    /**
     * 获取班次
     * 
     * @return 班次
     */
    public String getOpShift() {
        return this.opShift;
    }

    /**
     * 设置班次
     * 
     * @param opShift
     *          班次
     */
    public void setOpShift(String opShift) {
        this.opShift = opShift;
    }

    /**
     * 获取工序
     * 
     * @return 工序
     */
    public Integer getOpWoOp() {
        return this.opWoOp;
    }

    /**
     * 设置工序
     * 
     * @param opWoOp
     *          工序
     */
    public void setOpWoOp(Integer opWoOp) {
        this.opWoOp = opWoOp;
    }

    /**
     * 获取产品
     * 
     * @return 产品
     */
    public String getOpPart() {
        return this.opPart;
    }

    /**
     * 设置产品
     * 
     * @param opPart
     *          产品
     */
    public void setOpPart(String opPart) {
        this.opPart = opPart;
    }

    /**
     * 获取计划数
     * 
     * @return 计划数
     */
    public Long getOpQtyWip() {
        return this.opQtyWip;
    }

    /**
     * 设置计划数
     * 
     * @param opQtyWip
     *          计划数
     */
    public void setOpQtyWip(Long opQtyWip) {
        this.opQtyWip = opQtyWip;
    }

    /**
     * 获取本次完工数
     * 
     * @return 本次完工数
     */
    public Long getOpQtyComp() {
        return this.opQtyComp;
    }

    /**
     * 设置本次完工数
     * 
     * @param opQtyComp
     *          本次完工数
     */
    public void setOpQtyComp(Long opQtyComp) {
        this.opQtyComp = opQtyComp;
    }

    /**
     * 获取运行环境
     * 
     * @return 运行环境
     */
    public String getOpEngCode() {
        return this.opEngCode;
    }

    /**
     * 设置运行环境
     * 
     * @param opEngCode
     *          运行环境
     */
    public void setOpEngCode(String opEngCode) {
        this.opEngCode = opEngCode;
    }

    /**
     * 获取工人
     * 
     * @return 工人
     */
    public String getOpUserid() {
        return this.opUserid;
    }

    /**
     * 设置工人
     * 
     * @param opUserid
     *          工人
     */
    public void setOpUserid(String opUserid) {
        this.opUserid = opUserid;
    }

    /**
     * 获取系统日期
     * 
     * @return 系统日期
     */
    public Date getOpTranDate() {
        return this.opTranDate;
    }

    /**
     * 设置系统日期
     * 
     * @param opTranDate
     *          系统日期
     */
    public void setOpTranDate(Date opTranDate) {
        this.opTranDate = opTranDate;
    }
}