package assespp;

import java.util.Scanner;

public class OccurenceChar {
static final int no=256;
static void printOccur(String str) {
	int[] count=new int[no];
	for(int i=0;i<str.length();i++) {
		count[str.charAt(i)]++;
	}
	char ch[]=new char[str.length()];
	for(int i=0;i<str.length();i++) {
		ch[i]=str.charAt(i);
		int find=0;
		for(int j=0;j<str.length();j++) {
			if(str.charAt(i)==ch[j]) {
				find++;
			}
		}
		if(find==1)
		System.out.println("occurence of "+str.charAt(i)+" is "+count[str.charAt(i)]);
	}
}
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter  the String");
	String str=scanner.next();
	
	printOccur(str);
}
}
