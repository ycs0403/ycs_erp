package cn.erp.dao.impl;

import org.hibernate.criterion.DetachedCriteria;
import cn.erp.dao.IOrderdetailDao;
import cn.erp.daocommon.impl.BaseDao;
import cn.erp.entity.Orderdetail;


/**
 * @author ��С��-��
  * ����ʱ�䣺2019��8��5�� ����9:18:30  
 * @version 1.0 
  * ������
 */
public class OrderdetailDao extends BaseDao<Orderdetail> implements IOrderdetailDao{

	/**
	 * ����:�����Ż����������߲�ѯ����ȡΪ˽�й�������
	 *@return
	 */
	public DetachedCriteria getDetachedCriteria(Orderdetail orderdetail,Orderdetail orderdetail2,Object param) {
		DetachedCriteria dc=DetachedCriteria.forClass(Orderdetail.class);
		if(orderdetail!=null) {
			
		}
		return dc;
	}
}
