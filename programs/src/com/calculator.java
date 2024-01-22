package com;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		System.out.println("WELCOME TO MY CALCULATOR");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input 1:");
		int n1=sc.nextInt();
		System.out.println("enter the input 2:");
		int n2=sc.nextInt();
		System.out.println("=========Menu===========");
		System.out.println("\n 1.add \n 2.sub \n 3.mul \n 4.div \n 5.mod");
		System.out.println("eneter your option");
		int option=sc.nextInt();
		if(option==1)
		{
			System.out.println("add:"+(n1+n2));
		}
		else if(option==2)
		{
			System.out.println("sub:"+(n1-n2));
		}
		else if(option==3)
		{
			System.out.println("mul:"+(n1*n2));
		}
		else if(option==4)
		{
			System.out.println("div:"+(n1/n2));
		}
		else if(option==5)
		{
			System.out.println("mod:"+(n1%n2));
		}
		else
		{
			System.out.println("eneter valid option");
		}
		System.out.println("Thank you for using my Calculator");
		sc.close();
	}
}
