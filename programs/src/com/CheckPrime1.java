package com;

import java.util.Scanner;

public class CheckPrime1{  
	public static void main(String args[]){  
		int count=0;  
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//it is the number to be checked      
		if(n==0||n==1){
			System.out.println(n+" is not prime number");    
		}
		else
		{
			for(int i=2;i<n;i++)
			{    
				if(n%i==0)
				{    
					System.out.println(n+" is not prime number");    
					count++;    
					break;    
				}    
			}    
			if(count==0)  
			{ 
				System.out.println(n+" is prime number");
			}
		}//end of else
	}  
} 
