package abc.cj;

public class CarApp {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.brand = "Swift";
		c1.cost = 800000.98;
		Car c2 = new Car();
		c2.brand = "Wagnor";
		c2.cost = 700000.56;
		Car c3;
		c3 = c1;
		System.out.println("Brand: "+c3.brand+"\ncost: "+c3.cost);
		}

}
