package com;

public class Kangaroo {
	double height=5.6;
	void display() {
		double height=5.7;
	
		System.out.println(height);
		System.out.println(this.height);
	}

	public static void main(String[] args) {
		
Kangaroo k = new Kangaroo();
k.display();
	

	}

}
