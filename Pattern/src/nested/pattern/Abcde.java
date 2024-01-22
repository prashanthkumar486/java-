package nested.pattern;

public class Abcde {
	public static void main(String[] args) {
		int row=5;
		int col=5;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row;j++) {
				if(i==j) {
					System.out.print((char)(i+96)+" ");
				}
				else {
					System.out.print(i+j+" ");	
			}
			}
		System.out.println();
		}
	}

}
