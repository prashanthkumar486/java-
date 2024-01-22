package nested.pattern;

public class Dcba {

	public static void main(String[] args) {
		int n=4;
		for(int i=n-1;i>=0;i--) {
			for(int j=n-1;j>=0;j--) {
				System.out.print((char)(j+65)+" ");
				
			}
			System.out.println();
		}

	}

}
