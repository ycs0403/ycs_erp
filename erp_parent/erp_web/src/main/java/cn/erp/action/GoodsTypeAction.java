package cn.erp.action;

import cn.erp.actioncommon.BaseAction;
import cn.erp.biz.IGoodsTypeBiz;
import cn.erp.entity.GoodsType;

/**
 * @author 黑小子-余
  * 创建时间：2019年7月29日 下午3:20:15  
 * @version 1.0 
  * 描述：
 */
public class GoodsTypeAction extends BaseAction<GoodsType>{

	private IGoodsTypeBiz iGoodsTypeBiz;

	public void setiGoodsTypeBiz(IGoodsTypeBiz iGoodsTypeBiz) {
		this.iGoodsTypeBiz = iGoodsTypeBiz;
		super.setiBaseBiz(this.iGoodsTypeBiz);
	}
	
}
