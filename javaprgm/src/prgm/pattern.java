package prgm;

public class pattern {
	public static void check(int row ) {
		//int k=1;
		for(int i=1;i<=row;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print("* ");
				//k++;
	
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		check(4);
	}

}
