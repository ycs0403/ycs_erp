package cn.erp.dao.impl;

import org.hibernate.criterion.DetachedCriteria;

import cn.erp.dao.IStoreDao;
import cn.erp.daocommon.impl.BaseDao;
import cn.erp.entity.Store;


/**
* @ClassName: StoreDao
* @author: ycs
* @date: 2019��11��1�� ����10:16:37 
* @Description:�ֿ�
*/
public class StoreDao extends BaseDao<Store> implements IStoreDao{

	/**
	 * ����:�����Ż����������߲�ѯ����ȡΪ˽�й�������
	 *@return
	 */
	public DetachedCriteria getDetachedCriteria(Store store,Store store2,Object param) {
		DetachedCriteria dc=DetachedCriteria.forClass(Store.class);
		if(store!=null) {
			
		}
		return dc;
	}
}
