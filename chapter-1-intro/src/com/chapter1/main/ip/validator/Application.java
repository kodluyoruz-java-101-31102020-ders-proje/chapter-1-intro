package com.chapter1.main.ip.validator;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("IP adresini giriniz:");
		String ip = scanner.nextLine();
		
		String message = Ip4Validator.validate(ip);
		System.out.println(message);
		
		scanner.close();
	}

}
