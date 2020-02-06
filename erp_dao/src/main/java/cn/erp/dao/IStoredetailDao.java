package cn.erp.dao;


import java.util.List;

import cn.erp.daocommon.IBaseDao;
import cn.erp.entity.StoreAlert;
import cn.erp.entity.Storedetail;



/**
* @ClassName: IStoredetailDao
* @author: ycs
* @date: 2019年12月17日 上午10:19:16 
* @Description:仓库库存
*/
public interface IStoredetailDao extends IBaseDao<Storedetail>{

	/**   
	 * @Title: getStoreAlertList   
	 * @Description: 库存预警列表
	 * @param: @return      
	 * @return: List<StoreAlert>      
	 * @throws   
	 */  
	public List<StoreAlert> getStoreAlertList();
}
