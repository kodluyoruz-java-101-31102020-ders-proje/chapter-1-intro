package com.chapter1.main.operators.comparison;

public class Application {

	public static void main(String[] args) {
		
		runComparisonOperators();
		
	}
	
	private static void runComparisonOperators() {
		
		int a = 10;
		int b = 20;
		int c = 20;
		
		boolean result = (a == b);
		System.out.println(result);
		
		result = (a != b);
		System.out.println(result);
		
		System.out.println("a == b = " + (a == b) );
		System.out.println("a != b = " + (a != b) );
		System.out.println("a > b = " + (a > b) );
		System.out.println("a < b = " + (a < b) );
		System.out.println("b >= c = " + (b >= c) );
		System.out.println("b > c = " + (b > c) );
		System.out.println("b <= a = " + (b <= a) );
		
	}

}
