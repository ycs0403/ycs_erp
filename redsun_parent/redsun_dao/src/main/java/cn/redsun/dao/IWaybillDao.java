package cn.redsun.dao;

import java.util.List;

import cn.erp.daocommon.IBaseDao;
import cn.redsun.entity.Waybill;
import cn.redsun.entity.Waybilldetail;

/**
* @ClassName: IWaybillBiz
* @author: ycs
* @date: 2020年2月21日 下午8:41:11 
* @Description:运单接口-biz
*/
public interface IWaybillDao extends IBaseDao<Waybill>{

	/**   
	 * @Title: waybills   
	 * @Description: 根据运单号查询运单详情
	 * @param: @param sn
	 * @param: @return      
	 * @return: List<Waybill>      
	 * @throws   
	 */  
	public List<Waybilldetail> waybills(Long sn);
	
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
	public Long addWaybill(Long userId,String toAddress,String addressee,String tele,String info);
}
