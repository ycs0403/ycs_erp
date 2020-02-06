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
**类  名：Inventory
**描  述：盘盈盘亏
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
*盘盈盘亏(inventory)
*
*@author changsheng-yu
*/
@Entity
@Table(name = "inventory")
public class Inventory implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -2766573535959965527L;

    /** 编号 */
    @Id
    @Column(name = "uuid", unique = true, nullable = false)
    private Long uuid;

    /** 商品 */
    @Column(name = "goodsuuid", nullable = true)
    private Long goodsuuid;

    /** 仓库 */
    @Column(name = "storeuuid", nullable = true)
    private Long storeuuid;

    /** 数量 */
    @Column(name = "num", nullable = true)
    private Long num;

    /** 类型 */
    @Column(name = "type", nullable = true, length = 1)
    private Integer type;

    /** 登记日期 */
    @Column(name = "createtime", nullable = true, length = 7)
    private Date createtime;

    /** 审核日期 */
    @Column(name = "checktime", nullable = true, length = 7)
    private Date checktime;

    /** 登记人 */
    @Column(name = "creater", nullable = true)
    private Long creater;

    /** 审核人 */
    @Column(name = "checker", nullable = true)
    private Long checker;

    /** 状态 */
    @Column(name = "state", nullable = true, length = 1)
    private Integer state;

    /** 备注 */
    @Column(name = "remark", nullable = true, length = 200)
    private String remark;

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
     * 获取商品
     * 
     * @return 商品
     */
    public Long getGoodsuuid() {
        return this.goodsuuid;
    }

    /**
     * 设置商品
     * 
     * @param goodsuuid
     *          商品
     */
    public void setGoodsuuid(Long goodsuuid) {
        this.goodsuuid = goodsuuid;
    }

    /**
     * 获取仓库
     * 
     * @return 仓库
     */
    public Long getStoreuuid() {
        return this.storeuuid;
    }

    /**
     * 设置仓库
     * 
     * @param storeuuid
     *          仓库
     */
    public void setStoreuuid(Long storeuuid) {
        this.storeuuid = storeuuid;
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
     * 获取类型
     * 
     * @return 类型
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * 设置类型
     * 
     * @param type
     *          类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取登记日期
     * 
     * @return 登记日期
     */
    public Date getCreatetime() {
        return this.createtime;
    }

    /**
     * 设置登记日期
     * 
     * @param createtime
     *          登记日期
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
     * 获取登记人
     * 
     * @return 登记人
     */
    public Long getCreater() {
        return this.creater;
    }

    /**
     * 设置登记人
     * 
     * @param creater
     *          登记人
     */
    public void setCreater(Long creater) {
        this.creater = creater;
    }

    /**
     * 获取审核人
     * 
     * @return 审核人
     */
    public Long getChecker() {
        return this.checker;
    }

    /**
     * 设置审核人
     * 
     * @param checker
     *          审核人
     */
    public void setChecker(Long checker) {
        this.checker = checker;
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
     * 获取备注
     * 
     * @return 备注
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * 设置备注
     * 
     * @param remark
     *          备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}