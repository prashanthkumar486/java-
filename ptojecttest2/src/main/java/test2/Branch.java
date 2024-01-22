package test2;

public class Branch {
	private int bid;
	private String bname;
	private Student student;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Branch [bid=" + bid + ", bname=" + bname + ", student=" + student + "]";
	}
	

}
