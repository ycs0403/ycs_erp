/****************************************************************
**类  名：Waybilldetail
**描  述：运单明细
**创建者：ycs
**创建时间：2020-02-2117:49:45
****************************************************************/

package cn.redsun.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
*(waybilldetail)
*
*@author ycs
*/
@Entity
@Table(name = "waybilldetail")
public class Waybilldetail implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 8280381566521226444L;

    /** ID */
    @Id
    @Column(name = "id", unique = true, nullable = false, length = 19)
    private Long id;

    /** 运单号 */
    @Column(name = "sn", nullable = true, length = 19)
    private Long sn;

    /** 执行日期 */
    @Column(name = "exedate", nullable = true, length = 10)
    private String exedate;

    /** 执行时间 */
    @Column(name = "exetime", nullable = true, length = 10)
    private String exetime;

    /** 执行信息 */
    @Column(name = "info", nullable = true, length = 100)
    private String info;

    /**
     * 获取ID
     * 
     * @return ID
     */
    public Long getId() {
        return this.id;
    }

    /**
     * 设置ID
     * 
     * @param id
     *          ID
     */
    public void setId(Long id) {
        this.id = id;
    }

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
     * 获取执行日期
     * 
     * @return 执行日期
     */
    public String getExedate() {
        return this.exedate;
    }

    /**
     * 设置执行日期
     * 
     * @param exedate
     *          执行日期
     */
    public void setExedate(String exedate) {
        this.exedate = exedate;
    }

    /**
     * 获取执行时间
     * 
     * @return 执行时间
     */
    public String getExetime() {
        return this.exetime;
    }

    /**
     * 设置执行时间
     * 
     * @param exetime
     *          执行时间
     */
    public void setExetime(String exetime) {
        this.exetime = exetime;
    }

    /**
     * 获取执行信息
     * 
     * @return 执行信息
     */
    public String getInfo() {
        return this.info;
    }

    /**
     * 设置执行信息
     * 
     * @param info
     *          执行信息
     */
    public void setInfo(String info) {
        this.info = info;
    }
}