package com.inhatc.domain;

public class StudentVO {
	private String studentno;
	private String studentname;
	private String address;
	private String phone;
	private String email;

	public String getStudentno() {
		return studentno;
	}

	public void setStudentno(String studentno) {
		this.studentno = studentno;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public StudentVO() {
		super();
	}

	@Override
	public String toString() {
		return "StudentVO [studentno=" + studentno + ", studentname=" + studentname + ", address=" + address
				+ ", phone=" + phone + ", email=" + email + "]";
	}

}
