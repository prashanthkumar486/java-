package com;

import java.util.Scanner;

public class Main2 {
	public static String test(String str) {
		/*int count=0;
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i)!=' ') {
				count++;
			}
			else {
				break;
			}
		}
		System.out.println(str.length()+" "+count);
		int res=str.length()-count;
		return str.substring(res);   */
		
		int c1=0;
		int c2=0;
		int c3=0;
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i)==' ') {
				c1++;
			}
			if(c1<=1 ) {
				c2++;
			}
			if(c1<1) {
				c3++;
			}
			if(c1==2) {
				break;
			}
		}
		System.out.println(str.length()+" "+c2+" "+c3);
		return str.substring((str.length()-c2),str.length()-(c3+1));
		
	}

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter String");
	   String str=sc.nextLine();
	   System.out.println(test(str));
		

	}

}
