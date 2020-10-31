package com.chapter1.main.basic.concepts;

import com.chapter1.main.basic.concepts.document.Document;
import com.chapter1.main.basic.concepts.printer.Printer;

public class Application {

	public static void main(String[] args) {
		
		// Word dokümanı içeriğini byte dizisine çeviriyoruz.
		byte[] wordFileContent = "Hello word document!".getBytes();
		
		// 'new' anahtar kelimesi ile Document sınıfından bir nesne oluşturduk.
		Document wordDocument = new Document("batuhan_duzgun_cv", "docx", wordFileContent);
		
		// Printer sınıfındaki 'print' fonksiyonu static tipindedir. 
		// Dolayısıyla Printer sınıfından bir nesne oluşturmadan direkt sınıf üzerinden 'print' fonksiyonunu çağırabiliriz.
		Printer.print(wordDocument);
		
		
		// PDF dokümanı içeriğini byte dizisine çeviriyoruz.
		byte[] pdfFileContent = "Hello PDF document!".getBytes();
		Document pdfDocument = new Document("batuhan_duzgun_cv", "pdf", pdfFileContent);
		
		// Printer sınıfındaki 'print' fonksiyonu static tipindedir. 
		// Dolayısıyla Printer sınıfından bir nesne oluşturmadan direkt sınıf üzerinden 'print' fonksiyonunu çağırabiliriz.
		Printer.print(pdfDocument);
	}

}
