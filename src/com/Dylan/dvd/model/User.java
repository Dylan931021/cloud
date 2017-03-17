package com.Dylan.dvd.model;

public class User extends Object{
	private int id;              //用户编号（使用序列）
	private String uname;		//用户名称（唯一）
	private String upass;		//用户密码
	private int type;           //用户类型（0、普通用户 1、管理员）
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
