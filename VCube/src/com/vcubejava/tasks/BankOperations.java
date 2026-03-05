package com.vcubejava.tasks;

import java.util.Scanner;

public class BankOperations {

	
	static String name;
	int acNmbr;
	int balance=5000;
	int pin=123;
	
	 Scanner sc = new Scanner(System.in);
	
	
	 {
		
		
		System.out.println("Enter your name");
		name=sc.nextLine();
		

		System.out.println("Enter account Number");
		acNmbr = sc.nextInt();
		
        System.out.println("Enter Your Pin Number");
		pin=sc.nextInt();
		
		
	}
	
	void deposite() {
		
		int depoAmnt;
		System.out.println("Deposite Ammount");
		depoAmnt= sc.nextInt();
		
		int totalAmnt;
		System.out.println("Total Ammount: "+(balance+depoAmnt));
		
	}
	void withdraw() {
		
		int withdrawAmnt;
		System.out.println("withdraw Ammount");
		withdrawAmnt= sc.nextInt();
		
		int totalAmnt=(balance-withdrawAmnt);
		System.out.println("Total Ammount: "+totalAmnt);
	}
	void checkBalance() {
		
		
		System.out.println("Your Balance is :"+balance);
	}
	void pinChange() {
		sc.nextLine();
		
		
		int newPin;
		System.out.println("Enter New Pin");
		newPin=sc.nextInt();
		
		pin=newPin;
		System.out.println("Your new pin is "+pin);
		
	
	}
	
	
	
	public static void main(String[] args) {
		
		
     
		BankOperations ba = new BankOperations();
		System.out.println("********Bank**********");
		
		
	/*	ba.deposite();
		ba.withdraw();
		ba.pinChange();
		ba.checkBalance();
	*/	
     //ba.deposite();
		ba.withdraw();
	}
	
	

}
