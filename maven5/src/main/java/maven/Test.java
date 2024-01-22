package maven;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("maven/NewFile.xml");
		System.out.println(c.getBean("college"));
	}

}
