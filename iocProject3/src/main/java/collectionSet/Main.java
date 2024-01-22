package collectionSet;

import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("collectionSet/cc.xml");
		
		Ipl2 i=(Ipl2)c.getBean("ipl2");
		System.out.println(i);
		
		Set<String> d=i.getPlayers();
		System.out.println(d.getClass());
		
		
		
	}

}
