package cn.erp.entity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.alibaba.fastjson.annotation.JSONField;

/**
 *Ա��(emp)
 *
 *@author changsheng-yu
 */
@Entity
@Table(name = "emp")
public class Emp implements java.io.Serializable {
	/** �汾�� */
	private static final long serialVersionUID = -7967709196231535445L;

	/** ��� */
	@Id
	@Column(name = "uuid", unique = true, nullable = false)
	private Long uuid;

	/** ��½�� */
	@Column(name = "username", nullable = true, length = 15)
	private String username;

	/** ��½���� */
	@Column(name = "pwd", nullable = true, length = 32)
	@JSONField(serialize = true)//�������ܲ���ȫ
	private String pwd;

	/** ��ʵ���� */
	@Column(name = "name", nullable = true, length = 28)
	private String name;

	/** �Ա� */
	@Column(name = "gender", nullable = true)
	private Long gender;

	/** �ʼ���ַ */
	@Column(name = "email", nullable = true, length = 255)
	private String email;

	/** ��ϵ�绰 */
	@Column(name = "tele", nullable = true, length = 30)
	private String tele;

	/** ��ϵ��ַ */
	@Column(name = "address", nullable = true, length = 255)
	private String address;

	/** ���������� */
	@Column(name = "birthday", nullable = true, length = 7)
	private Date birthday;

	/** ���ű�� */
	//@Column(name = "depuuid", nullable = true)
	//private Long depuuid;


	private Dep dep;//����
	public Dep getDep() {
		return dep;
	}
	public void setDep(Dep dep) {
		this.dep = dep;
	}

	/**
	 * ��ȡ���
	 * 
	 * @return ���
	 */
	public Long getUuid() {
		return this.uuid;
	}

	/**
	 * ���ñ��
	 * 
	 * @param uuid
	 *          ���
	 */
	public void setUuid(Long uuid) {
		this.uuid = uuid;
	}

	/**
	 * ��ȡ��½��
	 * 
	 * @return ��½��
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	 * ���õ�½��
	 * 
	 * @param username
	 *          ��½��
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * ��ȡ��½����
	 * 
	 * @return ��½����
	 */
	public String getPwd() {
		return this.pwd;
	}

	/**
	 * ���õ�½����
	 * 
	 * @param pwd
	 *          ��½����
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	/**
	 * ��ȡ��ʵ����
	 * 
	 * @return ��ʵ����
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * ������ʵ����
	 * 
	 * @param name
	 *          ��ʵ����
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * ��ȡ�Ա�
	 * 
	 * @return �Ա�
	 */
	public Long getGender() {
		return this.gender;
	}

	/**
	 * �����Ա�
	 * 
	 * @param gender
	 *          �Ա�
	 */
	public void setGender(Long gender) {
		this.gender = gender;
	}

	/**
	 * ��ȡ�ʼ���ַ
	 * 
	 * @return �ʼ���ַ
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * �����ʼ���ַ
	 * 
	 * @param email
	 *          �ʼ���ַ
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * ��ȡ��ϵ�绰
	 * 
	 * @return ��ϵ�绰
	 */
	public String getTele() {
		return this.tele;
	}

	/**
	 * ������ϵ�绰
	 * 
	 * @param tele
	 *          ��ϵ�绰
	 */
	public void setTele(String tele) {
		this.tele = tele;
	}

	/**
	 * ��ȡ��ϵ��ַ
	 * 
	 * @return ��ϵ��ַ
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 * ������ϵ��ַ
	 * 
	 * @param address
	 *          ��ϵ��ַ
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * ��ȡ����������
	 * 
	 * @return ����������
	 */
	public Date getBirthday() {
		return this.birthday;
	}

	/**
	 * ���ó���������
	 * 
	 * @param birthday
	 *          ����������
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


}