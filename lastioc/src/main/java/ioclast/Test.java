package ioclast;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("ioclast/NewFile.xml");
		System.out.println(c.getBean("employee"));
		if(c!=null) {
			c.close();
		}
	}
}
