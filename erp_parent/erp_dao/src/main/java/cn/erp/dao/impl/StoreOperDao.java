package cn.erp.dao.impl;

import org.hibernate.criterion.DetachedCriteria;

import cn.erp.dao.IStoreOperDao;
import cn.erp.daocommon.impl.BaseDao;
import cn.erp.entity.Storeoper;

/**
* @ClassName: StoreOperDao
* @author: ycs
* @date: 2019��11��9�� ����12:07:46 
* @Description:�ֿ������¼
*/
public class StoreOperDao extends BaseDao<Storeoper> implements IStoreOperDao{

	/**
	 * ����:�����Ż����������߲�ѯ����ȡΪ˽�й�������
	 *@return
	 */
	public DetachedCriteria getDetachedCriteria(Storeoper storeOper,Storeoper storeOper2,Object param) {
		DetachedCriteria dc=DetachedCriteria.forClass(Storeoper.class);
		if(storeOper!=null) {
			
		}
		return dc;
	}
}
