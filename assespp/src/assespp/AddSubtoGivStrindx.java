package assespp;

import java.util.Scanner;

public class AddSubtoGivStrindx {
	 static String newString = "";
	public static String addStr(String originalStr,String givenStr,int index) {
		
//		int length=0;
//		for(char ch:originalStr.toCharArray()) {
//			length++;
//		}
		char[] ch=originalStr.toCharArray();
		for(int i=0;i<ch.length;i++) {
			
			if(i==index) {
				newString+=givenStr;
			}
			newString+=originalStr.charAt(i);
		}
		return newString;
	}
	
	
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter original String");
	String originalStr=scanner.next();
	System.out.println("enter given String");
	String givenStr=scanner.next();
	System.out.println("enter the index number");
	int index=scanner.nextInt();
	
	System.out.println("the original String is "+originalStr);
	System.out.println("the Given String is "+givenStr);
	System.out.println("the index is "+index);
	System.out.println("the output String is "+addStr(originalStr, givenStr, index));
	
}
}
