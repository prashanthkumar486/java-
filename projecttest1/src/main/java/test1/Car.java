package test1;

public class Car {
	private int carid;
	private String  carname;
	public Car(int carid, String carname) {
		super();
		this.carid = carid;
		this.carname = carname;
	}
	public int getCarid() {
		return carid;
	}
	public void setCarid(int carid) {
		this.carid = carid;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	@Override
	public String toString() {
		return "Car [carid=" + carid + ", carname=" + carname + "]";
	}
	

}
