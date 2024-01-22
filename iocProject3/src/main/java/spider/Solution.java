package spider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Solution {
public static void main(String[] args) {
	ClassPathXmlApplicationContext c2=new ClassPathXmlApplicationContext("spider/cc.xml");
	
//	Studentm s=(Studentm)c2.getBean("abc");
//	System.out.println(s);
	
	System.out.println(c2.getBean("abc"));
}
}
