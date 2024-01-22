package com;

public class CountEven {
	 static int check(int num) {
		int count=0;
		while(num>0)
		{
		int rem=num%10;
		if(rem%2==0) {
			count++;
		}
		num=num/10;
		}
		return count++;		

	}

	public static void main(String[] args) {
	//CountEven cu=new CountEven();
	System.out.println(check(445556));
    
	}
}

