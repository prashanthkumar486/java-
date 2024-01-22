package com;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {


	public static int[] sort(int[] n) {
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n.length-1;j++) {
				if(n[j]>n[j+1]) {
					int temp=n[j];
					n[j]=n[j+1];
					n[j+1]=temp;
				}
			}
		}
		//Arrays.sort(n);
		System.out.println(Arrays.toString(n));
		return n;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entet the size");
		int size=sc.nextInt();
		int[] num=new int[size];
		System.out.println("enter array elements");
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
	
		}
		sc.close();
		sort(num);

	}

}

	


