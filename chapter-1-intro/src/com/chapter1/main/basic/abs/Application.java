package com.chapter1.main.basic.abs;

public class Application {

	public static void main(String[] args) {
		
		System.out.println(abs(-10));
		System.out.println(absWithBitwise(-10));
		System.out.println(absWithBitwise(-98));
		System.out.println(absWithBitwise(-1909));
		
	}
	
	public static int abs(int a) {
		
		if(a < 0) {
			return (-1 * a);
		}
		
		return a;
	}

	public static int absWithBitwise(int a) {
		
		if(a < 0) {
			
			a = ~a;
			a = a + 1;
			return a;
		}
		
		return a;
	}
	
}
