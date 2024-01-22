package com;
import java.util.Scanner;

public class tribnocci {
	public static void check(int num)
	{
	int n1=0;
	int n2=1;
	int n3=1;
	int n4=0;
	System.out.print(n1+" "+n2+" "+n3);
	for(int i=1;i<=num-3;i++)
	{
		//n3=2*n2+n1;//pek series 
		n4=n1+n2+n3;//Tribnocci 0 1 1 2 4 7 13 24 44 81 149......
		System.out.print(" "+n4);
		n1=n2;
		n2=n3;
		n3=n4;
	}
}
public static void main(String[] args) {
System.out.println("enter the number:");
Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
check(n);
}
}

