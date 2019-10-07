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
**��  ����XsopHist
**��  ���������깤��¼��
**�����ߣ�changsheng-yu
**����ʱ�䣺2019-07-2911:08:24
****************************************************************/

package cn.erp.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
*�����깤��¼��(xsop_hist)
*
*@author changsheng-yu
*/
@Entity
@Table(name = "xsop_hist")
public class XsopHist implements java.io.Serializable {
    /** �汾�� */
    private static final long serialVersionUID = 2342937435278007701L;

    /** �� */
    @Column(name = "op_domain", nullable = false, length = 16)
    private String opDomain;

    /** �ص� */
    @Column(name = "op_site", nullable = false, length = 16)
    private String opSite;

    /** ������ */
    @Column(name = "op_line", nullable = false, length = 16)
    private String opLine;

    /** �ӹ��� */
    @Column(name = "op_wo_nbr", nullable = true, length = 16)
    private String opWoNbr;

    /** �������� */
    @Column(name = "op_date", nullable = true, length = 7)
    private Date opDate;

    /** ��� */
    @Column(name = "op_shift", nullable = true, length = 16)
    private String opShift;

    /** ���� */
    @Column(name = "op_wo_op", nullable = false, length = 5)
    private Integer opWoOp;

    /** ��Ʒ */
    @Column(name = "op_part", nullable = false, length = 18)
    private String opPart;

    /** �ƻ��� */
    @Column(name = "op_qty_wip", nullable = false, length = 10)
    private Long opQtyWip;

    /** �����깤�� */
    @Column(name = "op_qty_comp", nullable = true, length = 10)
    private Long opQtyComp;

    /** ���л��� */
    @Column(name = "op_eng_code", nullable = true, length = 18)
    private String opEngCode;

    /** ���� */
    @Column(name = "op_userid", nullable = true, length = 16)
    private String opUserid;

    /** ϵͳ���� */
    @Column(name = "op_tran_date", nullable = true, length = 7)
    private Date opTranDate;

    /**
     * ��ȡ��
     * 
     * @return ��
     */
    public String getOpDomain() {
        return this.opDomain;
    }

    /**
     * ������
     * 
     * @param opDomain
     *          ��
     */
    public void setOpDomain(String opDomain) {
        this.opDomain = opDomain;
    }

    /**
     * ��ȡ�ص�
     * 
     * @return �ص�
     */
    public String getOpSite() {
        return this.opSite;
    }

    /**
     * ���õص�
     * 
     * @param opSite
     *          �ص�
     */
    public void setOpSite(String opSite) {
        this.opSite = opSite;
    }

    /**
     * ��ȡ������
     * 
     * @return ������
     */
    public String getOpLine() {
        return this.opLine;
    }

    /**
     * ����������
     * 
     * @param opLine
     *          ������
     */
    public void setOpLine(String opLine) {
        this.opLine = opLine;
    }

    /**
     * ��ȡ�ӹ���
     * 
     * @return �ӹ���
     */
    public String getOpWoNbr() {
        return this.opWoNbr;
    }

    /**
     * ���üӹ���
     * 
     * @param opWoNbr
     *          �ӹ���
     */
    public void setOpWoNbr(String opWoNbr) {
        this.opWoNbr = opWoNbr;
    }

    /**
     * ��ȡ��������
     * 
     * @return ��������
     */
    public Date getOpDate() {
        return this.opDate;
    }

    /**
     * ������������
     * 
     * @param opDate
     *          ��������
     */
    public void setOpDate(Date opDate) {
        this.opDate = opDate;
    }

    /**
     * ��ȡ���
     * 
     * @return ���
     */
    public String getOpShift() {
        return this.opShift;
    }

    /**
     * ���ð��
     * 
     * @param opShift
     *          ���
     */
    public void setOpShift(String opShift) {
        this.opShift = opShift;
    }

    /**
     * ��ȡ����
     * 
     * @return ����
     */
    public Integer getOpWoOp() {
        return this.opWoOp;
    }

    /**
     * ���ù���
     * 
     * @param opWoOp
     *          ����
     */
    public void setOpWoOp(Integer opWoOp) {
        this.opWoOp = opWoOp;
    }

    /**
     * ��ȡ��Ʒ
     * 
     * @return ��Ʒ
     */
    public String getOpPart() {
        return this.opPart;
    }

    /**
     * ���ò�Ʒ
     * 
     * @param opPart
     *          ��Ʒ
     */
    public void setOpPart(String opPart) {
        this.opPart = opPart;
    }

    /**
     * ��ȡ�ƻ���
     * 
     * @return �ƻ���
     */
    public Long getOpQtyWip() {
        return this.opQtyWip;
    }

    /**
     * ���üƻ���
     * 
     * @param opQtyWip
     *          �ƻ���
     */
    public void setOpQtyWip(Long opQtyWip) {
        this.opQtyWip = opQtyWip;
    }

    /**
     * ��ȡ�����깤��
     * 
     * @return �����깤��
     */
    public Long getOpQtyComp() {
        return this.opQtyComp;
    }

    /**
     * ���ñ����깤��
     * 
     * @param opQtyComp
     *          �����깤��
     */
    public void setOpQtyComp(Long opQtyComp) {
        this.opQtyComp = opQtyComp;
    }

    /**
     * ��ȡ���л���
     * 
     * @return ���л���
     */
    public String getOpEngCode() {
        return this.opEngCode;
    }

    /**
     * �������л���
     * 
     * @param opEngCode
     *          ���л���
     */
    public void setOpEngCode(String opEngCode) {
        this.opEngCode = opEngCode;
    }

    /**
     * ��ȡ����
     * 
     * @return ����
     */
    public String getOpUserid() {
        return this.opUserid;
    }

    /**
     * ���ù���
     * 
     * @param opUserid
     *          ����
     */
    public void setOpUserid(String opUserid) {
        this.opUserid = opUserid;
    }

    /**
     * ��ȡϵͳ����
     * 
     * @return ϵͳ����
     */
    public Date getOpTranDate() {
        return this.opTranDate;
    }

    /**
     * ����ϵͳ����
     * 
     * @param opTranDate
     *          ϵͳ����
     */
    public void setOpTranDate(Date opTranDate) {
        this.opTranDate = opTranDate;
    }
}