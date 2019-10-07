package cn.erp.entity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.alibaba.fastjson.annotation.JSONField;

/**
 *员工(emp)
 *
 *@author changsheng-yu
 */
@Entity
@Table(name = "emp")
public class Emp implements java.io.Serializable {
	/** 版本号 */
	private static final long serialVersionUID = -7967709196231535445L;

	/** 编号 */
	@Id
	@Column(name = "uuid", unique = true, nullable = false)
	private Long uuid;

	/** 登陆名 */
	@Column(name = "username", nullable = true, length = 15)
	private String username;

	/** 登陆密码 */
	@Column(name = "pwd", nullable = true, length = 32)
	@JSONField(serialize = true)//输出密码很不安全
	private String pwd;

	/** 真实姓名 */
	@Column(name = "name", nullable = true, length = 28)
	private String name;

	/** 性别 */
	@Column(name = "gender", nullable = true)
	private Long gender;

	/** 邮件地址 */
	@Column(name = "email", nullable = true, length = 255)
	private String email;

	/** 联系电话 */
	@Column(name = "tele", nullable = true, length = 30)
	private String tele;

	/** 联系地址 */
	@Column(name = "address", nullable = true, length = 255)
	private String address;

	/** 出生年月日 */
	@Column(name = "birthday", nullable = true, length = 7)
	private Date birthday;

	/** 部门编号 */
	//@Column(name = "depuuid", nullable = true)
	//private Long depuuid;


	private Dep dep;//部门
	public Dep getDep() {
		return dep;
	}
	public void setDep(Dep dep) {
		this.dep = dep;
	}

	/**
	 * 获取编号
	 * 
	 * @return 编号
	 */
	public Long getUuid() {
		return this.uuid;
	}

	/**
	 * 设置编号
	 * 
	 * @param uuid
	 *          编号
	 */
	public void setUuid(Long uuid) {
		this.uuid = uuid;
	}

	/**
	 * 获取登陆名
	 * 
	 * @return 登陆名
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	 * 设置登陆名
	 * 
	 * @param username
	 *          登陆名
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * 获取登陆密码
	 * 
	 * @return 登陆密码
	 */
	public String getPwd() {
		return this.pwd;
	}

	/**
	 * 设置登陆密码
	 * 
	 * @param pwd
	 *          登陆密码
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	/**
	 * 获取真实姓名
	 * 
	 * @return 真实姓名
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 设置真实姓名
	 * 
	 * @param name
	 *          真实姓名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取性别
	 * 
	 * @return 性别
	 */
	public Long getGender() {
		return this.gender;
	}

	/**
	 * 设置性别
	 * 
	 * @param gender
	 *          性别
	 */
	public void setGender(Long gender) {
		this.gender = gender;
	}

	/**
	 * 获取邮件地址
	 * 
	 * @return 邮件地址
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * 设置邮件地址
	 * 
	 * @param email
	 *          邮件地址
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 获取联系电话
	 * 
	 * @return 联系电话
	 */
	public String getTele() {
		return this.tele;
	}

	/**
	 * 设置联系电话
	 * 
	 * @param tele
	 *          联系电话
	 */
	public void setTele(String tele) {
		this.tele = tele;
	}

	/**
	 * 获取联系地址
	 * 
	 * @return 联系地址
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 * 设置联系地址
	 * 
	 * @param address
	 *          联系地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 获取出生年月日
	 * 
	 * @return 出生年月日
	 */
	public Date getBirthday() {
		return this.birthday;
	}

	/**
	 * 设置出生年月日
	 * 
	 * @param birthday
	 *          出生年月日
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


}