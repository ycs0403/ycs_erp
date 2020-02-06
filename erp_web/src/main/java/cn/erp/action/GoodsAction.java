package cn.erp.action;

import cn.erp.actioncommon.BaseAction;
import cn.erp.biz.IGoodsBiz;
import cn.erp.entity.Goods;

/**
 * @author ��С��-��
  * ����ʱ�䣺2019��7��29�� ����3:20:15  
 * @version 1.0 
  * ������
 */
public class GoodsAction extends BaseAction<Goods>{

	private IGoodsBiz iGoodsBiz;

	public void setiGoodsBiz(IGoodsBiz iGoodsBiz) {
		this.iGoodsBiz = iGoodsBiz;
		super.setiBaseBiz(this.iGoodsBiz);
	}
	
}
