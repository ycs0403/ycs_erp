package cn.redsun.ws;

import java.util.List;

import javax.jws.WebService;

import cn.redsun.entity.Waybilldetail;

@WebService
public interface IWaybillWs {
	/**   
	 * @Title: waybills   
	 * @Description: �����˵��Ų�ѯ�˵�����
	 * @param: @param sn
	 * @param: @return      
	 * @return: List<Waybill>      
	 * @throws   
	 */  
	public List<Waybilldetail> waybills(Long sn);
	
	/**   
	 * @Title: addWaybill   
	 * @Description: �����µ�ԤԼ
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
