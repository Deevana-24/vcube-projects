package com.vcubejava.tasks;

public class TemparatureConvertion {

	double cel =30;
	double f = ((cel*9/5)+32);

	 double f1=86.0;
	double cel1 = ((f1-32)*5/9);
	
	public static void main(String[] args) {
		
		System.out.println("******celcius to foreignheet*********");
		
		TemparatureConvertion tc = new TemparatureConvertion();

		System.out.println("Celcius to foreignheet convertion of "+tc.cel +" is "+tc.f);
		
		System.out.println("******foreignheet to celcius*********");
		
	    System.out.println("Fareignheet to celcius conversion of "+tc.f1 +" is "+tc.cel1);
		
		
	}

}
