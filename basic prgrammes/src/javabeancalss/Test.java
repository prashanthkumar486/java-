package javabeancalss;

public class Test {

	public static void main(String[] args) {
		Father f = new Son(); //upcasting
		System.out.println(f.age);
		
		
		Son s= (Son)f;
		System.out.println(s.name +" "+s.age);

	}

}
