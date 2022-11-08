package com.learn.oop.abstraction;

public class NishantTech implements ITCompanies {


	public void Working() {
		System.out.println("Nishant tech is working on a Java project");
	}
	
	public static void main(String[] args) {
		NishantTech SMS = new NishantTech();
		SMS.Working();
	}

}
