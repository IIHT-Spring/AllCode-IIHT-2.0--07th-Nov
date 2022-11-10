package com.junit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.junit.demo.Calculator;

public class BeforeAndAfterTest {

	Calculator calc;

	@BeforeEach
	public void init() {
		calc = new Calculator();
		System.out.println("the before each method is being called right now ");
	}
	
	@AfterEach
	public void after() {
		System.out.println("After each test case");
	}
	
	
//	@BeforeAll
//	public void BeforeAll() {
//		System.out.println("before all");
//	}
//	
//	@AfterAll
//	public void AfterAll() {
//		System.out.println("After all ");
//	}

	@Test
	@DisplayName("Adding two positive numbers ")
	public void testAddMethod() {
		int sum = calc.add(10, 100);
		assertEquals(110, sum);
		System.out.println("the total is " + sum);
	} // we have written our first test case

	@Test
	@DisplayName("substracting two positive numbers ")

	public void testSubMethod() {

		int total = calc.sub(10, 100);
		assertEquals(-90, total);
		System.out.println("the sub value is  is " + total);
	} // we have written our first test case

	@Test
	@DisplayName("multiplying two positive numbers ")
	public void testProductMethod() {
		int sum = calc.product(5, 100);
		assertEquals(500, sum);
		System.out.println("the total is " + sum);
	} // we have written our first test case

}
