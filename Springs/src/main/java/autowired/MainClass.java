package autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("project started");
		ApplicationContext context = new ClassPathXmlApplicationContext("autowired/config1.xml");
    
		Certificate c=	context.getBean("cert", Certificate.class);
		System.out.println(c);	
		
		
		System.out.println("=========================");
		
		Student s = context.getBean("stud", Student.class);
		
		System.out.println(s);
		System.out.println("project ended");

	}

}
