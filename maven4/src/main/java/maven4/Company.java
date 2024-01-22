package maven4;

import java.util.List;

public class Company {
	private int c_id;
	private String c_name;
	private List<Employee> employees;
	public Company(int c_id, String c_name, List<Employee> employees) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.employees = employees;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "Company [c_id=" + c_id + ", c_name=" + c_name + ", employees=" + employees + "]";
	}
	

}
