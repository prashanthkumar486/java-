package inject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("inject/coon.xml");
		System.out.println(c.getBean("personn"));

	}

}
