package assespp;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter  the size of array");
		int size=scanner.nextInt();
		int []arr=new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		scanner.close();
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
		}
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}
		
	}
}
