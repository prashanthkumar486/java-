package assespp;

import java.util.Scanner;

public class SumOfCorner {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of row");
		int row=scanner.nextInt();
		System.out.println("Enter the size of col");
		int col=scanner.nextInt();
		int [][]arr=new int[row][col];
		System.out.println("enter the "+(row*col)+" elements");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=scanner.nextInt();
			}
		}

System.out.println("the array is");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("the left top corner "+arr[0][0]);
		System.out.println("the right top corner "+arr[0][col-1]);
		System.out.println("the left bottom corner "+arr[row-1][0]);
		System.out.println("the right top corner "+arr[row-1][col-1]);

		
		int sum=arr[0][0]+arr[0][col-1]+arr[row-1][0]+arr[row-1][col-1];
		System.out.println("the sum of corner array is "+sum);
	}
}
