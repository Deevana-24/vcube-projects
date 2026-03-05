package com.vcubejava.ExamsPapers;

public class Test_14_2_26 {

	//is it eligible for garbage  
	
	//ans no..why..?
	public static void main(String[] args) {

		
		String s1 = new String("Java");
		String s2 = s1;
		s1=null;
		
		System.out.println(s2);
	}

}
