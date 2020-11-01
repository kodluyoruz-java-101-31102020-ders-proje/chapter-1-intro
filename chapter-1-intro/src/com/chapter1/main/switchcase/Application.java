package com.chapter1.main.switchcase;

import java.util.Scanner;

public class Application {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		showMenu();
		int operationChoice = makeOperationChoice();
		
		operationNavigator(operationChoice);
		
		scanner.close();
	}
	
	private static void operationNavigator(int operationChoice) {
		
		switch (operationChoice) {
			case 1:
				System.out.println("Danışmana bağlandınız.");
				break;
			case 2:
				System.out.println("İnsan kaynaklarına bağlandınız.");
				break;
			case 3:
				System.out.println("Teknik destek ekibine bağlandınız.");
				break;
			case 4:
				System.out.println("Borç ödemesi için credi kartı bilginizi giriniz.");
				makePayment();
				break;
			case 5:
				System.out.println("Müşteri temsilcisine bağlandınız.");
				break;
			default:
				System.out.println("Geçersiz işlem tipi!");
				break;
		}
	}
	
	private static void makePayment() {
		
		System.out.println("Kredi kartı bilginizi giriniz.");
		String creditCardNumber = scanner.nextLine();
		
		if("1000900050008000".equals(creditCardNumber)) {
			System.out.println("Ödemeniz alındı!");
		} else {
			System.out.println("Ödemeniz işlemi başarısız!");
		}
	}
	
	private static void showMenu() {
		
		System.out.println("1- Danışmaya bağlanın.");
		System.out.println("2- İnsan kaynaklarına erişin.");
		System.out.println("3- Teknik destek için ulaşın.");
		System.out.println("4- Borç ödemesi yapın.");
		System.out.println("5- Müşteri temsilcisine bağlanın.");
	}
	
	private static int makeOperationChoice() {
		
		System.out.println("İşlem tipini giriniz");
		String operationChoice = scanner.nextLine();
		
		return Integer.parseInt(operationChoice);
	}

}
