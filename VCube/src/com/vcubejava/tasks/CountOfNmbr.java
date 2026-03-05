package com.vcubejava.tasks;

public class CountOfNmbr {

	int nmbr = 6657;
	int thousands;
	int hundreds;
	int tens;
	int ones;

	public static void main(String[] args) {

		CountOfNmbr c = new CountOfNmbr();

//   to   get first digit 
		c.thousands = c.nmbr / 1000;

//   to get second digit r-66   num%10 gives last digit
		c.hundreds = (c.nmbr / 100) % 10;

//   to get third digit   r-665
		c.tens = (c.nmbr / 10) % 10;

//   to get last digit  nmbr%10 gives last digit
		c.ones = c.nmbr % 10;

		System.out.println("*********************");
		System.out.println("THousands: " + c.thousands);
		System.out.println("Hundreds: " + c.hundreds);
		System.out.println("tens: " + c.tens);
		System.out.println("Ones: " + c.ones);
	}

}

class CountOfNmbrs1 {

	public static void main(String[] args) {
		int nmbr = 495000;
		int lacks;
		int thousands1;

		lacks = nmbr / 100000; // 495000 Divided by 100000 returns 4 as coafficient
		System.out.println("Lacks: " + lacks);

		thousands1 = (nmbr % 100000) / 1000;
		System.out.println("thousands: " + thousands1);

	}
}

class CountOfNmbrs2 {
	public static void main(String[] args){
		int nmbr = 2000;
		int nmbr1 = 500;
		int nmbr2 = 200;
		int nmbr3 = 100;
		int nmbr4 = 50;
		int nmbr5 = 20;
		int nmbr6 = 10;
		int nmbr7 = 5;
		int nmbr8 = 2;
		int nmbr9 = 1;
		
		int thousands;
		int hundreds;
		int tens;
		int ones;
		
		thousands = nmbr/1000;
		System.out.println("thousands: "+thousands);
		
		hundreds = nmbr1/100;
		System.out.println("hundreds: "+hundreds);
		
		hundreds = nmbr2/100;
		System.out.println("hundreds: "+hundreds);
		
		hundreds = nmbr3/100;
		System.out.println("hundreds: "+hundreds);
		
		tens = nmbr4/10;
		System.out.println("tens: "+tens);
		
		tens = nmbr5/10;
		System.out.println("tens: "+tens);
		
		tens = nmbr6/10;
		System.out.println("tens: "+tens);
		
		ones = nmbr7/1;
		System.out.println("Ones: "+ones);
		
		ones = nmbr8/1;
		System.out.println("ones: "+ones);
		
		ones = nmbr9/1;
		System.out.println("ones: "+ones);
		
		int total = nmbr+nmbr1+nmbr2+nmbr3+nmbr4+nmbr5+nmbr6+nmbr7+nmbr8+nmbr9;
		System.out.println("Total : "+total);
	}
}

class CountOfNmbrs3{
	
	public static void main(String[] args) {
		
		int nmbr=4000;
	
		int thousands;
		int fivehundreds;
		int twoHundreds;
		int oneHundreds;
		int tens;
		int ones;
		
		System.out.println("****"+nmbr+"****");
		
		thousands = nmbr/2000;
		System.out.println("thousands: "+thousands);
		
		fivehundreds = (nmbr/500);
		System.out.println("five hundreds: "+fivehundreds);
		
		twoHundreds = (nmbr/200);
		System.out.println("two hundreds: "+twoHundreds);
		
		oneHundreds = (nmbr/100);
		System.out.println("one hundreds: "+oneHundreds);
		
		tens = (nmbr/10);
		System.out.println("tens: "+tens);
		
		ones = (nmbr/1);
		System.out.println("ones: "+ones);
		
	}
	
}