package array.program;
import java.util.Scanner;


public class ArrayAscending {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array elements");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Entered array elements are");
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+" ");
		}
		
		
	}

}
