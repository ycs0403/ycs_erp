package cn.erp.biz;

import cn.erp.bizcommon.IBaseBiz;
import cn.erp.entity.Orders;


/**
* @ClassName: IOrdersBiz
* @author: ycs
* @date: 2019��10��17�� ����4:47:27 
* @Description:����
*/
public interface IOrdersBiz extends IBaseBiz<Orders>{
	
	//�������
	public void doCheck(Long uuid,Long empUuid);
	
	//����ȷ��
	public void doStart(Long uuid,Long empUuid);
}
