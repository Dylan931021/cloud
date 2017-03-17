package com.Dylan.dvd.model;

public class Record extends Object {
	private int id; // ��¼��ţ����У�
	private int uid; // ��dvd�˵ı��
	private int did; // ����DVD�ı��
	private String lendTime; // ���ʱ��
	private String returnTime; // �黹ʱ��

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getLendTime() {
		return lendTime;
	}

	public void setLendTime(String lendTime) {
		this.lendTime = lendTime;
	}

	public String getReturnTime() {
		return returnTime;
	}

	public void setReturnTime(String returnTime) {
		this.returnTime = returnTime;
	}

	public Record(int id, int uid, int did, String lendTime, String returnTime) {
		super();
		this.id = id;
		this.uid = uid;
		this.did = did;
		this.lendTime = lendTime;
		this.returnTime = returnTime;
	}

	public Record(int uid, int did, String lendTime, String returnTime) {
		super();
		this.uid = uid;
		this.did = did;
		this.lendTime = lendTime;
		this.returnTime = returnTime;
	}

	public boolean equals(Object obj) {
		boolean flag = true;
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Record Id = (Record) obj;
		if (Id.getId() != this.id) {
			flag = false;
		}
		return flag;
	}

	@Override
	public String toString() {
		return "Record [id=" + id + ", uid=" + uid + ", did=" + did + ", lendTime=" + lendTime + ", returnTime="
				+ returnTime + "]";
	}

}
