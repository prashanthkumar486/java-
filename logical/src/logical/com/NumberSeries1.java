package logical.com;

public class NumberSeries1 {
public static void main(String[] args) {
	int n=10;
	int a=0;
	int b=1;
	for(int i=0;i<n;i++) {
		System.out.print(a+" ");
		int c=(b*2)+a;
		a=b;
		b=c;
	
		
	}
}
}
