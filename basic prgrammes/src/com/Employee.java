package com;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id of emp");
	int id=sc.nextInt();
	System.out.println("enter the name of emp");
      String name=sc.next();
	System.out.println("enter the sal of emp");
	double sal=sc.nextDouble();
	
	System.out.println(id);
	System.out.println(name);
	System.out.println(sal);
	
	}

}
