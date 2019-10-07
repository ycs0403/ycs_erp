package cn.erp.common;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import com.alibaba.fastjson.JSON;


/**
 * @author ��С��-��
 * ����ʱ�䣺2019��7��23�� ����7:19:45  
 * @version 1.0 
 * �������ֲ㿪��˼��
 */
public class CommonAction<T> {
	/**
	 * ����:�Զ������ǰ׺ ��ԭ�е�jsonת����map��Ȼ��ѭ��map����map��key����ǰ׺�������¹���map�������¹�����mapת��Ϊjson
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
	 * ����:�����Ż�����ȡJSONΪ����˽�з���
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
	 * ����:����Ajax�ṹ��
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
	 * ����:������ʾ��
	 *@return
	 */
	public String json(T t) {
		String jsonString = JSON.toJSONStringWithDateFormat(t,"yyyy-MM-dd");
		String json=mapJson(jsonString, "t");
		System.out.println("����" + json);
		return json;
	}
}
