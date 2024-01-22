package nested.pattern;

public class Diagonals123 {
	static void check(int row,int col) {
		int n=1;
	for(int i=1;i<=row;i++)
	{
		for(int j=1;j<=col;j++) {
			if((i+j)!=8) {
				System.out.print("*" +" ");
				
		}
		else {
			System.out.print(n+" ");
			n++;
		}
	}
		System.out.println();
}
}

	public static void main(String[] args) {
		check(7,7);
	}
}

