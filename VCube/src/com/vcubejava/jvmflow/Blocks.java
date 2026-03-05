package com.vcubejava.jvmflow;

public class Blocks {
	
// static block	
	static {
		System.out.println("From static block");
	}
	
	void main() {
		System.out.println("From main method");
	}
	
// instance block	
	{
		System.out.println("From instance block");
	}

}
