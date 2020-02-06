package cn.erp.action;

import cn.erp.actioncommon.BaseAction;
import cn.erp.biz.IGoodsTypeBiz;
import cn.erp.entity.GoodsType;

/**
 * @author ��С��-��
  * ����ʱ�䣺2019��7��29�� ����3:20:15  
 * @version 1.0 
  * ������
 */
public class GoodsTypeAction extends BaseAction<GoodsType>{

	private IGoodsTypeBiz iGoodsTypeBiz;

	public void setiGoodsTypeBiz(IGoodsTypeBiz iGoodsTypeBiz) {
		this.iGoodsTypeBiz = iGoodsTypeBiz;
		super.setiBaseBiz(this.iGoodsTypeBiz);
	}
	
}
