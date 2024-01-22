package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	System.out.println("project started......!!!!!!!");
	
	ApplicationContext context= new ClassPathXmlApplicationContext("com/config1.xml");
	Student a = (Student) context.getBean("student1");
	System.out.println("=============");
	System.out.println("project  ended");

	}

}
