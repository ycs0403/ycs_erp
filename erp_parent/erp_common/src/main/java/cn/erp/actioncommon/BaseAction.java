package cn.erp.actioncommon;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

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

	private CommonAction<T> commonAction=new CommonAction<T>();//���ù���ͨ��

	private T t1;//��������1
	private T t2;//��������2
	private Object param;//��չ����3

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

	private int page;//ҳ��
	private int rows;//ÿҳ��С
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
			commonAction.ajaxReturn(true, "���ӳɹ�");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			commonAction.ajaxReturn(true, "�����쳣");
		}
	}

	/**
	 * ����:ɾ��
	 *@return
	 */
	private Long id;//����
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
			commonAction.ajaxReturn(true, "ɾ���ɹ�");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			commonAction.ajaxReturn(true, "�����쳣");
		}
	}

	/**
	 * ����:��ѯʵ��
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
	 * ����:�޸�
	 *@return
	 */
	public void update() {
		try {
			iBaseBiz.update(t);
			commonAction.json(t);
			commonAction.ajaxReturn(true, "�޸ĳɹ�");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			commonAction.ajaxReturn(false, "�����쳣");
		}
	}
	
	
	/**
	  * ����:���ص�ǰ����session���û�����ǰ�û�
	 *@return
	 */
	public T getUser() {
		return t;
	}
}
