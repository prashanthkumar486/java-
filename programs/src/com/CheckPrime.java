package com;
import java.util.Scanner;


public class CheckPrime {
	public static void check(int num)
	{
		//int sum=0;
		int count=0;
		if(num==0 || num==1) {
			System.out.println("Not a prime number");
		}
		for(int i=2;i<num;i++) {
			if(num%i==0)
			{
				count++;
				System.out.println(" not prime number");
				break;
			}	
		}
		if(count==0)
		{
			System.out.println("prime no");
		}
	}

	public static void main(String[] args) {
		System.out.println("enter the number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		check(num);
	}

}
