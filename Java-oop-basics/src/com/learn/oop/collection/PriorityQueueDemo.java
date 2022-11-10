package com.learn.oop.collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	
	public static void main(String[] args) {
		PriorityQueue<String> CustomerQueue = new PriorityQueue<>();
		
		CustomerQueue.add("Amit");
		CustomerQueue.add("Rakesh");
		CustomerQueue.add("Shivam");
		
		
		System.out.println("LEad is " + CustomerQueue.peek());
		Iterator<String> its = CustomerQueue.iterator();
		while (its.hasNext()) {
			System.out.println(its.next());
		}
		
		
		
	}

}
