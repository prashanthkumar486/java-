package beanlyfcycle;

public class Exam {
	private String subname;
	private double subDuration;
	private String getSubName;
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	public double getSubDuration() {
		return subDuration;
	}
	public void setSubDuration(double subDuration) {
		this.subDuration = subDuration;
	}
	public String getGetSubName() {
		return getSubName;
	}
	public void setGetSubName(String getSubName) {
		this.getSubName = getSubName;
	}
	
	public void init() {
		System.out.println("exam started....!!!!!");
	}
	public void destroy() {
		System.out.println("exam ended....!!!!!");
	}
	
	@Override
	public String toString() {
		return "Exam [subname=" + subname + ", subDuration=" + subDuration + ", getSubName=" + getSubName + "]";
	}
	

}
