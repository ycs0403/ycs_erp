package cn.erp.common;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import com.alibaba.fastjson.JSON;


/**
 * @author 黑小子-余
 * 创建时间：2019年7月23日 下午7:19:45  
 * @version 1.0 
 * 描述：分层开发思想
 */
public class CommonAction<T> {
	/**
	 * 描述:自定义添加前缀 将原有的json转换成map，然后循环map，将map的key加上前缀后，再重新构建map，最后对新构建的map转换为json
	 * 
	 * @return
	 */
	public String mapJson(String jsonString, String perfix) {
		Map<String, Object> map = JSON.parseObject(jsonString);
		Map<String, Object> newmap = new HashMap<String, Object>();
		for (String key : map.keySet()) {
			Object object=map.get(key);
			if(object instanceof Map) {
				@SuppressWarnings("unchecked")
				Map<String, Object> map2=(Map<String, Object>) object;
				for(String key2:map2.keySet()) {
					newmap.put(perfix +"."+ key +"."+ key2,map2.get(key2));
				}
			}else {
				newmap.put(perfix + "." + key, object);
			}
		}
		return JSON.toJSONString(newmap);
	}

	/**
	 * 描述:代码优化，提取JSON为公共私有方法
	 * 
	 * @return
	 */
	public void write(String jsonString) { 
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8"); 
		try {
			response.getWriter().write(jsonString); 
		} catch (IOException e) { 
			// TODO Auto-generated catch block e.printStackTrace(); 
		}
	}

	/**
	 * 描述:返回Ajax结构体
	 * 
	 * @return
	 */
	public void ajaxReturn(boolean success, String message) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("success", success);
		map.put("message", message);
		String jsonString = JSON.toJSONString(map);
		write(jsonString);
	}


	/**
	 * 描述:数据显示行
	 *@return
	 */
	public String json(T t) {
		String jsonString = JSON.toJSONStringWithDateFormat(t,"yyyy-MM-dd");
		String json=mapJson(jsonString, "t");
		System.out.println("数据" + json);
		return json;
	}
}
