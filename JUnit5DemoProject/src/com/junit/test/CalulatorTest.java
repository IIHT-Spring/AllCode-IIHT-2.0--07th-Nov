package com.junit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.junit.demo.Calculator;

public class CalulatorTest {

	@Test
	@DisplayName("Adding two positive numbers ")
	public void testAddMethod() {
		Calculator calc = new Calculator();
		int sum = calc.add(10, 100);
		assertEquals(110, sum);
		System.out.println("the total is " + sum);
	} // we have written our first test case

	@Test
	@DisplayName("substracting two positive numbers ")

	public void testSubMethod() {
		Calculator calc = new Calculator();
		int total = calc.sub(10, 100);
		assertEquals(-90, total);
		System.out.println("the sub value is  is " + total);
	} // we have written our first test case

	@Test
	@DisplayName("multiplying two positive numbers ")
	public void testProductMethod() {
		Calculator calc = new Calculator();

		int sum = calc.product(5, 100);
		assertEquals(500, sum);
		System.out.println("the total is " + sum);
	} // we have written our first test case

}
