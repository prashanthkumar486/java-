package collections;

import java.util.ArrayList;

public class Array1 {

	public static void main(String[] args) {
	
		
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(25.3);
		l.add("java");
		
		for(int i=0;i<l.size();i++) {
			System.out.print(l.get(i));
			
		}
		System.out.println("===========");
		  for(int i= l.size()-1;i>=0;i--) {
			  System.out.print(l.get(i));
		  }
		  System.out.println("***************************");
		  
		  int [] a= {10,20,30,40};
		  
		  for(int i : a) {
			  System.out.println(i);
		  }

}
}