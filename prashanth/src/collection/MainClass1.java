package collection;

import java.util.TreeSet;

public class MainClass1 {
	public static void main(String[] args) {
		Employee c1=new Employee(21);
		Employee c2=new Employee(22);
		Employee c3=new Employee(20);
		TreeSet<Employee> s=new TreeSet<Employee>();
		s.add(c1);
		s.add(c2);
		s.add(c3);
		for(Employee r:s) {
			System.out.println(r);
		}
	}

}