package cn.erp.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.erp.dao.IPurchaseDao;

/**
 * @ClassName: PurchaseDao
 * @author: ycs
 * @date: 2020年1月25日 下午8:40:03
 * @Description:采购报表实现
 */
public class PurchaseDao extends HibernateDaoSupport implements IPurchaseDao {

	/**
	 * (1) 注意关联部分和原生 SQL 不同之处:  from 后跟的是类名 （大写开头）  如果两个实体进行了一对多关联，关联的写法与 sql 不同
	 * 多的一方.一的一方属性 = 一的一方的别名  特别注意：当我们的语句比较长，每换行后需要加空格
	 * 
	 * (2)转换之前：[["儿童食品",3000],["调味品",10078],["水果",396],["饮料",52719]]
	 * 
	 * 这种数据很奇怪，像是一种复合类型的数组， 这种数据easyui的datagrid是无法加载的，
	 * 我们看回datagrid加载的数据格式都是json数据{key:value}。 因此我们要想方法把它转换成json数据格式
	 * 
	 * 转换之后：[{"0":"儿童食品","y":3000},{"0":"调味品","y":10078},{"0":"水果","y":396},{"0":"饮料","y":52719}]
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public List orderPurchase(Date startDate, Date endDate) {

		String hql = "select new Map(gt.name as name,sum(ol.money) as y) "
				+ "from GoodsType gt, Goods gs, Orderdetail ol, Orders o "
				+ "where gs.goodsType=gt "
				+ "and ol.orders = o "
				+ "and ol.goodsuuid=gs.uuid "
				+ "and o.type='1' ";
		List<Date> dateList = new ArrayList<Date>();
		if(null != startDate){
			hql += "and o.createtime>=? ";
			dateList.add(startDate);
		}
		if(null != endDate){
			hql += "and o.createtime<=? ";
			dateList.add(endDate);
		}
		hql += "group by gt.name";
		//指定转换的类型
		Date[] param = new Date[0];
		//转成新的数组
		Date[] params = dateList.toArray(param);
		return getHibernateTemplate().find(hql,params);
	}

}
