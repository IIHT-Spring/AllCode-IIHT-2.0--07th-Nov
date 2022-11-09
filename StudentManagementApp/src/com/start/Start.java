package com.start;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.start.student.Student;
import com.start.student.StudentDao;

public class Start {

	public static void main(String[] args) throws IOException {
		System.out.println("hello world");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("press 1 to add a student");
			System.out.println("press 2 to Delete a student");
			System.out.println("press 3 to display a student");
			System.out.println("press 4 to exit the app");
			int choice = Integer.parseInt(br.readLine());

			if (choice == 1) {
				// add student
				System.out.println("Enter Students fullname: ");
				String name =br.readLine();
				
				System.out.println("Enter Student's phone number: ");
				String phone = br.readLine();
				
				System.out.println("Enter Student's city: ");
				String city = br.readLine();
				
				Student st = new  Student(name,phone,city);
				
				System.out.println(st);
				
				 boolean answer = StudentDao.addStudentToDB(st);
				 if(answer) {
					 System.out.println("Student added sucessfully");
					 
				 } else {
					 System.out.println("there is some problem please contact the admin.");
					 
				 }
				
				
			} else if (choice == 2) {
				// delete student
			} else if (choice == 3) {
				// display student
			} else if (choice == 4) {
				// exit menu
			} else {

			}
			System.out.println("Thanks for using the student managements system ");
		}

	}

}
