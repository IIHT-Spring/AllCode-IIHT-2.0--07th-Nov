package com.learn.oop.encapsulation;

public class Yamaha {
	
	public static void main(String[] args) {
		
		// we are creating an object of the encapsulated instance 
		Bike FZ = new Bike();
		
		FZ.setName("Yamaha FZ");
		FZ.setCC(150);
		FZ.setColor("Blue");
		FZ.setPrice(90000);
		System.out.println(FZ.getName());
	}
	

}
