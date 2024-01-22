package com;

public class Bike extends Vehicle {
	
	@Override
	void start() {
		System.out.println("bike started quickely");
		super.start();
	}
	public static void main(String[] args) {
		Bike b= new Bike();
		b.start();
		
	}
}
