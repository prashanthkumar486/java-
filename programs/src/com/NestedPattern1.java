package com;

public class NestedPattern1 {
//We have to divide numbers and alphabets separate ,then make an increment order.
	public static void main(String[] args) {
		int n=1;
		char c='A';
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if((i+j)<=4) {
					System.out.print(n+"  ");
					n++;
				}
				else {
					System.out.print(c+"  ");
					c++;
				}
			}
			System.out.println();
		}
	}

}
