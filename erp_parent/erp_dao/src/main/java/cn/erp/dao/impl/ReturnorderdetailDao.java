package cn.erp.dao.impl;

import org.hibernate.criterion.DetachedCriteria;

import cn.erp.dao.IReturnorderdetailDao;
import cn.erp.daocommon.impl.BaseDao;
import cn.erp.entity.Returnorderdetail;



/**
* @ClassName: ReturnorderdetailDao
* @author: ycs
* @date: 2019年12月19日 上午10:53:55 
* @Description:退货订单明细
*/
public class ReturnorderdetailDao extends BaseDao<Returnorderdetail> implements IReturnorderdetailDao{
	/**
	 * 描述:代码优化，升级离线查询，提取为私有公共方法
	 *@return
	 */
	public DetachedCriteria getDetachedCriteria(Returnorderdetail returnorderdetail,Returnorderdetail returnorderdetail2,Object param) {
		DetachedCriteria dc=DetachedCriteria.forClass(Returnorderdetail.class);
		if(returnorderdetail!=null) {

		}
		return dc;
	}
}
