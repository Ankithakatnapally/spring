package com.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	//member variables
int eId;
String eName;
List skillset;
Set phoneNumber;
Map emailId;
Properties app_pro;

public Map getEmailId() {
	return emailId;
}


public void setEmailId(Map emailId) {
	this.emailId = emailId;
}


public Employee() {
	super();
	// TODO Auto-generated constructor stub
}


public Employee(int eId, String eName, List skillset, Set phoneNumber,Map emailId,Properties app_pro) {
	super();
	this.eId = eId;
	this.eName = eName;
	this.skillset = skillset;
	this.phoneNumber = phoneNumber;
	this.emailId = emailId;
	this.app_pro=app_pro;
	
}

// getters and setters
public int geteId() {
	return eId;
}
public void seteId(int eId) {
	this.eId = eId;
}
public String geteName() {
	return eName;
}
public void seteName(String eName) {
	this.eName = eName;
}
public List getSkillset() {
	return skillset;
}
public void setSkillset(List skillset) {
	this.skillset = skillset;
}
public Set getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(Set phoneNumber) {
	this.phoneNumber = phoneNumber;
}


public Properties getApp_pro() {
	return app_pro;
}


public void setApp_pro(Properties app_pro) {
	this.app_pro = app_pro;
}


}
