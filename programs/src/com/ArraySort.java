package com;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {    
	public static void main(String[] args) {        
		//define original array   
		System.out.println("Enter the size elements:");
		Scanner sc = new Scanner(System.in);	
		int size=sc.nextInt();
		int [] n = new int [size] ;
		System.out.println("enter array elements");
		for(int i=0;i<size;i++) {
			n[i]=sc.nextInt();
		}

		//{52,45,32,64,12,87,78,98,23,7};     
		//int temp = 0;    

		//print original array    
		System.out.println("Original array: ");    
		for (int i = 0; i <n.length; i++) {     
			System.out.print(n[i] + " ");    
		}    
		//Sort the array in ascending order using two for loops    
		//        for (int i = 0; i <n.length; i++) {     
		//          for (int j = i+1; j <n.length; j++) {     
		//              if(n[i] >n[j]) {      //swap elements if not in order
		//                 temp = n[i];    
		//                 n[i] = n[j];    
		//                 n[j] = temp;    
		//               }     
		//            }     
		//        }  
		Arrays.sort(n);

		//print sorted array    
		System.out.println("\nArray sorted in ascending order: ");    
		for (int i = 0; i <n.length; i++) {     
			System.out.print(n[i] + " ");    
		}    
	}    
}    