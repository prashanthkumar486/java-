package com.jsp.iocProject1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("com/jsp/iocProject1/config.xml");
	   Student s=(Student)c1.getBean("abc");
	   System.out.println(s);
	}
}
