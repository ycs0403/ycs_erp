package cn.erp.dao.impl;

import org.hibernate.criterion.DetachedCriteria;

import cn.erp.dao.IReturnordersDao;
import cn.erp.daocommon.impl.BaseDao;
import cn.erp.entity.Returnorders;



/**
* @ClassName: ReturnordersDao
* @author: ycs
* @date: 2019��12��19�� ����10:50:38 
* @Description:�˻�����
*/
public class ReturnordersDao extends BaseDao<Returnorders> implements IReturnordersDao{
	/**
	 * ����:�����Ż����������߲�ѯ����ȡΪ˽�й�������
	 *@return
	 */
	public DetachedCriteria getDetachedCriteria(Returnorders returnorders,Returnorders returnorders2,Object param) {
		DetachedCriteria dc=DetachedCriteria.forClass(Returnorders.class);
		if(returnorders!=null) {

		}
		return dc;
	}
}
