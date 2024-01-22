package mphasis;

public class TempSwamp {

	public static void main(String[] args) {
		int m=10,n=20;
		int temp=0;
		temp=m; //10
		m=n; //20
		n=temp;
		System.out.println(m);
		System.out.println(n);
		
System.out.println(("==========="));
m=m*n;
n=m/n;
m=m/n;
System.out.println(m);
System.out.println(n);
System.out.println("==========");
m=m^n;
n=m^n;
m=m^n;
System.out.println(m);
System.out.println(n);

	}

}
