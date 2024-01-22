package refinject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestdDependent {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext c= new ClassPathXmlApplicationContext("refinject/connn.xml");
		Person p=(Person)c.getBean("person");
		System.out.println(p);
		//System.out.println(c.getBean("person"));

	}

}
