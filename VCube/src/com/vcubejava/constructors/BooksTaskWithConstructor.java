

package com.vcubejava.constructors;


//****CONSTRUCTOR-OVERLOADING, THIS(), CONSTRUCTOR CHAINING*********


public class BooksTaskWithConstructor {
	
	String bookname;
	String autherName;
	int price;
	String releasedOn;
	
	 BooksTaskWithConstructor(String bookname, String authername, int price, String releasedOn){
    	
		System.out.println("four org constructor");
		
		this.bookname=bookname;
		this.autherName=authername;
		this.price=price;
		this.releasedOn=releasedOn;
		
    }	
	
    BooksTaskWithConstructor(String bookname, String authername, int price){
		System.out.println("three org constructor");
		this("Maha Bharatham","Krishna",300,"12-05-2000");
	}
    BooksTaskWithConstructor(String bookname, String authername){
		
		System.out.println("two org constructor");
		this("Maha Bharatham","Krishna",300);
	}
    BooksTaskWithConstructor(String bookname){
		System.out.println("one org constructor");
		this("Maha Bharatham","Krishna");
	}

    BooksTaskWithConstructor(){
		this("Maha Bharatham");
		System.out.println("No arg Constructor");
	}
	
    void show() {
    	System.out.println("Book name: "+bookname);
    	System.out.println("Book Auther Name: "+autherName);
    	System.out.println("Book price: "+price);
    	System.out.println("Released On: "+releasedOn);
    }
    
	public static void main(String[] args) {

		System.out.println("Main method started");
		BooksTaskWithConstructor b = new BooksTaskWithConstructor();	
		b.show();
	}

}
