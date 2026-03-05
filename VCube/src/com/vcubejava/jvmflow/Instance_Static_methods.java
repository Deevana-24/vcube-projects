package com.vcubejava.jvmflow;


//call instance and static methods without creating objects in main() and without callling methods from main()


public class Instance_Static_methods {

	
	//create object in static block because it will loads first
	static {
		System.out.println("static block started");
		Instance_Static_methods t = new Instance_Static_methods();

		t.m1(); //we can call instance methods in static block.but we canr call statc methods in instance block
		
	}

	void m1() {
		System.out.println("Instance method 1");
		m2();  // we can call instance methods directly in instance method
	}

	void m2() {
		System.out.println("Instance method 2");
		s1();
	}

	static void s1() {
		System.out.println("static method 1");
       s2();  // we can call static methods in static block directly
	}

	static void s2() {
		System.out.println("Static method 2");
	    
	}

	public static void main(String[] args) {

		System.out.println("main method started");

	}
}
