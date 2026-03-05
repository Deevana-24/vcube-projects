package com.vcubejava.tasks;

public class StudentMarks {

	String name;
	String bname;
	int marks1;
	int marks2;
	int marks3;
	
	StudentMarks(String name,String bname, int marks1, int marks2, int marks3){
		
		this.name=name;
		this.bname=bname;
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
		
	}
	void display() {
		
		System.out.println("Student Name:"+name);
		System.out.println("Student BranchName:"+bname);
		System.out.println("Student Marks 1:"+marks1);
		System.out.println("Student Marks 2:"+marks2);
		System.out.println("Student Marks 3:"+marks2);
		
		int total = marks1+marks2+marks3;
		int average = total/3;
		
		System.out.println("Total Marks: "+total);
		System.out.println("Average:"+average);
		
		
	}
	
	
	public static void main(String[] args) {

		StudentMarks s = new StudentMarks("deepu","Jsf",89,88,90);
		s.display();
		
		System.out.println("**************************");
		
		StudentMarks s1 = new StudentMarks("nishitha","Jsf",89,78,79);
		s1.display();
		
        System.out.println("**************************");
		
		StudentMarks s2 = new StudentMarks("anjali","Jsf",89,98,79);
		s2.display();
		
	}

}



