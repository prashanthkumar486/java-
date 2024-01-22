package steroTypeAnnoattion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("project started");
		ApplicationContext context = new ClassPathXmlApplicationContext("steroTypeAnnoattion/config1.xml");
		
		Ipl i = context.getBean("ipl", Ipl.class);
		System.out.println(i);	
		
		System.out.println("project ended");

	}

}
