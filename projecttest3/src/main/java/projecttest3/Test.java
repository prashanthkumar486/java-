package projecttest3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("projecttest3/NewFile.xml");
		Main m=(Main)c.getBean("main");
		System.out.println(m);
		Calculate c1=m.getCalculate();
		c1.sum();
	}

}
