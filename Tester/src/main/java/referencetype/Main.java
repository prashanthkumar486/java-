package referencetype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	System.out.println("project started......!!!!!!!");
	
	ApplicationContext context= new ClassPathXmlApplicationContext("com/ReferenceType/Config3.xml");
      A a	= context.getBean("ref A", A.class);
	
	System.out.println("project  ended");

	}

}
