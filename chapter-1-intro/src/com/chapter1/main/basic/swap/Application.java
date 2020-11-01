package com.chapter1.main.basic.swap;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Number1 giriniz");
		int number1 = scanner.nextInt();

		System.out.println("Number2 giriniz");
		int number2 = scanner.nextInt();
		
		
		System.out.println("Before Swap");
		System.out.println("N1: " + number1);
		System.out.println("N2: " + number2);
		
		
		int temp = 0;
		temp = number1;
		number1 = number2;
		number2 = temp;
		
		System.out.println("After Swap");
		System.out.println("N1: " + number1);
		System.out.println("N2: " + number2);
		
		scanner.close();
	}

}
