package com.Dylan.dvd.model;

public class Dvd extends Object {
	private int id; // DVD编号
	private String dname; // DVD名字
	private String dcout; // dvd借出次数
	private int status; // dvd状态（0、已借出，1、可借用）

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDcout() {
		return dcout;
	}

	public void setDcout(String dcout) {
		this.dcout = dcout;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Dvd(int id, String dname, String dcout, int status) {
		super();
		this.id = id;
		this.dname = dname;
		this.dcout = dcout;
		this.status = status;
	}

	public Dvd(String dname, String dcout, int status) {
		super();
		this.dname = dname;
		this.dcout = dcout;
		this.status = status;
	}

	@Override
	public boolean equals(Object obj) {
		boolean flag = true;
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Dvd Id = (Dvd) obj;
		if (Id.id != this.id) {
			flag = false;
		}
		return flag;
	}

	@Override
	public String toString() {
		return "Dvd [id=" + id + ", dname=" + dname + ", dcout=" + dcout + ", status=" + status + "]";
	}

}
