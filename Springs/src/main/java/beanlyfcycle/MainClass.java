package beanlyfcycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("project started");
		ApplicationContext context = new ClassPathXmlApplicationContext("beanlyfcycle/config1.xml");
      Exam p	= context.getBean("exam1", Exam.class);
      ((AbstractApplicationContext) context).registerShutdownHook();
	 
		System.out.println(p);	
		
		System.out.println("project ended");

	}

}
