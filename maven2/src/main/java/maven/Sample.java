package maven;

public class Sample {
	public Sample(double d1, double d2) {
		System.out.println("first constructor");
		
	}
	public Sample(int a, int b) {
		System.out.println("second constructor");
		System.out.println(a);
		System.out.println(b);
	}
	public Sample(String s1, String s2) {
		System.out.println("third constructor");
	}
}
