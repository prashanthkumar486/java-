package com;

public class CircularPrime {
	static int p1=0;
	public static String check(int num) {
		int t1=num;
		//step1:- count number of digits
		int c1=0;
		int c2=0;
		while(t1>0) {
			c1++;
			t1=t1/10;
		}
		//step2:- check number is prime or not
		for(int i=2;i<=num-1;i++) {
			if(num%i==0) {
				c2++;
			}
		}
		if(c2>0) {
			return "not a prime no";
		}
		
		//step3:- rotate given number
		
		num=(num%10)*(int)Math.pow(10,(c1-1))+(num/10);
		System.out.println(num);
		p1++;
		if(p1<c1) {
		check(num);  // step4:- repeat step 3(recursion)
		}
		return "circular prime";
	}
  public static void main(String[] args) {
	System.out.println(check(1193));
}
}
