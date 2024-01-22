package com;

import java.util.Scanner;

public class Vpattern {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scanner.nextInt();
		int x=1,y=2*n-1,a=0,b=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<n*2;j++) {
				if(j==x||j==y) {
					int n1=a+b;
					System.out.print(n1+" ");
					a=b;
					b=n1;
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			x++;
			y--;
		}
	}

}
