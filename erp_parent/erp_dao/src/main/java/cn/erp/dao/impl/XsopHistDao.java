package cn.erp.dao.impl;

import org.hibernate.criterion.DetachedCriteria;

import cn.erp.dao.IXsopHistDao;
import cn.erp.daocommon.impl.BaseDao;
import cn.erp.entity.XsopHist;



/**
* @ClassName: XsopHistDao
* @author: ycs
* @date: 2019��12��17�� ����10:31:43 
* @Description:�����깤��¼��
*/
public class XsopHistDao extends BaseDao<XsopHist> implements IXsopHistDao{
	/**
	 * ����:�����Ż����������߲�ѯ����ȡΪ˽�й�������
	 *@return
	 */
	public DetachedCriteria getDetachedCriteria(XsopHist xsopHist,XsopHist xsopHist2,Object param) {
		DetachedCriteria dc=DetachedCriteria.forClass(XsopHist.class);
		if(xsopHist!=null) {

		}
		return dc;
	}
}
