package cn.erp.dao;

import java.util.Date;
import java.util.List;

/**
* @ClassName: IPurchaseDao
* @author: ycs
* @date: 2020��1��25�� ����8:35:53 
* @Description:�ɹ�����ͳ��
*/
public interface IPurchaseDao{

	/**   
	 * @Title: orderPurchase   
	 * @Description: �ɹ�����ͳ�� 
	 * @param: @param startDate
	 * @param: @param eendDate
	 * @param: @return      
	 * @return: List      
	 * @throws   
	 */  
	@SuppressWarnings("rawtypes")
	public List orderPurchase(Date startDate,Date endDate);
	
	/**   
	 * @Title: getSumMoney   
	 * @Description: ͳ��ĳ����ÿ���µĲɹ���
	 * @param: @param year
	 * @param: @return      
	 * @return: List<Map<String,Object>>      
	 * @throws   
	 */  
	//public List<Map<String, Object>> getSumMoney(int year);
	
	
}
