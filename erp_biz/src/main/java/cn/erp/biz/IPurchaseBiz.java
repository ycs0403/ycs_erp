package cn.erp.biz;

import java.util.Date;
import java.util.List;


/**
* @ClassName: IPurchaseBiz
* @author: ycs
* @date: 2020��1��25�� ����8:46:54 
* @Description:�ɹ�����ͳ��
*/
public interface IPurchaseBiz{

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
	 * @Description: ͳ��ĳ����ÿ���µĲɹ�����
	 * @param: @param year
	 * @param: @return      
	 * @return: List<Map<String,Object>>      
	 * @throws   
	 */  
	//public List<Map<String, Object>> trendReport(int year);
}
