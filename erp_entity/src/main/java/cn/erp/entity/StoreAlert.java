package cn.erp.entity;

/**
* @ClassName: StoreAlert
* @author: ycs
* @date: 2020年1月27日 上午11:27:00 
* @Description:库存预警---数据库中的视图：VIEW_STOREALERT
*/
public class StoreAlert {

	private Long uuid;//商品编号
	private String name;//商品名称
	private Long storenum;//库存数量
	private Long outnum;//待出库的数量
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
