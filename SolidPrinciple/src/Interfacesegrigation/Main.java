package Interfacesegrigation;

public class Main {

	public static void main(String[] args) {
		Canon c=new Canon();
		c.print();
		System.out.println("----------");
		Espon e=new Espon();
		e.print();
		e.scan();
		System.out.println("--------");
		Nikon n=new Nikon();
		n.print();
		n.scan();
		n.fax();
	}

}
