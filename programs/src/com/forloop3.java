package com;
import java.util.Scanner;

public class forloop3{
	public static void test(int num)
	{
		int x=5;
		//System.out.println(x);
		for(int i=0;i<=num;i++)
		{
			//print 5,10,14,17,19,20
			System.out.println(x);
			x=x+5-i;	
		}
		}
	
	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter The Nunmber");
				int n=sc.nextInt();
				test(n);
			}

		

	}


