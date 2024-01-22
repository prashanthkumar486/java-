package maven;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("maven/NewFile.xml");
		Sample s=(Sample)c.getBean("sample1");
		System.out.println(s);
	}

}
