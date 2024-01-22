package ioclast1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("ioclast1/Config.xml");
		Student s1=(Student)c.getBean("student");
		System.out.println(s1);
		
		Student s2=(Student)c.getBean("student");
		System.out.println(s2);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}

}
