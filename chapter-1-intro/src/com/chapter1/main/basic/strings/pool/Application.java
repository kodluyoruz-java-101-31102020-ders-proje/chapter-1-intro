package com.chapter1.main.basic.strings.pool;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		// runStringPoolExample();
		runStringOperations();
	}

	private static void runStringOperations() {
		
		String s1 = "Merhaba, Sayın %s %s";
		
		//Scanner scanner = new Scanner(System.in);
		
		// System.out.println("İsminizi giriniz:");
		String name = "Ayşe"; //scanner.nextLine();
		
		// System.out.println("Soyisminizi giriniz:");
		String lastName = "Fatma"; //scanner.nextLine();
		
		String formattedGreetingText = String.format(s1, name, lastName);
		System.out.println(formattedGreetingText);
		
		//scanner.close();
		
		String fullName = name.concat(lastName);
		System.out.println(fullName);
		
		String lowercaseGreetingText = formattedGreetingText.toLowerCase();
		System.out.println(lowercaseGreetingText);
		
		String upppercaseGreetingText = formattedGreetingText.toUpperCase();
		System.out.println(upppercaseGreetingText);
		
		
		boolean hasGreetingWord = formattedGreetingText.contains("Merhaba");
		System.out.println("Has greeting Turkish word in text? " + hasGreetingWord);
		
		hasGreetingWord = contains(formattedGreetingText, "Merhaba");
		System.out.println("Has greeting Turkish word in text? " + hasGreetingWord);
		
		hasGreetingWord = contains(formattedGreetingText, "Sayın");
		System.out.println("Has 'Sayın' Turkish word in text? " + hasGreetingWord);
		
		hasGreetingWord = contains(formattedGreetingText, "Fatma");
		System.out.println("Has 'Fatma' Turkish word in text? " + hasGreetingWord);
		
		hasGreetingWord = contains(formattedGreetingText, "Ali");
		System.out.println("Has 'Ali' Turkish word in text? " + hasGreetingWord);
		
		
		formattedGreetingText = formattedGreetingText.replace("Fatma", "Yurt");
		System.out.println(formattedGreetingText);
		
		// + ile birleştirdiğiniz string ifadeler artarsa performans sorunu yaşarsınız.
		String fullNameConcat = "Sayın" + " " + name + " " + lastName; 
		System.out.println("String with + operator : " + fullNameConcat);
		
		// performans kazancı sağlar.
		StringBuilder builder = new StringBuilder();
		builder.append("Sayın");
		builder.append(" ");
		builder.append(name);
		builder.append(" ");
		builder.append(lastName);
		
		System.out.println("String with StringBuilder : " + builder.toString());
		
		
		String[] words = formattedGreetingText.split(" ");
		for(String word : words) {
			System.out.println(word);
		}
		
	}
	
	// kendi yazdığımız contains fonksiyonu
	private static boolean contains(String source, String searchedText) {
		
		char firstCharacter = searchedText.charAt(0);
		int searchTextLength = searchedText.length();
		
		for(int i=0; i < source.length(); i++) {
			
			char c = source.charAt(i);
			if(c == firstCharacter) {
				int endIndex = (i + searchTextLength);
				String extractedText = source.substring(i, endIndex);
				if(isSameText(searchedText, extractedText)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	private static boolean isSameText(String s1, String s2) {
		
		return s1.equals(s2);
	}
	
	private static void runStringPoolExample() {
		
		// Literal definition
		String s1 = "hello";
		String s2 = "hello";
		String s4 = "HELLO";
		String s5 = "HELLO";
		
		// heap'ten yeni bir alan alacak!
		String s3 = new String("hello");
		String s6 = new String("hello");
		
		if(s1 == s2) {
			
			System.out.println("Same memory address!");
			System.out.println(System.identityHashCode(s1));
			System.out.println(System.identityHashCode(s2));
		}
		
		if(s1 == s3) {
			System.out.println("Memory address is same!");
		} else {
			System.out.println("Memory address is different!");
		}
		
		if(s1.equals(s3)) {
			System.out.println("Values are same!");
		}
		
		
		System.out.println("s1: " + System.identityHashCode(s1));
		System.out.println("s2: " + System.identityHashCode(s2));
		System.out.println("s3: " + System.identityHashCode(s3));
		System.out.println("s4: " + System.identityHashCode(s4));
		System.out.println("s5: " + System.identityHashCode(s5));
		System.out.println("s6: " + System.identityHashCode(s6));
	}
	
}
