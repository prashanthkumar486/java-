package secondpakage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
	
	
	
		ApplicationContext c2=new ClassPathXmlApplicationContext("secondpakage/conn.xml");
		//Employee e=(Employee)c2.getBean("abc");
		//System.out.println(e);
	System.out.println(c2.getBean("abc"));
	System.out.println(c2.getBean("mno"));
	}
}
