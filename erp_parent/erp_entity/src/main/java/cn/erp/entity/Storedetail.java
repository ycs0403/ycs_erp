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
**类  名：Storedetail
**描  述：仓库库存
**创建者：changsheng-yu
**创建时间：2019-07-2911:08:24
****************************************************************/

package cn.erp.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
*仓库库存(storedetail)
*
*@author changsheng-yu
*/
@Entity
@Table(name = "storedetail")
public class Storedetail implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -7143198391267379901L;

    /** 编号 */
    @Id
    @Column(name = "uuid", unique = true, nullable = false)
    private Long uuid;

    /** 仓库编号 */
    @Column(name = "storeuuid", nullable = true)
    private Long storeuuid;

    /** 商品编号 */
    @Column(name = "goodsuuid", nullable = true)
    private Long goodsuuid;

    /** 数量 */
    @Column(name = "num", nullable = true)
    private Long num;

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
}