package com.vcubejava.constructors;
import java.util.Scanner;


//  ********PARAMETERISED CONSTRUCTOR BY SUING SCNNAER************
public class StudentMarksInfo {

	//Using Scanner
	String name;
	String bname;
	int marks1;
	int marks2;
	int marks3;
	int marks4;
	int marks5;
	
	StudentMarksInfo(String name, String bname, int marks1, int marks2, int marks3, int marks4, int marks5){
	
		this.name=name;
		this.bname=bname;
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
		this.marks4=marks4;
		this.marks5=marks5;
		
	}
	void display() {
		
		System.out.println("Enter Name :"+name);
		System.out.println("Enter branch name :+name");
		System.out.println("Enter marks1 :+marks1");
		System.out.println("Enter marks2 :+marks2");
		System.out.println("Enter marks3 :+marks3");
		System.out.println("Enter marks4 :+marks4");
		System.out.println("Enter marks5 :+marks5");
		
		int total = marks1+marks2+marks3;
		int average = total/3;
		
		System.out.println("Total Marks: "+total);
		System.out.println("Average:"+average);
		
		
	}
	
	public static void main(String[] args) {

		String name, bname;
		int marks1, marks2, marks3, marks4, marks5;
		
				
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name ");
		 name = sc.nextLine();
		System.out.println("Enter branch name ");
		bname = sc.nextLine();
		System.out.println("Enter marks1 ");
		marks1=sc.nextInt();
		System.out.println("Enter marks2 ");
		marks2=sc.nextInt();
		System.out.println("Enter marks3 ");
		marks3=sc.nextInt();
		System.out.println("Enter marks4 ");
		marks4=sc.nextInt();
		System.out.println("Enter marks5 ");
		marks5=sc.nextInt();
		
		StudentMarksInfo s = new StudentMarksInfo(name, bname, marks1, marks2, marks3, marks4, marks5);
		
		sc.close();
		
		System.out.println("main method ended");
	}

}
