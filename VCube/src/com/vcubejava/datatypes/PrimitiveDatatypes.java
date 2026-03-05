package com.vcubejava.datatypes;

public class PrimitiveDatatypes {

//***Byte******
	byte b;
	byte b1 = 1;
	byte b2 = 127; // more than 127 we can't store into byte..range -127 to 128
	byte b3 = (byte) 128; // it returns -128....-127+1=-128
	byte b4 = (byte) 135; // it returns -127+8=-121

//******SHORT******	
	short s;
	short s1 = 12;
	short s2 = 32767; // we can't shore more than this value

//******INT********	
	int i;
	int i1 = 10;
	int i2 = 2147483647; // we can't store more than this value

//******LONG********	
	long l;
	long l1 = 21537254734L;
	long l2 = 9223372036854775807L; // we can't store more than this value

//********FLOAT*******
	float f;
	float f1 = 289.90f; // it can 7 digits after decimal point
	float f2 = (float) 4353454.875655467;// converting double to float
	float f3 = 9223372036854775807669597987698792462f;// 9.223372E36 convert into exfloataion

// ********DOUBLE******
	double d;
    double d1 = 7468649857.764832648; // it can store 15 digits after decimal point

//********CHAR*******   
	char c;
    char c1 = 'A';
    char c2 = 67; // ASCII value 65-90 = A_Z
    char c3 = 120; //            98-122 = a-z
    char c4 ='\u0040'; //@
    
//*******BOOLEAN**********    
	boolean boo;
    boolean boo1 = true;
	public static void main(String[] args) {

		PrimitiveDatatypes pdt = new PrimitiveDatatypes();

		System.out.println("*********BYTE********");
		System.out.println("byte " + pdt.b);
		System.out.println("byte with 1: " + pdt.b1);
		System.out.println("byte with 127: " + pdt.b2);
		System.out.println("byte with 128: " + pdt.b3);
		System.out.println("byte with 135: " + pdt.b4);

		System.out.println("*********SHORT***********");
		System.out.println("short default value: " + pdt.s);
		System.out.println("short with 12: " + pdt.s1);
		System.out.println("short with range: " + pdt.s2);

		System.out.println("*********INT***********");
		System.out.println("int default value: " + pdt.i);
		System.out.println("int normal int: " + pdt.i1);
		System.out.println("int with range: " + pdt.i2);

		System.out.println("*********LONG***********");
		System.out.println("long default value: " + pdt.l);
		System.out.println("long with normal value: " + pdt.l1);
		System.out.println("long range: " + pdt.l2);

		System.out.println("*********FLOAT***********");
		System.out.println("float deafault value: " + pdt.f);
		System.out.println("float normal value: " + pdt.f1);
		System.out.println("float with high value: " + pdt.f2);
		System.out.println("float in exfloatation: " + pdt.f3);
		
		System.out.println("*********DOUBLE***********");
		System.out.println("double default value: " + pdt.d);
		System.out.println("double normal value: " + pdt.d1);
		
		System.out.println("*********CHAR***********");
		System.out.println("char defalut value: " + pdt.c);
		System.out.println("char normal value: " + pdt.c1);
		System.out.println("char with 65: " + pdt.c2);
		System.out.println("char with 120: " + pdt.c3);
		System.out.println("char with \u0040: " + pdt.c4);
		
		System.out.println("*********BOOLEAN***********");
		System.out.println("boolean default value: " + pdt.boo);
		System.out.println("boolean normal value: " + pdt.boo1);
		
	}

}
