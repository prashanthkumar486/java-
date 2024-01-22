package array.program;

public class StringCountInArray {
	public static void main(String[] args) {
		String str="hello dffxf";
		char[] c =str.toCharArray();
		int count=0;
		for(int i=0;i<=c.length-1;i++)
		{
			count++;
			System.out.print(c[i]+" ");
			

		}
		System.out.println();
	System.out.println(count);
	}

}
