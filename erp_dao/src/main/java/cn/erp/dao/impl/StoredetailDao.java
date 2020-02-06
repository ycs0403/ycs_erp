package cn.erp.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import cn.erp.dao.IStoredetailDao;
import cn.erp.daocommon.impl.BaseDao;
import cn.erp.entity.StoreAlert;
import cn.erp.entity.Storedetail;



/**
* @ClassName: StoredetailDao
* @author: ycs
* @date: 2019��12��17�� ����10:21:02 
* @Description:�ֿ���
*/
public class StoredetailDao extends BaseDao<Storedetail> implements IStoredetailDao{
	/**
	 * ����:�����Ż����������߲�ѯ����ȡΪ˽�й�������
	 *@return
	 */
	public DetachedCriteria getDetachedCriteria(Storedetail storedetail,Storedetail storedetail2,Object param) {
		DetachedCriteria dc=DetachedCriteria.forClass(Storedetail.class);
		if(storedetail!=null) {

		}
		return dc;
	}

	/**
	 *���Ԥ���б�
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<StoreAlert> getStoreAlertList() {
		String hql="from StoreAlert s where s.storenum < s.outnum" ;
		return (List<StoreAlert>) getHibernateTemplate().find(hql);
	}

	

}
