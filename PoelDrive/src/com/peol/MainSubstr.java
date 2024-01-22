package com.peol;

import java.util.Scanner;

public class MainSubstr {
	public static String addStr(String mainStr,String subStr,int index) {
		String newString = "";
		int length=0;
		for(char ch; s1.toChsrArray()) {
			length++;
		}
		for(int i=0;i<length;i++) {
			
			if(i==index) {
				newString+=subStr;
			}
			newString+=mainStr.charAt(i);
		}
		return newString;
	}
	

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter main the String");
		String s1=scanner.next();
		System.out.println("enter given String");
		String s2=scanner.next();
		System.out.println("enter the index number");
		int index=scanner.nextInt();
		
		System.out.println("the original String is "+s1);
		System.out.println("the Given String is "+s2);
		System.out.println("the index is "+index);
		System.out.println("the output String is "+addStr(s1, s2, index));

	}

}
