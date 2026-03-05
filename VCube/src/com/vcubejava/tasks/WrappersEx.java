package com.vcubejava.tasks;

public class WrappersEx {

	String name="Deevana";
	Integer salary=5000;
	Double pf=0.8/100;
	Double da=0.06;
	Double gst=0.06;
	Double total=salary-pf-da-gst;
	
	{
		
		 pf=salary*0.8/100;
		 da=salary*0.06/100;
		 gst=salary*0.06/100;
		 total=salary-pf+da-gst;
		
		System.out.println("Employee Name:"+name);
		System.out.println(" EmployeeSlaray:"+salary);
		System.out.println("Employee Pf:"+pf);
		System.out.println("Employee da:"+da);
		System.out.println("Employee gst:"+gst);
		System.out.println("Total salary:"+total);
	}
	
	public static void main(String[] args) {

		WrappersEx wrapper = new WrappersEx();
		
	}

}
