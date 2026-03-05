package com.vcubejava.constructors;

import java.util.Scanner;

public class FamilyInfoByConstructors {

	static String surName="odugu";
	String name, fname, mname,sname,bname,bname1 ;
	int age, fAge, mAge, sAge, bAge, bAge1;
	
	FamilyInfoByConstructors(){
		
		System.out.println("no org constructor");
		this("unknown","uiouo","uyih","iyiu","hgfguu","tyuyjuh");
	}
	
	FamilyInfoByConstructors(String name,String fname,String mname, String sname, String bname, String bname1 ){
		System.out.println("String parameterised constructor");
		this(1,1,1,1,1,1);
	}
	FamilyInfoByConstructors(int age, int fAge, int mAge, int sAge, int bAge,int bAge1){
		System.out.println("int parameterised constructor");
		this.name=name;	
		this.age=age;
		
	}
	void display() {
		
	}
	
	
	public static void main(String[] args) {

		FamilyInfoByConstructors f = new FamilyInfoByConstructors();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter yoyr name");
		f.name=sc.nextLine();
		
		System.out.println("Enter yoyr name");
		f.age=sc.nextInt();
		
		System.out.println("Name: "+f.name +"  Surname: "+surName +"Age: "+f.age);
		sc.close();
	}

}
