package practice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Save {
	public static void main(String[] args) {
		
	
ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("practice/NewFile.xml");
System.out.println(c.getBean("student"));
}
}
