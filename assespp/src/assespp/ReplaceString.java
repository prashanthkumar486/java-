package assespp;

import java.util.Scanner;

public class ReplaceString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the our own sentence");
		
		String str=sc.nextLine();
		System.out.println("enter word to replace in the sentence");
		
		String newword=sc.nextLine();
		System.out.println("enter the new string to be insert");
		
		String replaceTo=sc.nextLine();
		System.out.println("enter the index value to insert");
		
		int place =str.indexOf(newword);
		int length=0;
		for(char ch:newword.toCharArray()) {
			length++;
		}
		
        
        String result = str.substring(0, place) + replaceTo +str.substring(place+length);
        System.out.println(result);
      
	}
}
	


