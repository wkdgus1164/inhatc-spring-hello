package com.inhatc.domain;

public class DepartmentVO {
	private String department_id;
	private String department_name;
	private int count;
	private int yunhan;

	public String getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(String department_id) {
		this.department_id = department_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getYunhan() {
		return yunhan;
	}

	public void setYunhan(int yunhan) {
		this.yunhan = yunhan;
	}

	@Override
	public String toString() {
		return "DepartmentVO [department_id=" + department_id + ", department_name=" + department_name + ", count="
				+ count + ", yunhan=" + yunhan + "]";
	}

}
