package com;

import java.util.*;

public class LeftShift {
		public int[] shiftLeft(int[] n) {
			int x=n.length-1;
			int[] re=new int[n.length];
			System.out.println(Arrays.toString(re));
			for(int i=n.length-1;i>=0;i--) {
				if(n[i]!=0) {
					re[x]=n[i];
					x--;
				}
			}
			/*for(int j=0;j<re.length;j++) {
				System.out.print(re[j]+" ");
			}
			return re; */
			System.out.println(Arrays.toString(n));
			System.out.println(Arrays.toString(re));
			return re;
		}

		public static void main(String[] args1) {
			Scanner sc=new Scanner(System.in);
			/*//ArrayInputFizz ai= new ArrayInputFizz();
			int[] num= {1,0,0,2,0,0,3};
	           ai. shiftRight(num);*/	
			System.out.println("enter the array size");
			int size=sc.nextInt();
			int[] n=new int[size];
			System.out.println("enter the array elements");
			for(int i=0;i<size;i++) {
				n[i]=sc.nextInt();
			}
			new LeftShift().shiftLeft(n); // ai.shiftleft(n)
	sc.close();
		}

	}


