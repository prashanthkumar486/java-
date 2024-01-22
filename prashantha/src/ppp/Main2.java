package ppp;

public class Main2 {
	public static void main(String[] args) {
		Thread t=new Thread();
		System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println(t.getPriority());
	}
}
