package collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("project started");
		ApplicationContext context = new ClassPathXmlApplicationContext("collection/config1.xml");
		
	    Emp a	= (Emp) context.getBean("emp1");	
		System.out.println(a);	
		
		System.out.println("project ended");

	}

}
