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
**类  名：Orders
**描  述：订单
**创建者：changsheng-yu
**创建时间：2019-07-2911:08:24
****************************************************************/

package cn.erp.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
*订单(orders)
*
*@author changsheng-yu
*/
@Entity
@Table(name = "orders")
public class Orders implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -3615693274737621297L;

    /** 编号 */
    @Id
    @Column(name = "uuid", unique = true, nullable = false)
    private Long uuid;

    /** 生成日期 */
    @Column(name = "createtime", nullable = true, length = 7)
    private Date createtime;

    /** 审核日期 */
    @Column(name = "checktime", nullable = true, length = 7)
    private Date checktime;

    /** 确认日期 */
    @Column(name = "starttime", nullable = true, length = 7)
    private Date starttime;

    /** 入库或出库日期 */
    @Column(name = "endtime", nullable = true, length = 7)
    private Date endtime;

    /** 1:采购 2:销售 */
    @Column(name = "type", nullable = true, length = 1)
    private Integer type;

    /** 下单员 */
    @Column(name = "creater", nullable = true)
    private Long creater;

    /** 审核员 */
    @Column(name = "checker", nullable = true)
    private Long checker;

    /** 采购员 */
    @Column(name = "starter", nullable = true)
    private Long starter;

    /** 库管员 */
    @Column(name = "ender", nullable = true)
    private Long ender;

    /** 供应商或客户 */
    @Column(name = "supplieruuid", nullable = true)
    private Long supplieruuid;

    /** 合计金额 */
    @Column(name = "totalmoney", nullable = true, length = 10)
    private Double totalmoney;

    /** 采购: 0:未审核 1:已审核, 2:已确认, 3:已入库；销售：0:未出库 1:已出库 */
    @Column(name = "state", nullable = true, length = 1)
    private Integer state;

    /** 运单号 */
    @Column(name = "waybillsn", nullable = true)
    private Long waybillsn;
    
	/** 
	 * 一个orders对应多个详细
	 **/
    private List<Orderdetail> orderdetail;
    
    public List<Orderdetail> getOrderdetail() {
		return orderdetail;
	}
	public void setOrderdetail(List<Orderdetail> orderdetail) {
		this.orderdetail = orderdetail;
	}

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
     * 获取审核日期
     * 
     * @return 审核日期
     */
    public Date getChecktime() {
        return this.checktime;
    }

    /**
     * 设置审核日期
     * 
     * @param checktime
     *          审核日期
     */
    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    /**
     * 获取确认日期
     * 
     * @return 确认日期
     */
    public Date getStarttime() {
        return this.starttime;
    }

    /**
     * 设置确认日期
     * 
     * @param starttime
     *          确认日期
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * 获取入库或出库日期
     * 
     * @return 入库或出库日期
     */
    public Date getEndtime() {
        return this.endtime;
    }

    /**
     * 设置入库或出库日期
     * 
     * @param endtime
     *          入库或出库日期
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * 获取1:采购 2:销售
     * 
     * @return 1:采购 2:销售
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * 设置1:采购 2:销售
     * 
     * @param type
     *          1:采购 2:销售
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
     * 获取审核员
     * 
     * @return 审核员
     */
    public Long getChecker() {
        return this.checker;
    }

    /**
     * 设置审核员
     * 
     * @param checker
     *          审核员
     */
    public void setChecker(Long checker) {
        this.checker = checker;
    }

    /**
     * 获取采购员
     * 
     * @return 采购员
     */
    public Long getStarter() {
        return this.starter;
    }

    /**
     * 设置采购员
     * 
     * @param starter
     *          采购员
     */
    public void setStarter(Long starter) {
        this.starter = starter;
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
     * 获取供应商或客户
     * 
     * @return 供应商或客户
     */
    public Long getSupplieruuid() {
        return this.supplieruuid;
    }

    /**
     * 设置供应商或客户
     * 
     * @param supplieruuid
     *          供应商或客户
     */
    public void setSupplieruuid(Long supplieruuid) {
        this.supplieruuid = supplieruuid;
    }

    /**
     * 获取合计金额
     * 
     * @return 合计金额
     */
    public Double getTotalmoney() {
        return this.totalmoney;
    }

    /**
     * 设置合计金额
     * 
     * @param totalmoney
     *          合计金额
     */
    public void setTotalmoney(Double totalmoney) {
        this.totalmoney = totalmoney;
    }

    /**
     * 获取采购: 0:未审核 1:已审核, 2:已确认, 3:已入库；销售：0:未出库 1:已出库
     * 
     * @return 采购: 0:未审核 1:已审核
     */
    public Integer getState() {
        return this.state;
    }

    /**
     * 设置采购: 0:未审核 1:已审核, 2:已确认, 3:已入库；销售：0:未出库 1:已出库
     * 
     * @param state
     *          采购: 0:未审核 1:已审核
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
}