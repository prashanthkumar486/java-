package num;

public class RecursiveEven {
	static int evv(int n) {
		if(n>=10) {
			return 10 ;
		}
		if(n%2==0) {		
				System.out.print(n+" "); 
		}
		
	
		return evv(n+1);
	}
	public static void main(String[] args) {
		System.out.println(evv(1));
	}

}
