package com;

public class Main1 {
	public static void check(String str) {
		/*int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(count+1); */
		/*String[] res=str.split(" ");
		System.out.println(res.length);
		System.out.println(res[0].length());
		System.out.println(res[res.length-1]);
		System.out.println(res[res.length-1].length());*/
		/*int count=0;
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i)!=' ') {
				count++;
			}
			else {
				break;
			}
		}
		System.out.println(count );*/
		int count=0;
		int c1=0;
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i)==' ') {
				count++;
			}
			if(count==1 && str.charAt(i)!=' ') {
				c1++;
			}
			if(count>1) {
				break;
			}
	}
		System.out.println(c1);
	}
	public static void main(String[] args) {
		check("abv hello hi prashu");
	}
}
