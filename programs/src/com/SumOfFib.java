package com;
import java.util.Scanner;

class SumOfFib {

	public static void main(String[] args) {
		int a=0,b=1,c=0;
		System.out.println("Enter the no of elements to print: ");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		//System.out.print(a+" "+b);
		for(int i=2;i<n+2;i++){
			System.out.println(a);
			c=a+b;
			//System.out.print(" "+c);
			a=b;
			b=c;
		}
		//while(i<=n);

		//i=i+1; write this line when using while condition
	}


}