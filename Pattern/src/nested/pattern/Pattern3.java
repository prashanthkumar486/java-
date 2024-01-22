package nested.pattern;

public class Pattern3 {
	public static void main(String[] args) {
		int m=15;
		int n=0;
		
		for(int i=0;i<=m;i++) {

			if(i==n ) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
			
			if(i==n) {
			n=n+6;
			}
			
		}
	}

}
