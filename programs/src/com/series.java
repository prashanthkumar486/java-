package com;

import java.util.Scanner;

public class series{
	
public static void test ( int num )
{  
int b = 2 ;
int temp ; 
int a = 1 ,
c = 0 , d ;
System.out.print (  c+ " , " ) ;
 System.out.print ( a ) ; 
for ( int i = 0 ; i <=num; i++ )
{
d=a*b+c;
System.out.print ( " , " + d);
temp=a;
a=d;
c=temp;
}
}
 public static void main ( String [ ] args ) 
 {
	 Scanner sc= new Scanner(System.in ) ; 
	 System.out.println ( " Enter one int number " ) ; 
	 int n = sc.nextInt ( ) ; test ( n ) ;
}
}
