package com.chapter1.main.operators.bitwise;

public class Application {

	public static void main(String[] args) {
		
		runBitwiseOperators();
		
	}
	
	private static void runBitwiseOperators() {
		
		int a = 60; /* 60 = 0011 1100 */
		int b = 13; /* 13 = 0000 1101 */
		int c = 0;
		
	// AND Operation in bitwise
		/* 60 = 0011 1100 */
		/* 13 = 0000 1101 */
	//&______________________
	//     12 = 0000 1100
		
		c = a & b;  /* 12 = 0000 1100 */
		System.out.println("a & b = " + c );
		
		
	// OR Operation in bitwise
		/* 60 = 0011 1100 */
		/* 13 = 0000 1101 */
	// | ______________________
	//     61 = 0011 1101
		
		c = a | b; /* 61 = 0011 1101 */
		System.out.println("a | b = " + c );
	
		
	// XOR Operation in bitwise	
		/* 60 = 0011 1100 */
		/* 13 = 0000 1101 */
	//&______________________
	//     49 = 0011 0001

		
		c = a ^ b; /* 49 = 0011 0001 */
		System.out.println("a ^ b = " + c );
		
		c = ~ a; /*-61 = 1100 0011 */ // -60-1 = -61
		System.out.println("~a = " + (c + 1) );
		
		
		int d = 10; // -10-1 = -11
		c = ~ d;
		System.out.println("~d = " + (c + 1) );
		
		
		c = a << 1; /* 240 = 1111 0000 */
		System.out.println("a << 1 = " + c );
		
		c = a << 2; /* 240 = 1111 0000 */
		System.out.println("a << 2 = " + c );
		
		c = a << 3; /* 240 = 1111 0000 */
		System.out.println("a << 3 = " + c );
		
		c = a << 4; /* 240 = 1111 0000 */
		System.out.println("a << 4 = " + c );
		
		c = a << 5; /* 240 = 1111 0000 */
		System.out.println("a << 5 = " + c );
		
		c = a << 6; /* 240 = 1111 0000 */
		System.out.println("a << 6 = " + c );
		
		c = a << 7; /* 240 = 1111 0000 */
		System.out.println("a << 7 = " + c );
		
		c = a << 8; /* 240 = 1111 0000 */
		System.out.println("a << 8 = " + c );
		
		c = a << 9; /* 240 = 1111 0000 */
		System.out.println("a << 9 = " + c );
		
		
		char t = 'a';
		int t1 = t << 2;
		System.out.println("t1 << 1 = " + ((char)t1) );
		
		
		
		c = a >> 1; /* 15 = 1111 */
		System.out.println("a >> 1 = " + c );
		
		c = a >> 2; /* 15 = 1111 */
		System.out.println("a >> 2 = " + c );
		
		c = a >> 3; /* 15 = 1111 */
		System.out.println("a >> 3 = " + c );
		
		c = a >> 4; /* 15 = 1111 */
		System.out.println("a >> 4 = " + c );
		
		c = a >> 5; /* 15 = 1111 */
		System.out.println("a >> 5 = " + c );
		
		
		
		c = a >>> 2; /* 15 = 0000 1111 */
		System.out.println("a >>> 2 = " + c );
		
	}

}
