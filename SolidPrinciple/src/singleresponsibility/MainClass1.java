package singleresponsibility;

public class MainClass1 {
	public static void main(String[] args) {
		Hello h1=new Hello();
		h1.create();
		Hello1 h2=new Hello1();
		h2.read();
		Hello2 h=new Hello2();
		h.update();
	}   
}
