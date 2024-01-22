package constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("constructor/connn.xml");
		System.out.println(c.getBean("xyz"));

	}

}
