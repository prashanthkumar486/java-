package constrReferInjec;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	System.out.println("project started......!!!!!!!");
	
	ApplicationContext context= new ClassPathXmlApplicationContext("constrReferInjec/ConstructorInjection/config5.xml");
	Emp p = (Emp) context.getBean("refemp1");
	System.out.println(p);
	
	
	System.out.println("=============");
	System.out.println("project  ended");

	}

}
