package constructormap;

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("constructormap/NewFile.xml");
		Company cc=(Company)c.getBean("company");
		System.out.println(cc);
		Map<Integer,String> m=cc.getEmployeecodeandname();
		System.out.println(m.getClass());
	}

}
