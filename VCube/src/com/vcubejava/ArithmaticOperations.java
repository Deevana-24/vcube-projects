package com.vcubejava;

 class ArithmaticOperations {

	int a=10;
	int b=20;
	int c= a+b;
	int d = a-b;
	int e= a*b;
	int f = a/b;
	public static void main(String[] args) {
		
		ArithmaticOperations Ap = new ArithmaticOperations();
		
         System.out.println( "addithon : "+Ap.c);
         System.out.println("Subtraction: "+Ap.d);
         System.out.println("multiplication: "+Ap.e);
         System.out.println("Division: "+Ap.f);
	}

}
