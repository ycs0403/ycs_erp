package cn.erp.dao.impl;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import cn.erp.dao.IDepDao;
import cn.erp.daocommon.impl.BaseDao;
import cn.erp.entity.Dep;

/**
 * @author 黑小子-余
 * 创建时间：2019年5月29日 下午11:29:56  
 * @version 1.0 
 * 描述：部门数据访问类
 */
public class DepDao extends BaseDao<Dep> implements IDepDao{

	/**
	 * 描述:代码优化，升级离线查询，提取为私有公共方法
	 *@return
	 */
	public DetachedCriteria getDetachedCriteria(Dep dep,Dep dep2,Object param) {
		DetachedCriteria dc=DetachedCriteria.forClass(Dep.class);
		if(dep!=null) {
			if(dep.getName()!=null&&dep.getName().equals("")) {
				dc.add(Restrictions.like("name", dep.getName(),MatchMode.ANYWHERE));//MatchMode.ANYWHERE相当于模糊查询
			}
			if(dep.getTele()!=null&&dep.getTele().equals("")) {
				dc.add(Restrictions.like("tele", dep.getTele(),MatchMode.ANYWHERE));
			}
		}
		return dc;
	}
}
