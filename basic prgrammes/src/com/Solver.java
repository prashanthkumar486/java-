package com;

public class Solver {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		 int sum=0;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		
		
		System.out.println("***********************************");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
			System.out.println("***********************************");
			for(int i=a.length-1;i>=0;i--) {
				System.out.println(a[i]);
			
				sum= sum +a[i];
			System.out.println(sum);
		}
	}
	

}
