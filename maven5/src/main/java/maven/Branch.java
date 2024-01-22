package maven;

import java.util.Set;

public class Branch {
	private Set<String> branch;
	private Student student;
	public Set<String> getBranch() {
		return branch;
	}
	public void setBranch(Set<String> branch) {
		this.branch = branch;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Branch [branch=" + branch + ", student=" + student + "]";
	}
	

}
