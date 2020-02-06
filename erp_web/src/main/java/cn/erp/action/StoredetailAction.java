package cn.erp.action;

import java.util.List;

import com.alibaba.fastjson.JSON;

import cn.erp.actioncommon.BaseAction;
import cn.erp.biz.IStoredetailBiz;
import cn.erp.common_util.CommonAction;
import cn.erp.common_util.ErpException;
import cn.erp.entity.Emp;
import cn.erp.entity.StoreAlert;
import cn.erp.entity.Storedetail;



/**
 * @ClassName: StoredetailAction
 * @author: ycs
 * @date: 2019年12月17日 上午11:00:16 
 * @Description:仓库库存
 */
public class StoredetailAction extends BaseAction<Storedetail>{

	private IStoredetailBiz iStoredetailBiz;

	public void setiStoredetailBiz(IStoredetailBiz iStoredetailBiz) {
		this.iStoredetailBiz = iStoredetailBiz;
		super.setiBaseBiz(this.iStoredetailBiz);
	}
	
	private CommonAction<Emp> commonAction=new CommonAction<Emp>();

	/**   
	 * @Title: inStoreAlertList   
	 * @Description: 库存预警-采购
	 * @param:       
	 * @return: void      
	 * @throws   
	 */  
	public void storeAlertList() {
		List<StoreAlert> list=iStoredetailBiz.getStoreAlertList();
		String jsonString=JSON.toJSONString(list);
		commonAction.write(jsonString);
	}

	/**   
	 * @Title: sendAlertMail   
	 * @Description: 发送警报邮件
	 * @param:       
	 * @return: void      
	 * @throws   
	 */  
	public void sendStoreAlertMail() {
		try {
			iStoredetailBiz.sendStoreAlertMail();
			commonAction.ajaxReturn(true, "发送成功");
		} catch (ErpException e) {
			commonAction.ajaxReturn(false, e.getMessage());
		}
	}
}
