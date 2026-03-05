package com.vcubejava.jvmflow;

public class ObjectsCoutWithblock {

	static int a=0;
	{
		
		a++;
	}
	
	public static void main(String[] args) {
      
		ObjectsCoutWithblock b = new ObjectsCoutWithblock();
		ObjectsCoutWithblock b1 = new ObjectsCoutWithblock();
		
	System.out.println("count :"+a);
	
	
	}

}



