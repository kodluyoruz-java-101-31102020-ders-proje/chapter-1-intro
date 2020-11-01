package com.chapter1.main.operators.arithmetic;

public class Application {

	public static void main(String[] args) {
		
		runArithmeticOperators();
	
	}
	
	private static void runArithmeticOperators() {
		
		int a = 10;
		int b = 20;
		int c = 25;
		int d = 25;
		
		System.out.println("a + b = " + (a + b) );
		System.out.println("a - b = " + (a - b) );
		System.out.println("a * b = " + (a * b) );
		System.out.println("b / a = " + (b / a) );
		System.out.println("b % a = " + (b % a) );
		System.out.println("c % a = " + (c % a) );
		
		System.out.println("a++ = " + (a++) );
		System.out.println("After a++= " + a);
		
		System.out.println("b-- = " + (a--) );
		System.out.println("After b--= " + b);
		
		System.out.println("d++ = " + (d++) );
		
		System.out.println("++d = " + (++d) );
		System.out.println("After ++d= " + d);
	}

}
