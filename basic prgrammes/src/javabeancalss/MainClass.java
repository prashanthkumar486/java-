package javabeancalss;

public class MainClass {

	public static void main(String[] args) {
		Tom t = new Tom();
		t.setName("Tom thread");
		t.start();
		
		Jerry j = new Jerry();
		j.setName("jerry thread");
		j.start();

	}

}
