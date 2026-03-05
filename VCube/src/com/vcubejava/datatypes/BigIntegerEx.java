 package com.vcubejava.datatypes;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerEx {

	BigInteger nmbr;
	BigDecimal prcnt;
	
	public static void main(String[] args) {

		//class object
		//BigIntegerEx t1= new BigIntegerEx();
		System.out.println("main method started");
		
		//object data type object
		BigInteger bi1 = new BigInteger("123456");
		BigInteger bi2 = new BigInteger("123456");
		
		//using inbuilt methods of BigInteger
		
		System.out.println("Performing addition");
		System.out.println(bi1.add(bi2));
		
		System.out.println("Performing subtraction");
		System.out.println(bi1.subtract(bi2));
		
		System.out.println("Performing multiplication");
		System.out.println(bi1.multiply(bi2));
		
		System.out.println("Performing division");
		System.out.println(bi1.divide(bi2));
	}

}
