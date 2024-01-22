package com;
import java.util.Scanner;

class LastFibanocci {

	public static void main(String[] args) {
		int a=0,b=1,c=0,i;
		System.out.println("Enter the no of elements to print: ");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		//System.out.print(a+" "+b);
		for(i=2;i<n;i++)
		//while(i<=8)
		{
			c=a+b;
			//System.out.print(" "+c);
			a=b;
			b=c;
			sc.close();
			//i=i+1; write this line when using while condition
		}
		System.out.println(""+c);
		

	}

}
