package com.mongo.test.SpringMongoDb.entity;

public class Department {
	private String departmentName;
	private String location;
	
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
//	public Department(String departmentName, String location) {
//		super();
//		this.departmentName = departmentName;
//		this.location = location;
//	}
	
	
	
}
