package test2;

public class Vtu {
	private int vid;
	private String vname;
	private College college;
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	@Override
	public String toString() {
		return "Vtu [vid=" + vid + ", vname=" + vname + ", college=" + college + "]";
	}
	

}
