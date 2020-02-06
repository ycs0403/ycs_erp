package cn.erp.biz;

import cn.erp.bizcommon.IBaseBiz;
import cn.erp.entity.Orders;


/**
* @ClassName: IOrdersBiz
* @author: ycs
* @date: 2019年10月17日 下午4:47:27 
* @Description:订单
*/
public interface IOrdersBiz extends IBaseBiz<Orders>{
	
	//订单审核
	public void doCheck(Long uuid,Long empUuid);
	
	//订单确认
	public void doStart(Long uuid,Long empUuid);
}
