package collection;

import java.util.ArrayList;

public class Student {
	int age;
	Student(int age){
		this.age=age;
	}
    @Override
	public String toString() {
		return "age:"+age;
	}
	public static void main(String[] args) {
		Student s1=new Student(20);
		Student s2=new Student(30);
		Student s3=new Student(25);
		ArrayList<Student> l=new ArrayList<Student>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
	System.out.println("----------");
		for(Student s:l) {
			System.out.println(s);
		}
	}

}
