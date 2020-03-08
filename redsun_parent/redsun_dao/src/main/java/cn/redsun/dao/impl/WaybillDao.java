package cn.redsun.dao.impl;

import java.util.List;

import cn.erp.daocommon.impl.BaseDao;
import cn.redsun.dao.IWaybillDao;
import cn.redsun.entity.Waybill;
import cn.redsun.entity.Waybilldetail;

public class WaybillDao extends BaseDao<Waybill>  implements IWaybillDao {

	
	
	@Override
	public List<Waybilldetail> waybills(Long sn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long addWaybill(Long userId, String toAddress, String addressee, String tele, String info) {
		// TODO Auto-generated method stub
		return null;
	}	

}
