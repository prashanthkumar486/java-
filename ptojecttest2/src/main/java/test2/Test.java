package test2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("test2/NewFile.xml");
		System.out.println(c.getBean("vtu"));
	}

}
