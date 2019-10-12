package cn.erp.actioncommon;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import cn.erp.bizcommon.IBaseBiz;
import cn.erp.common_util.CommonAction;

/**
 * @author 黑小子-余
 * 创建时间：2019年7月23日 下午10:19:32  
 * @version 1.0 
 * @param <T>
 * 描述：公共Action
 */
public class BaseAction<T> {

	private IBaseBiz<T> iBaseBiz;//注入IBaseBiz接口

	public void setiBaseBiz(IBaseBiz<T> iBaseBiz) {
		this.iBaseBiz = iBaseBiz;
	}

	private CommonAction<T> commonAction=new CommonAction<T>();//调用公共通用

	private T t1;//参数对象1
	private T t2;//参数对象2
	private Object param;//扩展参数3

	public T getT1() {
		return t1;
	}
	public void setT1(T t1) {
		this.t1 = t1;
	}
	public T getT2() {
		return t2;
	}
	public void setT2(T t2) {
		this.t2 = t2;
	}
	public Object getParam() {
		return param;
	}
	public void setParam(Object param) {
		this.param = param;
	}
	public IBaseBiz<T> getiBaseBiz() {
		return iBaseBiz;
	}

	private int page;//页码
	private int rows;//每页大小
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}

	/**
	 * 描述:条件、查询所有信息
	 *@return
	 */
	public void getList() {
		List<T> list=iBaseBiz.getList(t1,t2,param);
		String jsonString =JSON.toJSONString(list,SerializerFeature.DisableCircularReferenceDetect);
		commonAction.write(jsonString);
	}

	/**
	 * 描述:分页、条件、查询所有数据信息
	 *@return
	 */
	public void getPageList() {
		int firstResult=(page-1)*rows;
		//获得分页列表
		List<T> list=iBaseBiz.getPageList(t1,t2, param, firstResult, rows);
		//得到记录数
		long count=iBaseBiz.getCount(t1,t2, param);
		//组成JSON格式
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("rows", list);
		map.put("count", count);
		String jsonString =JSON.toJSONString(map, SerializerFeature.DisableCircularReferenceDetect);//用来关闭循环引用，去掉$ref符号
		System.out.println("数据："+jsonString);
		commonAction.write(jsonString);
	}

	/**
	 * 描述:添加
	 *@return
	 */
	private T t;
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public void add() {
		try {
			iBaseBiz.add(t);
			commonAction.json(t);
			commonAction.ajaxReturn(true, "增加成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			commonAction.ajaxReturn(true, "发生异常");
		}
	}

	/**
	 * 描述:删除
	 *@return
	 */
	private Long id;//主键
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void delete() {
		try {
			iBaseBiz.delete(id);
			System.out.println("id:"+id);
			commonAction.ajaxReturn(true, "删除成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			commonAction.ajaxReturn(true, "发生异常");
		}
	}

	/**
	 * 描述:查询实体
	 *@return
	 */
	public void getPrimaryId() {
		try {
			T t= iBaseBiz.getPrimaryId(id);
			commonAction.write(commonAction.json(t));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 描述:修改
	 *@return
	 */
	public void update() {
		try {
			iBaseBiz.update(t);
			commonAction.json(t);
			commonAction.ajaxReturn(true, "修改成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			commonAction.ajaxReturn(false, "发生异常");
		}
	}
	
	
	/**
	  * 描述:返回当前存在session中用户，当前用户
	 *@return
	 */
	public T getUser() {
		return t;
	}
}
