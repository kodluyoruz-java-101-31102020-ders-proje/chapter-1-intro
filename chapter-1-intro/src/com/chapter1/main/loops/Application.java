package com.chapter1.main.loops;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//runBasicForLoop();
		
		String tercih = "";
		do {
			
			runDivisionLoop(scanner);
			
			System.out.println("İşleme devam etmek istiyor musunuz?");
			tercih = scanner.next();
		
		} while("E".equalsIgnoreCase(tercih));
		
		scanner.close();
	}
	
	private static void runDivisionLoop(Scanner scanner) {
		
		System.out.println("Bölünecek sayıyı giriniz");
		int sayi = scanner.nextInt();
		
		System.out.println("Bölen sayıyı giriniz");
		int bolen = scanner.nextInt();
		
		int bolum = 0;
		
		while( sayi >= bolen ) {
			
			sayi = sayi - bolen;
			bolum++;
		}
		
		System.out.println("Kalan: " + sayi);
		System.out.println("Bölüm: " + bolum);
	}
	
	private static void runBasicForLoop() {
		
		int toplam = 0;
		
		for(int i = 0; i < 100; i++) {
			
			toplam = toplam + i;
		}
		
		System.out.println("Toplam: " + toplam);
	}

}
