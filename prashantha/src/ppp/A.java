package ppp;

import java.util.Objects;

public class A {
	String age;

	public A(String age) {
		super();
		this.age=age;
	}

	

	@Override
	public boolean equals(Object obj) {
		
		A a = (A) obj;
		return this.age.equals(a.age);
	}
	public static void main(String[] args) {
		A a1=new A("a");
		A a2=new A("b");
		System.out.println();
		System.out.println(a1.equals(a2));
	}
	

}
