package collection;
import java.util.ArrayList;
import java.util.Collections;

public class Demo1 {
	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(20);
		l.add(40);
		l.add(10);
		l.add(5);
		Collections.sort(l);
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);
	}

}
