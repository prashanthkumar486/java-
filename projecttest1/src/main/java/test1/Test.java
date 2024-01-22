package test1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("test1/NewFile.xml");
		System.out.println(c.getBean("vehicle"));
	}

}
