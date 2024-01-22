package array2d;

import java.util.Arrays;
import java.util.Scanner;

public class AddMatrix {
	public static int[][] add(int[][] n1, int[][] n2){
		int[][] res=new int[3][3];
		for(int i=0;i<n1.length;i++) {
			for(int j=0;j<n1[i].length;j++) {
				res[i][j]=n1[i][j]+n2[i][j];
				//System.out.print(res[i][j]+" ");
			}
			//System.out.println();
		}
		System.out.println(Arrays.toString(res[0]));
	    System.out.println(Arrays.toString(res[1]));
		System.out.println(Arrays.toString(res[2]));
		return res;
	}
	public static void main(String[] args) {
		//int[][] n1= {{1,2,3},{4,5,6},{7,8,9}};
		//int[][] n2= {{1,2,3},{5,6,7},{4,5,6}};
		//add(n1,n2);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row size:");
		int size1=sc.nextInt();
		System.out.println("enter the column size:");
		int size2=sc.nextInt();
		System.out.println("enter arry matrix1:");
		int[][] n1=new int[size1][size2];
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size2;j++) {
			n1[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter arry matrix1:");
		int[][] n2=new int[size1][size2];
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size2;j++) {
			n2[i][j]=sc.nextInt();
			}
		}
	
		add(n1,n2);
	}

}
