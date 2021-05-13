package com.beans;

public class Department {
int bdeptId;
String deptName;
public Department() {
	super();
	// TODO Auto-generated constructor stub
}
public Department(int bdeptId, String deptName) {
	super();
	this.bdeptId = bdeptId;
	this.deptName = deptName;
}
public int getBdeptId() {
	return bdeptId;
}
public void setBdeptId(int bdeptId) {
	this.bdeptId = bdeptId;
}
public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}

}
