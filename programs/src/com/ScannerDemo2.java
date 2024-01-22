package com;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the intger value");
				int i=sc.nextInt();
				sc.nextLine();
				System.out.println("Entered sentence ");
				String b=sc.nextLine();
			
				System.out.println("integer input is:\n"+i);
				System.out.println("string  input is:"+b);
sc.close();
	}

}
