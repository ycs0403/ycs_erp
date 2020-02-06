package cn.erp.dao.impl;

import org.hibernate.criterion.DetachedCriteria;

import cn.erp.dao.IXsopHistDao;
import cn.erp.daocommon.impl.BaseDao;
import cn.erp.entity.XsopHist;



/**
* @ClassName: XsopHistDao
* @author: ycs
* @date: 2019年12月17日 上午10:31:43 
* @Description:工序完工记录表
*/
public class XsopHistDao extends BaseDao<XsopHist> implements IXsopHistDao{
	/**
	 * 描述:代码优化，升级离线查询，提取为私有公共方法
	 *@return
	 */
	public DetachedCriteria getDetachedCriteria(XsopHist xsopHist,XsopHist xsopHist2,Object param) {
		DetachedCriteria dc=DetachedCriteria.forClass(XsopHist.class);
		if(xsopHist!=null) {

		}
		return dc;
	}
}
