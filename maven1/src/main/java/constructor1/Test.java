package constructor1;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("constructor1/conn.xml");
	//System.out.println(c.getBean("student1"));
	Student1 s=(Student1)c.getBean("student1");
	System.out.println(s);
	List<String> l=s.getSubjects();
	System.out.println(l.getClass());
	
}
}
