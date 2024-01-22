package logical.com;

public class ReccursiveFib {
	static  int fib(int count) {
		if(count<=1) {
			return count;
		}
		else {
			return fib(count-1)+fib(count-2);
		}
	}
public static void main(String[] args) {
	int n=10;
	for(int i=0;i<n;i++) {
		System.out.print(fib(i)+" ");
	}
}
}
