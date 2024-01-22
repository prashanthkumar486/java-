package com;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddSingle {

	public static int[] order(int[] num) {
		int[] res = new int[num.length];
		int x=0;
		int j=num.length-1;
		int y=num.length-1;
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0) {
				res[x]=num[i];
				x++;
			}
		
			if(num[j]%2!=0) {
				res[y]=num[j];
				y--;;
			}
			j--;
		}	
		System.out.println(Arrays.toString(res));
	return res;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size= sc.nextInt();
		int[] num=new int[size];
		System.out.println("enter array elements");
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
		}
		sc.close();
		order(num);
	}

}
