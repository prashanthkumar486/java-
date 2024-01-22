package com;

import java.util.Arrays;
import java.util.Scanner;

public class PairOfShoes {
	public static String count(int[] num) {
		int pair=0;
		Arrays.sort(num);
		for(int i=0;i<=num.length-1;i++) {
			if(i+1<=num.length-1 && num[i]==num[i+1]) {
				pair++;
				i++;
				
			}
		}
		return " the no of pairs "+pair;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Array size");
		int size= sc.nextInt();
		System.out.println("enter array elements");
		int[] num=new int[size];
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
		}
		sc.close();
		System.out.println(count(num));
		
	}

}
