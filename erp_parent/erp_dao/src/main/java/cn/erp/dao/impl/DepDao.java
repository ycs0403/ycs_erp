package cn.erp.dao.impl;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import cn.erp.dao.IDepDao;
import cn.erp.daocommon.impl.BaseDao;
import cn.erp.entity.Dep;

/**
 * @author ��С��-��
 * ����ʱ�䣺2019��5��29�� ����11:29:56  
 * @version 1.0 
 * �������������ݷ�����
 */
public class DepDao extends BaseDao<Dep> implements IDepDao{

	/**
	 * ����:�����Ż����������߲�ѯ����ȡΪ˽�й�������
	 *@return
	 */
	public DetachedCriteria getDetachedCriteria(Dep dep,Dep dep2,Object param) {
		DetachedCriteria dc=DetachedCriteria.forClass(Dep.class);
		if(dep!=null) {
			if(dep.getName()!=null&&dep.getName().equals("")) {
				dc.add(Restrictions.like("name", dep.getName(),MatchMode.ANYWHERE));//MatchMode.ANYWHERE�൱��ģ����ѯ
			}
			if(dep.getTele()!=null&&dep.getTele().equals("")) {
				dc.add(Restrictions.like("tele", dep.getTele(),MatchMode.ANYWHERE));
			}
		}
		return dc;
	}
}
