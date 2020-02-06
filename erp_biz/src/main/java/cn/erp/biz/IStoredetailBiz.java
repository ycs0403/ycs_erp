package cn.erp.biz;

import java.util.List;

import cn.erp.bizcommon.IBaseBiz;
import cn.erp.entity.StoreAlert;
import cn.erp.entity.Storedetail;



/**
* @ClassName: IStoredetailBiz
* @author: ycs
* @date: 2019年12月17日 上午10:44:15 
* @Description:仓库库存
*/
public interface IStoredetailBiz extends IBaseBiz<Storedetail>{
	/**   
	 * @Title: getStoreAlertList   
	 * @Description: 库存预警列表
	 * @param: @return      
	 * @return: List<StoreAlert>      
	 * @throws   
	 */  
	public List<StoreAlert> getStoreAlertList();
	
	
	/**
	 * @throws 
	 * @Title: sendStoreAlertMail   
	 * @Description: 发送库存预警警告邮件
	 * @param:       
	 * @return: void      
	 * @throws   
	 */  
	public void sendStoreAlertMail();
}
