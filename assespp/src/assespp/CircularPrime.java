package assespp;

public class CircularPrime {
	static int p=0;
	public static String check(int num) {
		int c1=0;
		int temp=num;
		while(temp>0) {
			c1++;
			System.out.println("c1:"+c1);

			temp=temp/10;
		}
		int c2=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				c2++;
				System.out.println("c2:"+c2);

			}
		}
		if(c2>0) {
			return "not a circular prime";
		}
		num=(num%10)*(int)Math.pow(10, (c1-1))+(num/10);
		System.out.println(num);
		p++;
		System.out.println("p:"+p);
		if(p<c1) {
			check(num);
		}
		
		return "circular";
	}
	public static void main(String[] args) {
		System.out.println(check(197));
	}

}
