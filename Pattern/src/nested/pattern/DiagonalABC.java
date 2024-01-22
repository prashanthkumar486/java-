package nested.pattern;

public class DiagonalABC {

	public static void main(String[] args) {
		char c='A';
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++) {
				if(i==j) {
					System.out.print(c++ +" ");
				
			}
			else {
				System.out.print("* ");
			}
		}
			System.out.println();
	}

	}

}
