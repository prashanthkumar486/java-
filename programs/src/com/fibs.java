package com;

import java.util.Scanner;

class fibs{
	public static void method(int n){
		int a=0,b=1,c=0;
//		if(n==1 || n==1)
//		{
//			System.out.println(1);
//		}
		for(int i=2;i<=n+1;i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			//System.out.println(c);
		}
		//System.out.println(c);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		sc.close();
		method(n);
	}
}