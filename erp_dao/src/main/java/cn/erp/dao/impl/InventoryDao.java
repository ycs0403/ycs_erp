package cn.erp.dao.impl;

import org.hibernate.criterion.DetachedCriteria;

import cn.erp.dao.IInventoryDao;
import cn.erp.daocommon.impl.BaseDao;
import cn.erp.entity.Inventory;



/**
* @ClassName: InventoryDao
* @author: ycs
* @date: 2019��12��17�� ����10:28:54 
* @Description:��ӯ�̿�
*/
public class InventoryDao extends BaseDao<Inventory> implements IInventoryDao{
	/**
	 * ����:�����Ż����������߲�ѯ����ȡΪ˽�й�������
	 *@return
	 */
	public DetachedCriteria getDetachedCriteria(Inventory inventory,Inventory inventory2,Object param) {
		DetachedCriteria dc=DetachedCriteria.forClass(Inventory.class);
		if(inventory!=null) {

		}
		return dc;
	}
}
