package nested.pattern;

public class PatternAB {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=3;j++) {
				if(i==2 && j==2) {
					System.out.print('A'+" ");
				}
				else if(i==3 && j==2) {
					System.out.print('B'+" ");	
				}
			else {
				System.out.print("* ");
			}
		}
			System.out.println();
	}

	}

}
