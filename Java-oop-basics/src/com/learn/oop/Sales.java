package com.learn.oop;

public class Sales extends Employee {
	 Integer Bonus = 10000;
	 Integer insentive ;
	 //Integer total = Bonus + BaseSalary;
	 public static void main(String[] args) {
		Sales Ashish =  new Sales();
		Ashish.insentive = 	2000;
		Ashish.TotalSalary(Ashish.BaseSalary, Ashish.Bonus, Ashish.insentive);
	
	}

}
