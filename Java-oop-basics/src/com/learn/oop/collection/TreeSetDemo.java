package com.learn.oop.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	
	
	public static void main(String[] args) {
		TreeSet<String> cars = new TreeSet<String>();
		
		cars.add("honda");
		cars.add("Mercedes");
		cars.add("BMW");
		
		
		
		Iterator<String> its = cars.descendingIterator();
		while (its.hasNext()) {
			System.out.println(its.next());
		}
	}

}
