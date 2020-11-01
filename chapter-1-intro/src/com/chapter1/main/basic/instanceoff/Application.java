package com.chapter1.main.basic.instanceoff;

import com.chapter1.main.basic.concepts.document.Document;

public class Application {

	public static void main(String[] args) {
		
		Object name = "Ali Veli";
		Object doc = new Document();
		
		boolean isDocument = doc instanceof Document;
		System.out.println("Is Document instance ? : " + isDocument);
		
		
		isDocument = name instanceof Document;
		System.out.println("Is Document instance ? : " + isDocument);
		
		
		printText(name);
	}
	
	public static void printText(Object obj) {
		
		if(obj instanceof String) {
			System.out.println(obj);
			return;
		}
		
		if(obj instanceof Document) {
			
			// Veri tipini kontrol etmezsem hata alırım! (CastException)
			Document docObj = (Document) obj;
			System.out.println(docObj.getFullFileName());
			// ... geriye kalan kodlar devam ediyor olsun
			return;
		}
	}

}
