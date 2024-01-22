package collectionlist;


import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
	ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("collectionlist/list.xml");
			Ipl i=(Ipl)c.getBean("ipl");
			System.out.println(i);
	//System.out.println(c.getBean("ipl"));
		List<String> l=i.getPlayers();
		System.out.println(l.getClass());
	}

}
