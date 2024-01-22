package com;
import java.util.Scanner;

public class ArrayInputFizz {
	/*
	 step1--> take 2 variables one int value 0,int aray var same size as
	 step2-->iterate gib=ven array from 0 to length-1
	      1) check bucket element not equal to  
	      if(true)
	         *inserrt element to res array
	         *icreament int var
	       else
	       continue
	 step3--> print res array
	 */
	public int[] shiftRight(int[] num) {
		int x=0;
		int[] res=new int[num.length];
		for(int i=0;i<num.length;i++) {
			if(num[i]!=0) {
				res[x]=num[i];
				x++;
			}
		}
		for(int j=0;j<res.length;j++) {
			System.out.print(res[j]+" ");
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*//ArrayInputFizz ai= new ArrayInputFizz();
		int[] num= {1,0,0,2,0,0,3};
           ai. shiftRight(num);*/	
		System.out.println("enter the array size");
		int size=sc.nextInt();
		int[] num=new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<=num.length-1;i++) {
			num[i]=sc.nextInt();
		}
		new ArrayInputFizz().shiftRight(num); // ai.shiftRight(num)
sc.close();
	}

}
