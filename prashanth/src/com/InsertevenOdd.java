package com;

import java.util.*;

public class InsertevenOdd {
	public static int[] orderwise(int[] num) {
		int[] res = new int[num.length];
		int x=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0) {
				res[x]=num[i];
				x++;
			}
		}
		for(int j=0;j<num.length;j++) {
			if(num[j]%2!=0) {
				res[x]=num[j];
				x++;
			}
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
		new InsertevenOdd().orderwise(num);
	}

}
