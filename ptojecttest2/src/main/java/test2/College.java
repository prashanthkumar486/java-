package test2;

public class College {
	private int cid;
	private String cname;
	private Branch branch;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "College [cid=" + cid + ", cname=" + cname + ", branch=" + branch + "]";
	}
	

}
