package cn.erp.biz;

import java.util.List;

import cn.erp.bizcommon.IBaseBiz;
import cn.erp.entity.StoreAlert;
import cn.erp.entity.Storedetail;



/**
* @ClassName: IStoredetailBiz
* @author: ycs
* @date: 2019��12��17�� ����10:44:15 
* @Description:�ֿ���
*/
public interface IStoredetailBiz extends IBaseBiz<Storedetail>{
	/**   
	 * @Title: getStoreAlertList   
	 * @Description: ���Ԥ���б�
	 * @param: @return      
	 * @return: List<StoreAlert>      
	 * @throws   
	 */  
	public List<StoreAlert> getStoreAlertList();
	
	
	/**
	 * @throws 
	 * @Title: sendStoreAlertMail   
	 * @Description: ���Ϳ��Ԥ�������ʼ�
	 * @param:       
	 * @return: void      
	 * @throws   
	 */  
	public void sendStoreAlertMail();
}
