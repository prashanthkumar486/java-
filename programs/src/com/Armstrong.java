package com;

import java.util.Scanner;

public class Armstrong {
	public static String check1(int n) {
		int a=n;
		int rem=0;
		int res=0;
		while(n>0){
			rem=n%10;
			res=res+rem*rem*rem;
			n=n/10;
		}
		if(a==res) {
			return "Armstrong no";
		}
		else {
			return "not Armstrong no";
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int n=sc.nextInt();
		System.out.println(check1(n));
	}

}
