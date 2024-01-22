package com;

class PAlindrome {
public static void main(String[] args) {
	String s="maa";
	String m=s;
	String str="";
	
	for(int  i=s.length()-1;i>=0;i--) {
		str+=s.charAt(i);
	}
	//System.out.print(str);
	//for(int j=s.length()-1;j>=1;j--) {
	//	str+=s.charAt(j);
	
	//}
	if(m.equals(str)) {
		System.out.println("the given String is palindrome");
	}
	else{
		System.out.println("not a palindrome");
	}
	System.out.println(str);
}
}
