package com.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("project started");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/standalone/config1.xml");
		
	    Emp a	= (Emp) context.getBean("emp1");	
		System.out.println(a);	
		
		System.out.println("=========");
		System.out.println(a.getVehicle());
		System.out.println(a.getVehicle().getClass().getName());
		System.out.println("=========");
		System.out.println(a.getEmail());
		System.out.println(a.getEmail().getClass().getName());
		System.out.println("=========");
		System.out.println(a.getName());
		System.out.println(a.getName().getClass().getName());
		
		
		
		System.out.println("project ended");

	}

}
