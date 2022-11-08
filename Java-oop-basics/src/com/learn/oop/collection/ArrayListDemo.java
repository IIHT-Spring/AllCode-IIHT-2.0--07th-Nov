package com.learn.oop.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> ParticipantList = new ArrayList<>(); // this is how you create an array list
		ParticipantList.add("Nishant"); // index = 0
		ParticipantList.add("Asif"); // 1
		ParticipantList.add("Akhil"); // 2
		ParticipantList.add("John"); // 3
		ParticipantList.add("Sisie"); // 4
		ParticipantList.add(1, "Dhoni");
		

		Iterator itr = ParticipantList.iterator();// getting the itretator for our participant list

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
