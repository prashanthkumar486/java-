package mphasis;

public class PrimeNum {

	public static void main(String[] args) {
		int n=7,count=0;
		for(int i=1;i<=n;i++) 
			if(n%i==0) 
				count++;
			
			if(count==2)
				System.out.println("its prime num");
			else
				System.out.println("not a prime ");
		}

	}


