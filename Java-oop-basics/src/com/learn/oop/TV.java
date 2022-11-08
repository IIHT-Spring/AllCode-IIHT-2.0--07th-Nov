package com.learn.oop;

public class TV { // this is my class 
	// defined the field for a tv
	String Brand; 
	String ModelName;
	Integer screenSize;
	Integer price;
	String color;
	String DisplayType;
	
	// defining the main method 
	public static void main(String[] args) {
		
		TV lgOled = new TV();
		TV SamsungFrame = new TV(); // creating objects / instances from the class
		
		lgOled.Brand = "LG";
		lgOled.ModelName = "4K oled 75' tv";
		lgOled.screenSize = 75;
		lgOled.price = 100000;
		lgOled.color = "black";
		lgOled.DisplayType = "OLED";
		
		System.out.println(lgOled.Brand + " " + lgOled.ModelName);
		
		
		}

}
