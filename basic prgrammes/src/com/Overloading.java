package com;

public class Overloading {
	void display(int x) {
		System.out.println(x);
	}
	void findsq(int num) {
		System.out.println(num*num);
	}
	void cube(int y) {
		System.out.println(y*y*y);
	}

	public static void main(String[] args) {
		Overloading o = new Overloading();
		o.display(10);
		o.findsq(66);
		o.cube(5);

	}

}
