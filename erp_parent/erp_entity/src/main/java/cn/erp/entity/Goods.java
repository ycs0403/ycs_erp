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
**类  名：Goods
**描  述：商品
**创建者：changsheng-yu
**创建时间：2019-07-2911:08:24
****************************************************************/

package cn.erp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
*商品(goods)
*
*@author changsheng-yu
*/
@Entity
@Table(name = "goods")
public class Goods implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -5583072927074511031L;

    /** 编号 */
    @Id
    @Column(name = "uuid", unique = true, nullable = false)
    private Long uuid;

    /** 名称 */
    @Column(name = "name", nullable = true, length = 30)
    private String name;

    /** 产地 */
    @Column(name = "origin", nullable = true, length = 30)
    private String origin;

    /** 厂家 */
    @Column(name = "producer", nullable = true, length = 30)
    private String producer;

    /** 计量单位 */
    @Column(name = "unit", nullable = true, length = 30)
    private String unit;

    /** 进货价格 */
    @Column(name = "inprice", nullable = true, length = 8)
    private Long inprice;

    /** 销售价格 */
    @Column(name = "outprice", nullable = true, length = 8)
    private Long outprice;

    /** 商品类型 */
    //@Column(name = "goodstypeuuid", nullable = true)
    //private Long goodstypeuuid;
    private GoodsType goodsType;
 
    public GoodsType getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(GoodsType goodsType) {
		this.goodsType = goodsType;
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
     * 获取名称
     * 
     * @return 名称
     */
    public String getName() {
        return this.name;
    }

    /**
     * 设置名称
     * 
     * @param name
     *          名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取产地
     * 
     * @return 产地
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * 设置产地
     * 
     * @param origin
     *          产地
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * 获取厂家
     * 
     * @return 厂家
     */
    public String getProducer() {
        return this.producer;
    }

    /**
     * 设置厂家
     * 
     * @param producer
     *          厂家
     */
    public void setProducer(String producer) {
        this.producer = producer;
    }

    /**
     * 获取计量单位
     * 
     * @return 计量单位
     */
    public String getUnit() {
        return this.unit;
    }

    /**
     * 设置计量单位
     * 
     * @param unit
     *          计量单位
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 获取进货价格
     * 
     * @return 进货价格
     */
    public Long getInprice() {
        return this.inprice;
    }

    /**
     * 设置进货价格
     * 
     * @param inprice
     *          进货价格
     */
    public void setInprice(Long inprice) {
        this.inprice = inprice;
    }

    /**
     * 获取销售价格
     * 
     * @return 销售价格
     */
    public Long getOutprice() {
        return this.outprice;
    }

    /**
     * 设置销售价格
     * 
     * @param outprice
     *          销售价格
     */
    public void setOutprice(Long outprice) {
        this.outprice = outprice;
    }

}