package com.learn.oop.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDEmo {

	public static void main(String[] args) {
		LinkedHashSet<String> laptops = new LinkedHashSet<>();

		laptops.add("HP");
		laptops.add("Lenovo");
		laptops.add("dell");
		laptops.add("HP");
		laptops.add("HP");
		

		Iterator<String> its = laptops.iterator();
		while (its.hasNext()) {
			System.out.println(its.next());
		}

	}

}
