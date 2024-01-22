package num;

public class Pal3210123 {
	static int check(int n) {
		
		return check(n--); 
	}
	public static void main(String[] args) {
		System.out.println(check(3));
	}

}
