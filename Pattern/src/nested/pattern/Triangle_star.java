package nested.pattern;

public class Triangle_star {

	public static void main(String[] args) {
for(int i=1;i<=5;i++) {
	int n=2*i-1;
	for(int j=1;j<=5;j++) {
		if(i+j<=5) {
			System.out.print(" ");
		}
		else {
		System.out.print(n+ " ");
		}
	}
	System.out.println();
}
	}

}
