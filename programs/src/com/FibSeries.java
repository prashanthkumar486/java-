package com;

import java.util.Scanner;

public class FibSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
				int a=1,b=1,c=0;
				//System.out.print(a+" "+b);
			
				for(int i=1;i<=n;i++)
				{
					System.out.println(a);
					c=a+b;
					//System.out.print(" "+c);
					a=b;
					b=c;
				}
			}
				
		}
	


