package com;
import java.util.Scanner;

public class CountNumber {
	static int check(int num) {
		int count=0;

		while(num>0)
		{
			count++;
			num=num/10;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("enter the number: ");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(check(n) );
	}

}
