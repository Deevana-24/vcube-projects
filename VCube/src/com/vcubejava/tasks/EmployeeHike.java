package com.vcubejava.tasks;

public class EmployeeHike {

	String employeeName;
	int employeeSalary;
	int employeeId;
	int hikePercentage;
	int totalSalary;
	int hikeAmount;
	
	void employeeDetails() {
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Employee Id : "+employeeId);
		System.out.println("Employee Salary : "+employeeSalary);
		System.out.println("Employee Hike Percentage : "+hikePercentage);
		System.out.println("Employee Hike Amonnnut: "+hikeAmount);
		System.out.println("Employee Total Salary : "+totalSalary);
		
		
	}
	
	public static void main(String[] args) {

		EmployeeHike e = new EmployeeHike();
		e.employeeName="Deevana";
		e.employeeSalary=40000;
		e.employeeId=07;
		e.hikePercentage=20;
		e.hikeAmount=(e.employeeSalary*20)/100;
		e.totalSalary=e.employeeSalary+e.hikeAmount;

        e.employeeDetails();
	}

}
