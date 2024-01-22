package assespp;

import java.util.Scanner;

public class Maximum {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter  the size of array");
		int size=scanner.nextInt();
		int []arr=new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		int max=arr[0];
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				temp=max;
				max=arr[i];
				arr[i]=temp;
			}
		}
		System.out.println(max);

	}
}