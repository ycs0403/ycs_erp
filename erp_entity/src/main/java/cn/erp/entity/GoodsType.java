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
**类  名：Goodstype
**描  述：商品分类
**创建者：changsheng-yu
**创建时间：2019-07-2911:08:24
****************************************************************/

package cn.erp.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
*商品分类(goodstype)
*
*@author changsheng-yu
*/
@Entity
@Table(name = "goodstype")
public class GoodsType implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -7446961050151671230L;

    /** 商品类型编号 */
    @Id
    @Column(name = "uuid", unique = true, nullable = false)
    private Long uuid;

    /** 商品类型名称 */
    @Column(name = "name", nullable = true, length = 30)
    private String name;

    /**
     * 获取商品类型编号
     * 
     * @return 商品类型编号
     */
    public Long getUuid() {
        return this.uuid;
    }

    /**
     * 设置商品类型编号
     * 
     * @param uuid
     *          商品类型编号
     */
    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    /**
     * 获取商品类型名称
     * 
     * @return 商品类型名称
     */
    public String getName() {
        return this.name;
    }

    /**
     * 设置商品类型名称
     * 
     * @param name
     *          商品类型名称
     */
    public void setName(String name) {
        this.name = name;
    }
}