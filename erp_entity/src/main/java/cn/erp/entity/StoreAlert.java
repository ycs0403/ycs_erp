package cn.erp.entity;

/**
* @ClassName: StoreAlert
* @author: ycs
* @date: 2020��1��27�� ����11:27:00 
* @Description:���Ԥ��---���ݿ��е���ͼ��VIEW_STOREALERT
*/
public class StoreAlert {

	private Long uuid;//��Ʒ���
	private String name;//��Ʒ����
	private Long storenum;//�������
	private Long outnum;//�����������
	public Long getUuid() {
		return uuid;
	}
	public void setUuid(Long uuid) {
		this.uuid = uuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getStorenum() {
		return storenum;
	}
	public void setStorenum(Long storenum) {
		this.storenum = storenum;
	}
	public Long getOutnum() {
		return outnum;
	}
	public void setOutnum(Long outnum) {
		this.outnum = outnum;
	}


	
	
}
