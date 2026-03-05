package com.vcubejava.methods;

import java.util.Scanner;

public class ScannerEx {

	
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;
	String st;
	
	public static void main(String[] args) {

		ScannerEx s = new ScannerEx();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter byte value");
		s.b = sc.nextByte();
		System.out.println("byte value: "+s.b);
		
		System.out.println("enter short value");
		s.s = sc.nextShort();
		System.out.println("short value: "+s.s);
		
		System.out.println("enter int value");
		s.i =  sc.nextInt();
		System.out.println("int value: "+s.i);
		
		System.out.println("enter long value");
		s.l = sc.nextLong();
		System.out.println("long value: "+s.l);
		
		System.out.println("enter float value");
		s.f = sc.nextFloat();
		System.out.println("float value: "+s.f);
		
		System.out.println("enter double value");
		s.d = sc.nextDouble();
		System.out.println("double value: "+s.d);
		
		//1sc.next();
		
		System.out.println("enter char value");
		s.c = sc.next().charAt(0);
		System.out.println("char value: "+s.c);
		
		sc.nextLine();
		
		System.out.println("enter String value");
		s.st = sc.nextLine();
		System.out.println("String value: "+s.st);
		
		sc.close();
	}

}
