package assespp;

import java.util.Scanner;

public class ArraySort {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter  the size of array");
		int size=scanner.nextInt();
		int []arr=new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		int temp=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
