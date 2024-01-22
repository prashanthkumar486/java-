package com;
import java.util.Scanner;

class fibonacci {

	public static void main(String[] args) {
		int a=1,b=1,c=0,i;
		System.out.println("Enter the no of elements to print: ");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		//System.out.print(a+" "+b);
		for(i=3;i<=n;i++)
		//while(i<=8)
		{
			c=a+b;
			//c=c%1000000007;
			//System.out.print(" "+c);
			a=b;
			b=c;
			//i=i+1; write this line when using while condition
		}
		System.out.println(""+c);
		
		//596             999
		//745035669       -237698910
		//45
		//134903163
	}

}
