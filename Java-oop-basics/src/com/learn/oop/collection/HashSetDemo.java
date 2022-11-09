package com.learn.oop.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		
		HashSet<String> members = new HashSet<String>();
		
		members.add("nishant");
		members.add("keshav");
		members.add("peter");
		members.add("peter");
		
		
		members.remove("peter");
		
		
		Iterator<String> its = members.iterator();
		while(its.hasNext()) {
			System.out.println(its.next());
		}
		
	}

}
