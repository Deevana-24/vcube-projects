package com.vcubejava.datatypes;

public class WrapperObjectDatatypes {

	public static void main(String[] args) {

		// ******AUTO-BOXING & AUTO-UNBOXING *****
		// Converting primitive to wrapper is auto boxing
		// converting wrapper to primitive is auto un-boxing
		System.out.println("****AUTO-BOXING & AUTO-UNBOXING******");

		// Byte

		byte b = 1;
		Byte b1 = b;
		System.out.println("Auto boxung byte: " + b1);

		Byte b2 = 9;
		byte b3 = b2;
		System.out.println("AAuto-unboxing byte: " + b3);

		// short

		short s = 2;
		Short s1 = s;
		System.out.println("Auto boxung short: " + s1);

		Short s2 = 4;
		short s3 = s2;
		System.out.println("AAuto-unboxing short: " + s3);

		//int

		int i1 = 20;
		Integer i2 = i1;
		System.out.println("Auto boxung: " + i2);

		Integer i3 = 100;
		int i4 = i3;
		System.out.println("Auto-unboxing int: " + i4);

        //long		

		long l =621358268671L;
		Long l1 = l;
		System.out.println("Auto boxung long: " + l1);
		
		Long l2 = 678378L;
		long l3 = l2;
		System.out.println("Auto unboxing long: "+l3);
		
		//float
		
		float f =7.3f;
		Float f1 = f;
		System.out.println("Autoboxing float: "+f1);
		
		Float f2 = 24.000f;
		float f3 = f2;
		System.out.println("Auto unboxing float: "+f3);
		
		//double
		
		double d =38394803.8039840;
		Double d1 = d;
		System.out.println("Auto boxing double: "+d1);
		
		Double d2 = 63449.840498;
		double d3 = d2;
		System.out.println("Auto unboxing double: "+d3);
		
		//char 
		
		char c = 'A';
		Character c1 = c;
		System.out.println("Auto boxing: "+c1);
		
		Character c2 = 'B';
		char c3 = c2;
		System.out.println("Auto unboxing: "+c3);
		
		// boolean 
		
		boolean boo = false;
		Boolean boo1 = boo;
		System.out.println("Auto boxing boolean: "+boo1);
		
		Boolean boo2 = true;
		boolean boo3 = boo2;
		System.out.println("Auto unboxing boolean: "+boo3);
		
		

	}

}
