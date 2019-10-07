package cn.erp.common;

/**
 * @author 黑小子-余
  * 创建时间：2019年7月31日 下午11:50:18  
 * @version 1.0 
  * 描述：自定义异常类
 */
public class ErpException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6931127640687577190L;

	public ErpException(String message) {
		super(message);
	}
}
