package model;

public class Teacher {
	private String tid;// �̹���
	private String name;
	private String password; // ����

	public String getId() {
		return tid;
	}

	public void setId(String id) {
		this.tid = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}