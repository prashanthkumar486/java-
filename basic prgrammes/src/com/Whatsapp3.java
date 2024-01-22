package com;

public class Whatsapp3 extends Whatsapp2 {
	void videocall() {
		System.out.println("you can do video call");
		super.call();
	}
	
	@Override
   void display() {
	   System.out.println("shows blueticks");
   }
}
