package Interfacesegrigation;

public class Nikon implements Interface1,Interface2,Interface3 {

	@Override
	public void fax() {
		System.out.println("Fax");
		
	}

	@Override
	public void scan() {
		System.out.println("Scan");
		
	}

	@Override
	public void print() {
		System.out.println("print");
		
	}

}
