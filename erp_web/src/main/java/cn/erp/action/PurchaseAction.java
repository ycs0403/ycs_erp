package cn.erp.action;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.alibaba.fastjson.JSON;

import cn.erp.biz.IPurchaseBiz;

/**
* @ClassName: PurchaseAction
* @author: ycs
* @date: 2020年1月25日 下午8:50:48 
* @Description:采购表报表统计
*/
public class PurchaseAction{
	
	private IPurchaseBiz iPurchaseBiz;

	public void setiPurchaseBiz(IPurchaseBiz iPurchaseBiz) {
		this.iPurchaseBiz = iPurchaseBiz;
	}
	
	private Date startDate;//开始时间
	private Date endDate;//结束时间
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	/**   
	 * @Title: orderPurchase   
	 * @Description: 采购统计报表
	 * @param:       
	 * @return: void      
	 * @throws   
	 */  
	@SuppressWarnings("rawtypes")
	public void orderPurchase() {
		List list = iPurchaseBiz.orderPurchase(startDate, endDate);
		System.out.println(startDate+"---"+endDate+"---"+list.toString());
		write(JSON.toJSONString(list));
	}
	
	public void write(String mapString) {
		//范湖对象
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		
		try {
			//输出给页面
			response.getWriter().write(mapString);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private int year;

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	/**   
	 * @Title: trendReport   
	 * @Description: 采购趋势
	 * @param:       
	 * @return: void      
	 * @throws   
	 */  

}
