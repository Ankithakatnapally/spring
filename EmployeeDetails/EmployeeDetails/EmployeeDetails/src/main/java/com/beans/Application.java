package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		
ApplicationContext context = new ClassPathXmlApplicationContext();
Employee e=(Employee) context.getBean("emp");
System.out.println(e.geteId());
System.err.println(e.geteName());
System.out.println(e.getSkillset());
System.out.println(e.getPhoneNumber());
System.out.println(e.getEmailId());
System.out.println(e.getApp_pro());

	}

}
