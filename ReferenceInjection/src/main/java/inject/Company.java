package inject;

public class Company {
	private String ceo;
	private Employee employee;
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Company [ceo=" + ceo + ", employee=" + employee + "]";
	}
	
}
