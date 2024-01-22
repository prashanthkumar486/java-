package com;
//import java.*;

import java.util.*;

public class ContactArray {
	public static int[] check(int[] a, int[] b) {
		int[] res=new int[a.length+b.length];
		//int x=0;
		int y=0;
		for(int i=0;i<res.length;i++) {
			if(i<a.length) {
				res[i]=a[i];
			}
			else {
				res[i]=b[y];
				y++;
			}
		}
		
		System.out.println(Arrays.toString(res));
		return res;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size1=sc.nextInt();
		int[] a=new int[size1];
		for(int i=0;i<size1;i++) {
			a[i]=sc.nextInt();
		}
		
		int size2=sc.nextInt();
		int[] b=new int[size2];
		for(int i=0;i<size2;i++) {
			b[i]=sc.nextInt();
		}
		
   check(a,b);
	}

}
