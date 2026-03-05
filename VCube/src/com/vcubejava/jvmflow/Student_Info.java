package com.vcubejava.jvmflow;

public class Student_Info {

	String sName;
	int id;
	int age;
   char gender;
   
    int engMks;
    int sciMks;
    int comMks;
    int hinMks;
    int LabMks;
   
   int total;
   int avg;
   
   void display() {
	   

		 System.out.println("Student Name: "+sName);
		 System.out.println("Student Id: "+id);
		 System.out.println("Student Age: "+age);
		 System.out.println("Student Gender: "+gender);
		 System.out.println("Student Marks Total: "+total);
		 System.out.println("Student Average of total: "+avg);
		

	  
   }
	
	public static void main(String[] args) {
		
		System.out.println("****************STUDENT 1 DETAILS****************************");
		
		Student_Info si = new Student_Info();
		si.sName="Deevana";
		si.id=50;
		si.age=27;
		si.gender='F';
		
		si.engMks=90;
		si.sciMks=80;
		si.comMks=98;
		si.hinMks=60;
		si.LabMks=81;
		
		si.total=si.engMks+si.sciMks+si.comMks+si.hinMks+si.LabMks;
		si. avg = si.total/5;
		si.display();
		 
		 
		 System.out.println("****************STUDENT 2 DETAILS****************************");
			
			Student_Info si1 = new Student_Info();
			si1.sName="karuna";
			si1.id=50;
			si1.age=24;
			si1.gender='F';
			
			si1.engMks=90;
			si1.sciMks=90;
			si1.comMks=98;
			si1.hinMks=90;
			si1.LabMks=81;
			
			si1.total=si1.engMks+si1.sciMks+si1.comMks+si1.hinMks+si1.LabMks;
			si1. avg = si1.total/5;
			 si1.display();
			
	}

}
