package com.vcubejava;

public class FamilyEx {

	static String surName;
	String name;
	static String city;
	
	public static void main(String[] args) {

		System.out.println("Main method started");
		
		FamilyEx f = new FamilyEx();
		f.name="Durga Rao";
	    surName="Odugu";
	    city="Machilipatnam";
		
	    System.out.println("SurName :"+surName);
		System.out.println("Name :"+f.name);
		System.out.println("City :"+city);
		
		FamilyEx f1 = new FamilyEx();
		f1.name="Radhika Varma";
	    surName="Odugu";
	    city="Machilipatnam";
		
	    System.out.println("SurName :"+surName);
		System.out.println("Name :"+f1.name);
		System.out.println("City :"+city);
		
		FamilyEx f2 = new FamilyEx();
		f2.name="Deevana";
	    surName="Odugu";
	    city="Machilipatnam";
		
	    System.out.println("SurName :"+surName);
		System.out.println("Name :"+f2.name);
		System.out.println("City :"+city);
		
		FamilyEx f3 = new FamilyEx();
		
		f3.name="Karuna";
	    surName="Odugu";
	    city="Machilipatnam";
		
	    System.out.println("SurName :"+surName);
		System.out.println("Name :"+f.name);
		System.out.println("City :"+city);
		
		FamilyEx f4 = new FamilyEx();
		f4.name="Monvitanshi Varma";
	    surName="Odugu";
	    city="Machilipatnam";
		
	    System.out.println("SurName :"+surName);
		System.out.println("Name :"+f4.name);
		System.out.println("City :"+city);
		
		FamilyEx f5 = new FamilyEx();
		f5.name="Arush Varma";
	    surName="Odugu";
	    city="Machilipatnam";
		
	    System.out.println("SurName :"+surName);
		System.out.println("Name :"+f4.name);
		System.out.println("City :"+city);
		System.out.println("Mian method Ended");
		
		
	}

}
