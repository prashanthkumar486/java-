package com;

public class SumTwoNUmber {

	public static void main(String[] args) {
		int num=4825454;
		int rem=0;
		int sum=0;
		while(num!=0) {
			if(num<100) {
				rem=num%10;
				sum=sum+rem;
			}
			num=num/10;
		}
		System.out.println(sum);
		
		
		

	}

}
