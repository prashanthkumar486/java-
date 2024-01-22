package maven;

import java.util.List;

public class Student {
	private List<String> sname;

	public List<String> getSname() {
		return sname;
	}

	public void setSname(List<String> sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + "]";
	}
	

}
