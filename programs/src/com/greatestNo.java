package com;
import java.util.Scanner;
public class greatestNo {

	public static void main(String[] args) {
		int arr[] = new int[5];
		int max;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no if elements");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		max=arr[0];
		for(int i=1;i<5;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum element is: "+max);
	}

}
