package com;
import java.util.Scanner;

public class series1 {
 public static void check(int num) {
		int n1=0;
		int n2=1;
		int n3=0;
		System.out.print(n1+" "+n2);
		for(int i=1;i<=num-2;i++)
		{
			n3=2*n2+n1;//pek series 
			//n3=n2+n1;//fibonacci series 0 1 1 2 3 5 8 13 ......
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
public static void main(String[] args) {
	System.out.println("enter the number:");
Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
check(n);
}
}
