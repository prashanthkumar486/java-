package singleton;

public class Student {

	String name;
	int age;
	private static Student st;
	private Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return "age of "+name+" is "+age;
	}
	public static Student getInstance() {
		if(st==null) {
			st=new Student("prashanth",23);
		}
		return st;
	}
	
}
