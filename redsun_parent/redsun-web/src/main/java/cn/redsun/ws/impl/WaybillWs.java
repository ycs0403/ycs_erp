package cn.redsun.ws.impl;

import java.util.List;

import cn.redsun.biz.IWaybillBiz;
import cn.redsun.biz.IWaybilldetailBiz;
import cn.redsun.entity.Waybill;
import cn.redsun.entity.Waybilldetail;
import cn.redsun.ws.IWaybillWs;

/**
* @ClassName: WaybilldetailWs
* @author: ycs
* @date: 2020年2月21日 下午10:14:42 
* @Description:描述
*/
public class WaybillWs implements IWaybillWs {
	
	private IWaybillBiz iWaybillBiz;
	private IWaybilldetailBiz iWaybilldetailBiz;
	
	public void setiWaybillBiz(IWaybillBiz iWaybillBiz) {
		this.iWaybillBiz = iWaybillBiz;
	}
	public void setiWaybilldetailBiz(IWaybilldetailBiz iWaybilldetailBiz) {
		this.iWaybilldetailBiz = iWaybilldetailBiz;
	}

	/**   
	 * @Title: waybills   
	 * @Description: 根据运单号查询运单详情
	 * @param: @param sn
	 * @param: @return      
	 * @return: List<Waybill>      
	 * @throws   
	 */  
	@Override
	public List<Waybilldetail> waybills(Long sn) {
		Waybilldetail waybilldetail=new Waybilldetail();
		waybilldetail.setSn(sn);
		return iWaybilldetailBiz.getList(waybilldetail, null, null);
	}

	/**   
	 * @Title: addWaybill   
	 * @Description: 在线下单预约
	 * @param: @param userId
	 * @param: @param toAddress
	 * @param: @param addressee
	 * @param: @param tele
	 * @param: @param info
	 * @param: @return      
	 * @return: Long      
	 * @throws   
	 */  
	@Override
	public Long addWaybill(Long userId, String toAddress, String addressee, String tele, String info) {
		Waybill waybill=new Waybill();
		waybill.setAddressee(addressee);
		waybill.setInfo(info);
		waybill.setState("0");
		waybill.setTele(tele);
		waybill.setToaddress(toAddress);
		iWaybillBiz.add(waybill);
		return waybill.getSn();
	}

}
