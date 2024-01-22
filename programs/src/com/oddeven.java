package com;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input n1:");
		int n1=sc.nextInt();
		if(n1%2==0)
		{
			System.out.println("the given number is even");
			
		}
		else {
		System.out.println("the given number is odd");
		}
	}

}
