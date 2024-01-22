package javabeancalss;

import java.util.Scanner;

public class Empolyee {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Company c= new Company();
		System.out.println("Enter Choice:");
		System.out.println("1:Coffee\n2:Tea");
		int choice = sc.nextInt();
		
		Beverages obj = c.vendingMachine(choice);
		if(obj instanceof Coffee) {
		System.out.println("Drinking Coffee");
		}
		else if(obj instanceof Tea) {
		System.out.println("Drinking Tea");
		}
		else {
		System.out.println("Invalid Choice");
		}
		}
	}



