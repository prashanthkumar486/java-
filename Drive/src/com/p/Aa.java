package com.p;

public class Aa {
	public static void main(String[] args) {
		int i=-2;
		int j=2;
		int k=j+2*i;
		if(i>k){
			k=k+2;	
		}
		else {
			k=k-2;
		}
		if(k>i) {
			i=i+2;
		}
		else {
			i=i-2;
		}
		System.out.println(i+" "+j+" "+k);
	}

}
