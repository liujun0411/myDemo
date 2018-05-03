package com.lj.di13;

public class Teacher {

	private String name;
	private int workAge;
	private String college;
	private String department;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setWorkAge(int workAge) {
		this.workAge = workAge;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", workAge=" + workAge + ", college=" + college + ", department=" + department
				+ "]";
	}
	
	
	
}
