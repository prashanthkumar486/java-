package prgm;

public class Pattern1 {
	public static void check(int row ) {
		int k=row/2;
		for(int i=1;i<=k;i++) {
			if(i<=row/2) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");

			}
			System.out.println();
			}
			
			

			for(int j=4;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
			}
			
		
	}

	public static void main(String[] args) {
		check(8);
	}

}
