package com;
import java.util.Scanner;

public class forloop1 {
	public static void test(int num)
	{
		int x=2;
		for(int i=1;i<=num;i++)
		{
			System.out.println(x);
			x=x+2;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Nunmber");
		int n=sc.nextInt();
		test(n);
	}

}
