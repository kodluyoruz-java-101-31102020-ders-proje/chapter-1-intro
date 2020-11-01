package com.chapter1.main.ifelse.statements;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	 	System.out.println("Ev kredisi miktarını giriniz?");
	 	double creditValue = scanner.nextDouble();
	 	
	 	double creditRatio = 1.5;
	 	
	 	if(creditValue <= 100000 && creditValue >= 50000) {
	 		creditRatio = 1.10;
	 	}
	 	else if(creditValue <= 200000 && creditValue > 100000) {
	 		creditRatio = 0.90;
	 	}
	 	else if(creditValue >= 500000) {
	 		creditRatio = 0.70;
	 	}
		
	 	double totalAmount = (creditValue * creditRatio) + creditValue;
	 	
	 	System.out.println("You should pay " + totalAmount + " TL");
	 	
	 	scanner.close();
	 	
	 	
	 	String message = (creditValue > 500000) ? "Kredi kartınız ücretsiz verilmiştir" : "Kredi kartınızı sadece 10 TL ücret ile alabilirsiniz";
	 	System.out.println(message);
	}
	
}
