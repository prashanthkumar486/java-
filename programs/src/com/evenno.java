package com;

public class evenno {

	public static void main(String[] args) {
		int  arr[] = new int [] {1, 2, 3, 4,5,7,5,4,9};  
        System.out.println("lenth of the array:"+arr.length);//length is 9;
        System.out.println("Elements of given array: ");  
        //Loop through the array by incrementing value of i  
        for (int i =0; i < arr.length; i++)
        {
        	if(arr[i]%2==0) 
        	{
            System.out.print(arr[i] + " ");  
        }  
    }   

	}

}
