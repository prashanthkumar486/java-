package logical.com;

public class StringPalindrome {
	
	
	static String check(String str) {
		boolean b=true;
		String str1=str.toLowerCase();
		int length=str.length();
		for(int i=0;i<length/2;i++) {
			if(str1.charAt(i)!=str1.charAt(length-1-i)) {
				b= false;
				break;
			}
		}
	   return (b==true)? "palindrome":"not palindrome";
	}
	public static void main(String[] args) {
	
		System.out.println(check("mahesh"));
	}

}
