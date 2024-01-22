package constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	System.out.println("project started......!!!!!!!");
	
	ApplicationContext context= new ClassPathXmlApplicationContext("com/ConstructorInjection/Config4.xml");
	Emp a = context.getBean("emp1", Emp.class);
     
	System.out.println("project  ended");

	}

}
