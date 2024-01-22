package com;

public class CountPrime{
	public static void check(int[] num) {
		int prime=0;
		for(int i=0;i<num.length;i++) {
			int count=0;
			for(int j=2;j<num[i];j++) {
				if (num[i]%j==0) {
					count++;
				}
			}
			if(num[i]>=2 && count==0) {
				//prime++;
				System.out.println(num[i]+" "+i);
			}
		}

	}
	public static void main(String[] args) {
		int[] num= {3,2,1,0,5,8,7,11,17,10};
	check(num);
		
	}

}
