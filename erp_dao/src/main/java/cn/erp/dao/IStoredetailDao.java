package cn.erp.dao;


import java.util.List;

import cn.erp.daocommon.IBaseDao;
import cn.erp.entity.StoreAlert;
import cn.erp.entity.Storedetail;



/**
* @ClassName: IStoredetailDao
* @author: ycs
* @date: 2019��12��17�� ����10:19:16 
* @Description:�ֿ���
*/
public interface IStoredetailDao extends IBaseDao<Storedetail>{

	/**   
	 * @Title: getStoreAlertList   
	 * @Description: ���Ԥ���б�
	 * @param: @return      
	 * @return: List<StoreAlert>      
	 * @throws   
	 */  
	public List<StoreAlert> getStoreAlertList();
}
