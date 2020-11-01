package com.chapter1.main.basic.concepts.printer;

import com.chapter1.main.basic.concepts.document.Document;

public class Printer {

	// static değişkenler nesne değişkeni DEĞİLDİR!
	// Bu tip değişkenler sınıfa aittirler.
	private static long printedDocumentCount = 0;
	
	// static fonksiyonlar sınıfa aittir. Nesne örneğine bağlı değildir.
	public static void print(Document document) {
		
		System.out.println("File name: " + document.getFullFileName());
		System.out.println("File size: " + document.getFileSize() + " bytes");
		
		// sadece sınıf içinden çağırabiliyoruz.
		printFileContent(document.getFileContent());
		printedDocumentCount = printedDocumentCount + 1;
	}
	
	
	public static long getPrintedDocumentCount() {
		
		return printedDocumentCount;
	}
	
	
	// private fonksiyon sınıf dışından bir yerden çağrılamaz.
	private static void printFileContent(byte[] fileContent) {
		
		String fileContentAsText = new String(fileContent);
		System.out.println("File Content: " + fileContentAsText);
	}
	
}
