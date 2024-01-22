package com;
import java.util.Scanner;

public class series3 {
public static void main(String[] args) {
System.out.println("enter the number:");
Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
int n1=3;
System.out.println(n1);
/*
for(int i=1;i<=n;i++)
{
	int n2=n1*2;
	System.out.println(n2);
	n1=n2;
}*/
int n2;
for(int i=1;i<=n;i++)
{
	System.out.println(n+" ");
	n1=n1*i;
	n1=i+1;
	n2=n1;
}
}
}

