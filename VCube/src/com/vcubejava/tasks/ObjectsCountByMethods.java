package com.vcubejava.tasks;

public class ObjectsCountByMethods {

	static int object;
	
	void objectCount() {
		
		object++;
		
	}
	
	public static void main(String[] args) {

		ObjectsCountByMethods oc = new ObjectsCountByMethods();
		oc.objectCount();
		
		ObjectsCountByMethods oc1 = new ObjectsCountByMethods();
		oc1.objectCount();
		
		System.out.println("Created objects are:  "+object);
		
		
	}

}
