package com.vcubejava.jvmflow;

public class StateBank {

	static int sequence=123450;
	
	 static int acNo;
	{
		acNo ++;
	}
	
	String name;
	String pno;
	int balance;
	
	
	
	public static void main(String[] args) {

		System.out.println("Mainmethod started");
		
		
		System.out.println("******************** coustomer 1 detais****************");
		StateBank sb = new StateBank();
		
		sb.name="Deevana";
		sb.pno="8367528227";
		sb.balance=1000;
		
		System.out.println("Bank Id: "+sequence);
		System.out.println("Account Number:"+(sequence+acNo));
		System.out.println("Name: "+sb.name);
		System.out.println("Mobile Number: "+sb.pno);
		System.out.println("Balance: "+sb.balance);
		
		
		System.out.println("******************** coustomer 2 detais****************");
		StateBank sb1 = new StateBank();
		
		sb1.name="Karuna";
		sb1.pno="8367528227";
		sb1.balance=10000;
		
		System.out.println("Bank Id: "+sequence);
		System.out.println("Name: "+sb1.name);
		System.out.println("Mobile Number: "+sb1.pno);
		System.out.println("Balance: "+sb1.balance);
		System.out.println("Account Number:"+(sequence+acNo));
		
		
		System.out.println("******************** coustomer 3 detais****************");
		StateBank sb2 = new StateBank();
		
		sb2.name="Prabhu";
		sb2.pno="8367528227";
		sb2.balance=4000;
		
		System.out.println("Bank Id: "+sequence);
		System.out.println("Name: "+sb2.name);
		System.out.println("Mobile Number: "+sb2.pno);
		System.out.println("Balance: "+sb2.balance);
		System.out.println("Account Number:"+(sequence+acNo));
		
	}

}
