package collections;

import java.util.LinkedList;

public class Solution {
	public static void main(String[] args) {
		LinkedList<Employee> l = new LinkedList<Employee>();
		l.add(new Employee("tom",25.3));
		l.add(new Employee("marry",25.2563));
		l.add(new Employee("jonny",25.32589654));
		
		System.out.println(l);
		System.out.println("****************************");
		for(int i=0;i<l.size();i++) {
			System.out.println(l);
		}
	}

}
