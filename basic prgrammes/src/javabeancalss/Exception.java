package javabeancalss;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of a:");
		 int a = sc.nextInt();
		
		System.out.println("enter the value of b:");
		int b = sc.nextInt();
		try {
		System.out.println(a/b);
	}
		catch(ArithmeticException e) {
			System.out.println("dont divide by 0");
		}

}
}