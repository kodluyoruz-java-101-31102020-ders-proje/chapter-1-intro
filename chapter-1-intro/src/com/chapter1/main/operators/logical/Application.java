package com.chapter1.main.operators.logical;

public class Application {

	public static void main(String[] args) {
		
		runLogicalOperators();
		
	}
	
	private static void runLogicalOperators() {
		
		int sayi1 = 15;
		int sayi2 = 20;
		
		
		boolean numbersAreEqual = (sayi1 == sayi2);
		boolean sayi2GreaterThanSayi1 = (sayi2 > sayi1);
		
		// && => VE (AND Operator)
		boolean result = numbersAreEqual && sayi2GreaterThanSayi1;
		System.out.println(result);
		
		// || => VEYA (OR Operator)
		result = numbersAreEqual || sayi2GreaterThanSayi1;
		System.out.println(result);
		
		boolean sayi1LowerThanSayi2 = (sayi1 < sayi2); 
		
		result = (sayi1LowerThanSayi2 && sayi2GreaterThanSayi1) || numbersAreEqual;
		System.out.println(result);
		
		
		boolean a = true;
		boolean b = false;
		
		System.out.println("a && b = " + (a && b));
		System.out.println("a || b = " + (a || b) );
		System.out.println("!(a && b) = " + !(a && b));
		
	}

}
