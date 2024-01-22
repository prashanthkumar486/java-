package constructorset;

import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext d=new ClassPathXmlApplicationContext("constructorset/configure.xml");
		Student2 s2=(Student2)d.getBean("student2");
		System.out.println(s2);
		Set<String> s=s2.getSubjects();
		System.out.println(s.getClass());

	}

}
