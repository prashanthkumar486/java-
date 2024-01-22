package collections;

import java.util.LinkedList;

public class Linked {

	public static void main(String[] args) {
		LinkedList l =new LinkedList();
		l.add(l);
		l.add(10);
		l.add("java");
		l.add(26.33);
		
		System.out.println(l);
		System.out.println(l.indexOf("java"));
		System.out.println(l.contains(10));
		
	}

}
