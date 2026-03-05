package com.vcubejava.ExamsPapers;

public class Test_28_2_26 {

	static int x = 10;

	public static void main(String[] args) {

		x = 20;
		System.out.println(x); // x is 20..because inside the main we re-assinged x value
								// 1st priority is always local data
	}

}

class Test1 {
	void change(int num) {
		num = num + 10;

		System.out.println("from change()" + num);
	}

	public static void main(String[] args) {
		Test1 t = new Test1();

		int x = 20;

		t.change(x);
		System.out.println("X vakue is " + x); // op:20 because here we trying to print x

	}
}

class Test2 {

	static void show(int a) {
		System.out.println("int");
	}

	public static void main(String[] args) {

		show(10);
		show(10);// op:int int
	}
}

class Test3 {

	static void show(float a) {
		System.out.println("float");
	}

	static void show(double a) {
		System.out.println("double");
	}

	public static void main(String[] args) {

		show(10);// op:float because int can convert into float.
	}
}

class Test4 {
	static int test(int x) {
		
		
		return x++;
	}

	public static void main(String[] args) {
		int a = 5;
		System.out.println(test(a));
		System.out.println(a);//op: 5 5  why
		
		
	}
	
	
}
