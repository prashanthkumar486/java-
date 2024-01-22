package ioclast;
public class Employee {
	private int eid;
	private String ename;
	public void hi() {  // init()  any name you can give it
		System.out.println("initializing bean object");
	}
	public void bye() {
		System.out.println("destroying bean object");
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
	

}
