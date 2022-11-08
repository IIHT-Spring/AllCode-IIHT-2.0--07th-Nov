package com.learn.oop;

public class Employee {
	Integer BaseSalary = 50000; // this as parent class
	// when the name of two methods are same butt the parameters are different
	// we call is Method over loading

	void TotalSalary(Integer BS, Integer Bonus) {
		Integer total = BS + Bonus;
		System.out.println(total);
	}

	void TotalSalary(Integer BS, Integer Bonus, Integer insentive) {
		Integer total = BS + Bonus + insentive;
		System.out.println(total);
	}

	void Working() {
		System.out.println("Employee is working");
	}

}
