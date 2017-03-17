package com.Dylan.dvd.model;

public class User extends Object{
	private int id;              //�û���ţ�ʹ�����У�
	private String uname;		//�û����ƣ�Ψһ��
	private String upass;		//�û�����
	private int type;           //�û����ͣ�0����ͨ�û� 1������Ա��
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public User(int id, String uname, String upass, int type) {
		super();
		this.id = id;
		this.uname = uname;
		this.upass = upass;
		this.type = type;
	}
	public User(String uname, String upass, int type) {
		super();
		this.uname = uname;
		this.upass = upass;
		this.type = type;
	}
	public boolean equals(Object obj) {
		boolean flag = true;
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		User Id = (User) obj;
		if (Id.getId()!= this.id) {
			flag = false;
		}
		return flag;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", uname=" + uname + ", upass=" + upass + ", type=" + type + "]";
	}
	
}
