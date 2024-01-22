package test1;

public class Vehicle {
	private  Car car;
	private Bike bike;
	public Vehicle(Car car, Bike bike) {
		super();
		this.car = car;
		this.bike = bike;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Bike getBike() {
		return bike;
	}
	public void setBike(Bike bike) {
		this.bike = bike;
	}
	@Override
	public String toString() {
		return "Vehicle [car=" + car + ", bike=" + bike + "]";
	}
	
	
	
	

}
