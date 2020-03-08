package cn.redsun.dao.impl;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import cn.erp.daocommon.impl.BaseDao;
import cn.redsun.dao.IWaybilldetailDao;
import cn.redsun.entity.Waybilldetail;

public class WaybilldetailDao extends BaseDao<Waybilldetail>  implements IWaybilldetailDao {

	public DetachedCriteria getDetachedCriteria(Waybilldetail waybilldetail,Waybilldetail waybilldetail2,Object param) {
		DetachedCriteria dc=DetachedCriteria.forClass(Waybilldetail.class);
		if(waybilldetail!=null) {
			if(null!=waybilldetail.getExedate()&&waybilldetail.getExedate().trim().length()>0) {
				dc.add(Restrictions.like("exedate", waybilldetail.getExedate(), MatchMode.ANYWHERE));
			}
			if(null!=waybilldetail.getExetime()&&waybilldetail.getExetime().trim().length()>0) {
				dc.add(Restrictions.like("exetime", waybilldetail.getExetime(), MatchMode.ANYWHERE));
			}
			if(null!=waybilldetail.getInfo()&&waybilldetail.getInfo().trim().length()>0) {
				dc.add(Restrictions.like("info", waybilldetail.getInfo(), MatchMode.ANYWHERE));
			}
			
			if(null!=waybilldetail.getSn()) {
				dc.add(Restrictions.eq("sn", waybilldetail.getSn()));
			}
		}
		return dc;
	}

}
