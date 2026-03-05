package com.vcubejava.jvmflow;


 
	//*******************************************************************************************
	 class Task1Demo {
		static Task1Demo t = new Task1Demo();
		static void method1() {
	    	 System.out.println("Method1 called ");
	    	 t.method2();
	     } 
	      void method2() {
	    	 System.out.println("method2 called");
	     } 
	      static void method3() {
	    	 System.out.println("method3 called");
	    	 t.method4();
	     }
	      void method4() {
	    	 System.out.println("method4 called");
	    	
	     }
	     static {
	    	 System.out.println("Static block executed");
	    	 method1();
	    	 method3();
	     }
		public static void main(String[] args) {
			
	    System.out.println("Main method called");
	   
		}

	}

//****************************************************************************
	 
	  class Task {
		  
		  static {
		    	 	Task t = new Task();
		    	 	System.out.println("Static block executed");
		    	 	t.method2();
		         }	
		  
		  void method2() {
		    	 System.out.println("Instance callss method2 called");
		    
		    	 method4();
		    	 
		     }
		  
		  void method4() {
		    	 System.out.println("Instance callss method4 called");
		    	method1();
		     }
		  
			static void method1() {
		    	 System.out.println("Static Method1 called ");
		    	 method3();	
		     } 
		     
		     static void method3() {
		    	 System.out.println("Static method3 called");
		     }
		      
		   
			public static void main(String[] args) {
				System.out.println("Main method called");
			}

		}