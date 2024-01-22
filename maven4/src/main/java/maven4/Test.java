package maven4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("maven4/NewFile.xml");
		System.out.println(c.getBean("company"));

	}

}
