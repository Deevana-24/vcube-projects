package com.vcubejava.tasks;

public class AriaOfTriangle {

	double base=10;
	double height=9;
	
	//formula b*h/2
	
	double area=(base*height)*0.5;
	public static void main(String[] args) {

		AriaOfTriangle at = new AriaOfTriangle();
		
		System.out.println("Area of triangle is : "+at.area);
	}

}
