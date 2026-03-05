package com.vcubejava.constructors;

public class CountObjectsByConstructors {

	static int count;
	CountObjectsByConstructors(){
		count ++;
	}
	
	public static void main(String[] args) {
 
		CountObjectsByConstructors c = new CountObjectsByConstructors();
		CountObjectsByConstructors c1 = new CountObjectsByConstructors();
		
		
		System.out.println("Count Of Objects By constructor: "+count);
		
	}

}
