package com;


public class Demmo1 {
	String check(int[] num) {
		int max=num[0];
		int min=num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
			if(num[i]<min) {
				min=num[i];
			}
		}
		return max+" "+min;
		
	}
	public static void main(String[] args) {
		int[] n= {4,1,7,2,8};
		System.out.println(new Demmo1().check(n));
		
	}

}
