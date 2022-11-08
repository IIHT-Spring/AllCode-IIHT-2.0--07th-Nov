package com.learn.oop;

public class HR extends Employee {
	 Integer Bonus = 20000;
	 Integer total = Bonus + BaseSalary;
	 public static void main(String[] args) {
		HR Anisha = new HR();
		System.out.println("anisha's total salary is " + Anisha.total);
	}

}
