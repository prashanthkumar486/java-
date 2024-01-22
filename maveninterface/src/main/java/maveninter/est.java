package maveninter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class est {
	public static void main(String[] args) {
	ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("maveninter/NewFile.xml");
	Customer c2=(Customer)c.getBean("customer");
	System.out.println(c2);
	Account a1=c2.getAccount();
	a1.withdraw();
	a1.deposit();
	
	}
}
