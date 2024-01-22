package constructormap;

import java.util.Map;

public class Company {
	private String companyname;
	private Map<Integer,String> employeecodeandname;
	public Company(String companyname, Map<Integer, String> employeecodeandname) {
		super();
		this.companyname = companyname;
		this.employeecodeandname = employeecodeandname;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public Map<Integer, String> getEmployeecodeandname() {
		return employeecodeandname;
	}
	public void setEmployeecodeandname(Map<Integer, String> employeecodeandname) {
		this.employeecodeandname = employeecodeandname;
	}
	@Override
	public String toString() {
		return "Company [companyname=" + companyname + ", employeecodeandname=" + employeecodeandname + "]";
	}
	

}
