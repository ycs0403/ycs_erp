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
 * @author ��С��-��
 * ����ʱ�䣺2019��7��23�� ����10:19:32  
 * @version 1.0 
 * @param <T>
 * ����������Action
 */
public class BaseAction<T> {
	private IBaseBiz<T> iBaseBiz;//ע��IBaseBiz�ӿ�

	public void setiBaseBiz(IBaseBiz<T> iBaseBiz) {
		this.iBaseBiz = iBaseBiz;
	}

	public  CommonAction<T> commonAction=new CommonAction<T>();//���ù���ͨ��

	public static Map<String, Object> map=new HashMap<String, Object>();

	private T t1;//��������1
	private T t2;//��������2
	public static Object param;//��չ����3

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

	public static int page;//ҳ��
	public static int rows;//ÿҳ��С
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
	 * ����:��������ѯ������Ϣ
	 *@return
	 */
	public void getList() {
		List<T> list=iBaseBiz.getList(t1,t2,param);
		String jsonString =JSON.toJSONString(list,SerializerFeature.DisableCircularReferenceDetect);
		commonAction.write(jsonString);
	}

	/**
	 * ����:��ҳ����������ѯ����������Ϣ
	 *@return
	 */
	public void getPageList() {
		int firstResult=(page-1)*rows;
		//��÷�ҳ�б�
		List<T> list=iBaseBiz.getPageList(t1,t2, param, firstResult, rows);
		//�õ���¼��
		long count=iBaseBiz.getCount(t1,t2, param);
		//���JSON��ʽ
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("rows", list);
		map.put("count", count);
		String jsonString =JSON.toJSONString(map, SerializerFeature.DisableCircularReferenceDetect);//�����ر�ѭ�����ã�ȥ��$ref����
		System.out.println("���ݣ�"+jsonString);
		commonAction.write(jsonString);
	}

	/**
	 * ����:���
	 *@return
	 */
	private T t;//���Ͷ���
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
			map.put("message", "�����ɹ�");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.put("success", false);
			map.put("message", "����ʧ��");
		}
		commonAction.write(JSON.toJSONString(map));
	}

	/**
	 * ����:ɾ��
	 *@return
	 */
	private static Long id;//����
	public Long getId() {
		return id;
	}
	@SuppressWarnings("static-access")
	public void setId(Long id) {
		this.id = id;
	}
	public void delete() {
		System.out.println("����delete"+id);
		try {
			iBaseBiz.delete(id);
			map.put("success", true);
			map.put("message", "ɾ���ɹ�");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.put("success", false);
			map.put("message", "ɾ��ʧ��");
		}
		commonAction.write(JSON.toJSONString(map));
	}

	/**
	 * ����:��ѯʵ��
	 *@return
	 */
	public void getPrimaryId() {
		try {
			T t= iBaseBiz.getPrimaryId(id);
			String jsonString =JSON.toJSONStringWithDateFormat(t, "yyyy-MM-dd");
			System.out.println("ת��ǰ��"+jsonString);

			String jsonStringAfter=commonAction.mapJson(jsonString, "t");
			System.out.println("ת����"+jsonStringAfter);
			commonAction.write(jsonStringAfter);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * ����:�޸�
	 *@return
	 */
	public void update() {
		System.out.println("����update"+t);
		try {
			iBaseBiz.update(t);
			map.put("success", true);
			map.put("message", "�޸ĳɹ�");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.put("success", false);
			map.put("message", "�޸�ʧ��");
		}
		commonAction.write(JSON.toJSONString(map));
	}


	/**
	 * ����:���ص�ǰ����session���û�����ǰ�û�
	 *@return
	 */
	@SuppressWarnings("unchecked")
	public T getUser() {
		return (T) ActionContext.getContext().getSession().get("user");
	}
	
	
	/**
	 * ���ն�����ϸ��json��ʽ���ַ�,������ʽ��json�ַ���,�����Ԫ��Ӧ����ÿ��������ϸ
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
