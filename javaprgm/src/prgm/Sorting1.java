package prgm;
import java.util.Scanner;
public class Sorting1 {


	public static void main(String[] args) {
		int temp=0;
		int[] a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<=a.length-1;i++) {
			for(int j=i+1;j<=a.length-1;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]+"");
		}
		sc.close();

	}

}
