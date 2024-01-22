package com;

import java.util.*;

public class SortingAnArray {
	public static int[] sort1(int[] num) {
		/*for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}*/
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		return num;
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
		sort1(num);
		
	

	}

}
