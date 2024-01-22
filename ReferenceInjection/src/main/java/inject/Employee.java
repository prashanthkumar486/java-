package inject;

public class Employee {
	private int salary;
	private String company;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", company=" + company + "]";
	}
	
}
