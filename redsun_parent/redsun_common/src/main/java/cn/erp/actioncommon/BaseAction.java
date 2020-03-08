package cn.erp.actioncommon;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.opensymphony.xwork2.ActionContext;

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

	public  CommonAction<T> commonAction=new CommonAction<T>();//调用公共通用

	public static Map<String, Object> map=new HashMap<String, Object>();

	private T t1;//参数对象1
	private T t2;//参数对象2
	public static Object param;//扩展参数3

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
	@SuppressWarnings("static-access")
	public void setParam(Object param) {
		this.param = param;
	}
	public IBaseBiz<T> getiBaseBiz() {
		return iBaseBiz;
	}

	public static int page;//页码
	public static int rows;//每页大小
	public int getPage() {
		return page;
	}
	@SuppressWarnings("static-access")
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	@SuppressWarnings("static-access")
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
	private T t;//泛型对象
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public void add() {
		try {
			iBaseBiz.add(t);
			map.put("success", true);
			map.put("message", "新增成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.put("success", false);
			map.put("message", "新增失败");
		}
		commonAction.write(JSON.toJSONString(map));
	}

	/**
	 * 描述:删除
	 *@return
	 */
	private static Long id;//主键
	public Long getId() {
		return id;
	}
	@SuppressWarnings("static-access")
	public void setId(Long id) {
		this.id = id;
	}
	public void delete() {
		System.out.println("进入delete"+id);
		try {
			iBaseBiz.delete(id);
			map.put("success", true);
			map.put("message", "删除成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.put("success", false);
			map.put("message", "删除失败");
		}
		commonAction.write(JSON.toJSONString(map));
	}

	/**
	 * 描述:查询实体
	 *@return
	 */
	public void getPrimaryId() {
		try {
			T t= iBaseBiz.getPrimaryId(id);
			String jsonString =JSON.toJSONStringWithDateFormat(t, "yyyy-MM-dd");
			System.out.println("转换前："+jsonString);

			String jsonStringAfter=commonAction.mapJson(jsonString, "t");
			System.out.println("转换后："+jsonStringAfter);
			commonAction.write(jsonStringAfter);
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
		System.out.println("进入update"+t);
		try {
			iBaseBiz.update(t);
			map.put("success", true);
			map.put("message", "修改成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.put("success", false);
			map.put("message", "修改失败");
		}
		commonAction.write(JSON.toJSONString(map));
	}


	/**
	 * 描述:返回当前存在session中用户，当前用户
	 *@return
	 */
	@SuppressWarnings("unchecked")
	public T getUser() {
		return (T) ActionContext.getContext().getSession().get("user");
	}
	
	
	/**
	 * 接收订单明细的json格式的字符,数组形式的json字符串,里面的元素应该是每个订单明细
	 * */
	public static String json;
	
	public String getJson() {
		return json;
	}
	@SuppressWarnings("static-access")
	public void setJson(String json) {
		this.json = json;
	}
	
}
