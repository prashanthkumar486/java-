package com;

public class Evenn {
	static int print1(int value,int power) {
		int res=1;
		for(int i=1;i<=power;i++) {
			res=res*value;
		}
		return res;
	}

	public static void main(String[] args) {
		//int res=(int)Math.pow(5, 3);        //narrowing    ** 
		//System.out.println(res);
      System.out.println(print1(4,3));
	}

}
