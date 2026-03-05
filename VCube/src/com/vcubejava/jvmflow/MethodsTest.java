package com.vcubejava.jvmflow;

public class MethodsTest {

// static method
	public static void show() {
		System.out.println("From static method");
	}
//main method
	void main() {
		System.out.println("from main method");
		MethodsTest m = new MethodsTest();
		show();

	}

// instance method
	public void show1() {
		System.out.println("From instance method");

	}

}
