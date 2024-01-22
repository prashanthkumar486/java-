package nested.pattern;

public class Pattern123abc {
	public static void main(String[] args) {
	char c='A';
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=4;j++)
		{
			if(i%2!=0)
			{
				System.out.print(j+" ");
			}
			else {
				System.out.print(c++ +" ");
			}
		}
		System.out.println();
	}
	
	}

}
