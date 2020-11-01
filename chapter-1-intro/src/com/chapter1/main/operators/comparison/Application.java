package com.chapter1.main.operators.comparison;

public class Application {

	public static void main(String[] args) {
		
		runComparisonOperators();
		
	}
	
	private static void runComparisonOperators() {
		
		int a = 10;
		int b = 20;
		
		System.out.println("a == b = " + (a == b) );
		System.out.println("a != b = " + (a != b) );
		System.out.println("a > b = " + (a > b) );
		System.out.println("a < b = " + (a < b) );
		System.out.println("b >= a = " + (b >= a) );
		System.out.println("b <= a = " + (b <= a) );
		
	}

}
