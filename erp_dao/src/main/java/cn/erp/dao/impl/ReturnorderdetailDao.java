package cn.erp.dao.impl;

import org.hibernate.criterion.DetachedCriteria;

import cn.erp.dao.IReturnorderdetailDao;
import cn.erp.daocommon.impl.BaseDao;
import cn.erp.entity.Returnorderdetail;



/**
* @ClassName: ReturnorderdetailDao
* @author: ycs
* @date: 2019��12��19�� ����10:53:55 
* @Description:�˻�������ϸ
*/
public class ReturnorderdetailDao extends BaseDao<Returnorderdetail> implements IReturnorderdetailDao{
	/**
	 * ����:�����Ż����������߲�ѯ����ȡΪ˽�й�������
	 *@return
	 */
	public DetachedCriteria getDetachedCriteria(Returnorderdetail returnorderdetail,Returnorderdetail returnorderdetail2,Object param) {
		DetachedCriteria dc=DetachedCriteria.forClass(Returnorderdetail.class);
		if(returnorderdetail!=null) {

		}
		return dc;
	}
}
