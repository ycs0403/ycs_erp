package cn.erp.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import cn.erp.dao.IEmpDao;
import cn.erp.daocommon.impl.BaseDao;
import cn.erp.entity.Emp;

/**
 * @author 黑小子-余
 * 创建时间：2019年7月4日 下午10:31:07  
 * @version 1.0 
 * 描述：greater than ：大于 ：简写：gt
 *     less than      ： 小于 ：简写：lt
 *     great than or equal to ：大于等于 ： 简写：ge
 *     less than or equal to  : 小于等于 ： 简写：le
 */
public class EmpDao extends BaseDao<Emp> implements IEmpDao{

	public DetachedCriteria getDetachedCriteria(Emp emp1,Emp emp2,Object param){
		DetachedCriteria dc=DetachedCriteria.forClass(Emp.class);
		if(emp1!=null){
			if(emp1.getName()!=null&&emp1.getName().equals("")) {//姓名
				dc.add(Restrictions.like("name", emp1.getName()));
			}
			if(emp1.getGender()!=null) {//性别
				dc.add(Restrictions.eq("gender", emp1.getGender()));
			}
			//如果大于或等于第一个日期
			if(emp1.getBirthday()!=null) {
				dc.add(Restrictions.ge("birthday", emp1.getBirthday()));
			}
			//如果小于或等于第二个日期
			if(emp2.getBirthday()!=null) {
				dc.add(Restrictions.le("birthday", emp2.getBirthday()));
			}
			//部门搜索
			if(emp1.getDep()!=null && emp1.getDep().getUuid()!=null) {
				dc.add(Restrictions.eq("dep", emp1.getDep()));
			}
		}
		return dc;
	}

	/**
	 *描述:根据用户名和密码查询登录信息
	 */
	public Emp findByUserNameAndPwd(String userName, String pwd) {
		sql="from Emp where username=? and pwd=?";
		@SuppressWarnings("unchecked")
		List<Emp> list=(List<Emp>) getHibernateTemplate().find(sql, userName,pwd);
		if(list.size()>0) {
			return list.get(0);
		}else {
			return null;
		}
	}

	
	/**
	 *描述:管理员修改密码
	 */
	@Override
	public void updatePwd_reset(Long uuid, String newPwd) {
		sql="update Emp set pwd=? where uuid=?";
		this.getHibernateTemplate().bulkUpdate(sql, newPwd,uuid);
	}

}
