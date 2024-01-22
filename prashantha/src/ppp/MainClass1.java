package ppp;

public class MainClass1 {
	public static void main(String[] args) {
		Tom t=new Tom();
		t.setName("tom thread");
		t.start();
		Jerry r=new Jerry();
		r.setName("jerry thread");
		r.start();
	}

}
