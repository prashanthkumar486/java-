package maven;

import java.util.Set;

public class College {
	private int c_id;
	private String c_name;
	private Set<Branch> braches;
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
	public Set<Branch> getBraches() {
		return braches;
	}
	public void setBraches(Set<Branch> braches) {
		this.braches = braches;
	}
	@Override
	public String toString() {
		return "College [c_id=" + c_id + ", c_name=" + c_name + ", braches=" + braches + "]";
	}
	

}
