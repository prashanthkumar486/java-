package singleton;

public class MainClass {
	public static void main(String[] args) {
		Student st=Student.getInstance();
		System.out.println(st);
	}

}
