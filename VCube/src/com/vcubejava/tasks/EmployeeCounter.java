package com.vcubejava.tasks;


//****test ..total employee will increses with 1 count every time when object is created.

public class EmployeeCounter {

	static int totalEmployees;
	//int employeeNmbr;
	 {
		System.out.println("New Employee Joining");
		totalEmployees+=1;
	}
	 static {
	   System.out.println("company started");
	   totalEmployees=0;
	 }
	 static void getTotalEmployees() {
		 System.out.println("Total number of employees:"+totalEmployees);
	 }
	 void displayEmployeeNumber() {
		 
		 System.out.println("this is Employee Number: "+totalEmployees);
	 }
	 
	public static void main(String[] args) {

		EmployeeCounter e = new EmployeeCounter();
		e.displayEmployeeNumber();
		getTotalEmployees();
		

		EmployeeCounter e1 = new EmployeeCounter();
		e1.displayEmployeeNumber();
		getTotalEmployees();
	}

}
