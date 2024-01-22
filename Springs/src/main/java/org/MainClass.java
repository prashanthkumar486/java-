package org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("project started");
		ApplicationContext context = new ClassPathXmlApplicationContext("org/config1.xml");
		
		Student a = (Student) context.getBean("stud1");
		System.out.println(a.hashCode());
		
		System.out.println("===============");
		Student b = (Student) context.getBean("stud1");
		System.out.println(b.hashCode());
		
		
		System.out.println("project ended");

	}

}
