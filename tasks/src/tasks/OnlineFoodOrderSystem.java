package tasks;

import java.util.Scanner;

public class OnlineFoodOrderSystem {

	
	
	 double calculateItemTotal(double price, int quantity) {
		
        double amount = (price*quantity);
        System.out.println("initial bill: "+amount);
		
		return amount;	
		
	}
	
	 double addGst(double amount) {

		    double amountWithGst = amount + (amount * 0.05);

		    System.out.println("Amount with GST: " + amountWithGst);

		    return amountWithGst;
		}

	
	 double addDeliveryCharges(double amountWithGst) {
		
		double addDeliveryCharges = amountWithGst+40;
		System.out.println("with delivery Charges: "+addDeliveryCharges);
		
		return addDeliveryCharges;
		
}
	void printBill(double addDeliveryCharges) {
		
		
		System.out.println("Final Bill: "+addDeliveryCharges);
	}	
	
	public static void main(String[] args) {

		OnlineFoodOrderSystem  food = new OnlineFoodOrderSystem();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Price");
		double price = sc.nextDouble();
		
		System.out.println("Enter Quantity");
		int quantity = sc.nextInt();
		
		
		food.printBill(food.addDeliveryCharges(food.addGst(food.calculateItemTotal(price, quantity))));
		
	}

}
