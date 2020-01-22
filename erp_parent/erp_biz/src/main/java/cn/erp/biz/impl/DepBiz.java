package cn.erp.biz.impl;


import cn.erp.biz.IDepBiz;
import cn.erp.bizcommon.impl.BaseBiz;
import cn.erp.dao.IDepDao;
import cn.erp.entity.Dep;

/**
 * @author 黑小子-余
  * 创建时间：2019年5月29日 下午11:37:58  
 * @version 1.0 
  * 描述：部门业务逻辑实现类
 */
public class DepBiz extends BaseBiz<Dep> implements IDepBiz{

	private IDepDao iDepDao;//注入部门dao
	
	public void setiDepDao(IDepDao iDepDao) {
		this.iDepDao = iDepDao;
		super.setiBaseDao(this.iDepDao);
	}
	
}
