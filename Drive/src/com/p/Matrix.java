package com.p;

import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of row");
		int row=sc.nextInt();
		System.out.println("Enter the size of col");
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		System.out.println("enter the "+(row*col)+" elements");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The original matrix is ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The sum of diagonal elements is ");
		int sum=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++)
			{
				if(i==j ) {
					sum+=arr[i][j];
					//System.out.println(sum);
				}
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++)
			{
				if(j==row-i-1 ) {
					sum+=arr[i][j];
					//System.out.println(sum);
				}
			}
		}
		System.out.println(sum);
	}
}
