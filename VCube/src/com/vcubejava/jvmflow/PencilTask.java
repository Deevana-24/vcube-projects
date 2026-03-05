package com.vcubejava.jvmflow;

//print balance amount after buying pencils 

public class PencilTask {

	int money=100;
	int pCost=7;
	int blc=money%pCost;
	
	
	public static void main(String[] args) {
		
		PencilTask pt = new PencilTask();	

		System.out.println("Pencil Cost: "+pt.pCost);
		System.out.println("person Having: "+pt.money);
		System.out.println("Remaining Balance: "+pt.blc);
		
	}

}
