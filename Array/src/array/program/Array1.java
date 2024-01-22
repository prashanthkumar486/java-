package array.program;

public class Array1 {
	transient int id=10;

	public static void main(String[] args) {
		
		Array1 a=new Array1();
		System.out.println(a.id);
		a.id=20;
		System.out.println(a.id);
	}

}
