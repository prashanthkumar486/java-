package maptype;

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("maptype/conm.xml");
		Country count=(Country)c1.getBean("country");
		System.out.println(count);
		Map<String,String> m=count.getStateandlanguge();
		System.out.println(m.getClass());

	}

}
