package constructorInjection;

public class Emp {
	private String ename;
	private int eId;
	private double eSal;

	public Emp(String ename, int eId, double eSal) {
		
		this.ename = ename;
		this.eId = eId;
		this.eSal = eSal;
	}
	
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public double geteSal() {
		return eSal;
	}

	public void seteSal(double eSal) {
		this.eSal = eSal;
	}

	@Override
	public String toString() {
		return "Emp [ename=" + ename + ", eId=" + eId + ", eSal=" + eSal + "]";
	}
	

}
