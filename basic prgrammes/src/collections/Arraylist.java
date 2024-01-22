package collections;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(10.2);
		l.add(null);
		l.add("Java");
		
System.out.println(l);
System.out.println(l.get(1));
System.out.println(l.size());
System.out.println(l.contains("Java"));
	}

}
