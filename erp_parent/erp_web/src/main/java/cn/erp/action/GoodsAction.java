package cn.erp.action;

import cn.erp.actioncommon.BaseAction;
import cn.erp.biz.IGoodsBiz;
import cn.erp.entity.Goods;

/**
 * @author 黑小子-余
  * 创建时间：2019年7月29日 下午3:20:15  
 * @version 1.0 
  * 描述：
 */
public class GoodsAction extends BaseAction<Goods>{

	private IGoodsBiz iGoodsBiz;

	public void setiGoodsBiz(IGoodsBiz iGoodsBiz) {
		this.iGoodsBiz = iGoodsBiz;
		super.setiBaseBiz(this.iGoodsBiz);
	}
	
}
