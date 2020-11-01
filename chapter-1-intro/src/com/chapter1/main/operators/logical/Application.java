package com.chapter1.main.operators.logical;

public class Application {

	public static void main(String[] args) {
		
		runLogicalOperators();
		
	}
	
	private static void runLogicalOperators() {
		
		boolean a = true;
		boolean b = false;
		
		System.out.println("a && b = " + (a && b));
		System.out.println("a || b = " + (a || b) );
		System.out.println("!(a && b) = " + !(a && b));
		
	}

}
