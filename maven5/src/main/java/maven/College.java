package maven;

import java.util.Map;

public class College {
	private Map<Integer,String> college;
	private Branch branch;
	public Map<Integer, String> getCollege() {
		return college;
	}
	public void setCollege(Map<Integer, String> college) {
		this.college = college;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "College [college=" + college + ", branch=" + branch + "]";
	}
	

}
