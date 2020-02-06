package cn.erp.biz;

import java.util.Date;
import java.util.List;


/**
* @ClassName: IPurchaseBiz
* @author: ycs
* @date: 2020年1月25日 下午8:46:54 
* @Description:采购表报表统计
*/
public interface IPurchaseBiz{

	/**   
	 * @Title: orderPurchase   
	 * @Description: 采购报表统计 
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
	 * @Description: 统计某年中每个月的采购趋势
	 * @param: @param year
	 * @param: @return      
	 * @return: List<Map<String,Object>>      
	 * @throws   
	 */  
	//public List<Map<String, Object>> trendReport(int year);
}
