package com.vcubejava.constructors;

public class CostructorOverloading {

	String name;
	int batchNo;
	String course;
	int id ;
	
    // Constructor Overloading
	
	//for constructors when we are using same name and different parameters is constructor overloading
	
	CostructorOverloading( int batchNo){
		System.out.println(batchNo);
		this.batchNo=batchNo;
	}
	CostructorOverloading(String name){
		System.out.println(name);
		this.name=name;
	}
	CostructorOverloading(String course,int id){
		System.out.println(course);
		System.out.println(id);
		this.course=course;
		this.id=id;
		
	}
			
	public static void main(String[] args) {
		
		CostructorOverloading c = new CostructorOverloading("deepu");
		CostructorOverloading c1 = new CostructorOverloading(70);
		CostructorOverloading c2 = new CostructorOverloading("J_S_F", 50);

	}

}
