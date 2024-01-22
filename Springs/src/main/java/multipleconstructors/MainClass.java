package multipleconstructors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("project started");
		ApplicationContext context = new ClassPathXmlApplicationContext("multipleconstructors/config1.xml");
		
	  Test p = (Test) context.getBean("test1");
		System.out.println(p);	
		
		System.out.println("project ended");

	}

}
