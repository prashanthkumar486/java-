package logical.com;

public class VowelPresent {
public static void main(String[] args) {
	String str="bcm";
	str.toLowerCase();
	int count = 0;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||
				str.charAt(i)=='i'||str.charAt(i)=='o'
				||str.charAt(i)=='u') {
			count++;
		}
	}
	if(count!=0) {
		System.out.println("vowels is present");
	}
	else {
	System.out.println("vowels is not present");
}
	}

}
