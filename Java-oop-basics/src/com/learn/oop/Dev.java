package com.learn.oop;

 public class Dev extends Employee{ // child class
	 Integer Bonus = 25000;
	 Integer total = Bonus + BaseSalary;
	 public static void main(String[] args) {
		 
		Dev Nishant = new Dev();
		System.out.println("Total salary of Nishant is " + Nishant.total);
	}
 }

