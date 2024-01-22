package com;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		int fact=1;
		int i=1;
		System.out.println("Enter the Fact number");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		while(i<=n) {
			fact=fact*i;
			i=i+1;
		}
		System.out.println(fact);
	}
}