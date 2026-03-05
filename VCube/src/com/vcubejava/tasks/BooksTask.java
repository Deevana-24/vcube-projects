package com.vcubejava.tasks;

public class BooksTask {

	int bookId;
	String tittle;
	String auther;
	int price;
	float discount;
	float afterDiscout;
	float finalPrice;
	
	void show() {
		System.out.println("Book Id: "+bookId);
		System.out.println("Book Tittle: "+tittle);
		System.out.println("Book Auther: "+auther);
		System.out.println("Book Price: "+price);
		System.out.println("Price Discount: "+discount);
		System.out.println("Book Final Price: "+finalPrice);
		
		
	}
	
	public static void main(String[] args) {
		
		BooksTask bt = new BooksTask();
		System.out.println("*******Book 1 price***********");
		bt.bookId=121;
		bt.tittle="Ramayana";
		bt.auther="Valmiki";
		bt.price=400;
		bt.discount=10;
		bt.finalPrice=bt.price-(bt.price*bt.discount)/100;
		
		bt.show();
		
		BooksTask bt1 = new BooksTask();
		System.out.println("*******Book 2 price***********");
		bt1.bookId=121;
		bt1.tittle="Geeta";
		bt1.auther="krish";
		bt1.price=600;
		bt1.discount=10;
		bt1.finalPrice=bt1.price-(bt1.price*bt1.discount)/100;
		
		bt1.show();

	}

}
