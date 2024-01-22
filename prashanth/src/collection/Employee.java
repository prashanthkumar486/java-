package collection;

 class Employee implements Comparable<Employee> {
	int age;
	Employee(int age){
		this.age=age;
	}
	public String toString() {
		return "age:"+age;
	}
	@Override
	public int compareTo(Employee c) {
		// TODO Auto-generated method stub
		return this.age=c.age;
	}

}
