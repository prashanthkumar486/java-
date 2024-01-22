package com;
import java.util.Scanner;

public  class CountOddEven {
	static void check(int num) {
		int count=0;
		int evencount=0;
		int oddcount=0;
		while(num>0)
		{
			count++;
			int rem=num%10;
			if(rem%2==0) {

				evencount++;
			}
			else {
				oddcount++;
			}
			num=num/10;
		}
		System.out.println("Total numbers are : "+count);
		System.out.println("even numbers are  : "+evencount);
		System.out.println("odd numbers are   : "+oddcount);

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		sc.close();
		check(n) ;
	}

}

