package com.chapter1.main.variables;

import com.chapter1.main.basic.concepts.document.Document;

public class Application {

	private static Document emptyDocument = new Document();
	
	public static void main(String[] args) {
		
		runPrimitiveVariables();
		
		runClassBasedVariables();
		
		// Integer number1 = null; null olursa primitive'e (int) çevirmede hata alırsınız!
		Integer number1 = 0;
		
		show(number1);
		
		getDocument(2);
	}
	
	private static void runPrimitiveVariables() {
		
		// Stack hafıza bölgesinde oluşturulurlar
		
		int a, b, c; // 3 tane değişken virgüller ile ayrılarak tek satırda tanımlanabilir.
		int x = 10, y = 10; // Birden fazla değişken aynı satırda ilk değerleri atanarak tanımlanabilir.
		long ll = 100l;
		short ss = 10;
		byte b1 = 22; 
		
		double pi = 3.14159; 
		float ff = 13.222f;
		
		char character = 'a'; 

		System.out.println(x);
		System.out.println(y);
		System.out.println(ll);
		System.out.println(ss);
		
		System.out.println(b1);
		System.out.println(ff);
		System.out.println(pi);
		System.out.println(character);
	}
	
	private static void runClassBasedVariables() {
		
		// Heap hafıza bölgesinde oluşturulurlar
		
		String brand = "Mercedes";
		
		Long classLong = new Long(10);
		Integer classInt = new Integer(40);
		Short classShort = new Short((short)90);
		Byte classByte = new Byte((byte)11);
		
		Double classDouble = new Double(10.222);
		Float classFloat = new Float(14.998f);
		Character classChar = new Character('a');
		
		System.out.println(brand);
		System.out.println(classLong);
		System.out.println(classInt);
		System.out.println(classShort);
		System.out.println(classByte);
		
		System.out.println(classDouble);
		System.out.println(classFloat);
		System.out.println(classChar);
		
	}
	
	private static void show(int number) {
		
		System.out.println(number);
	}
	
	private static Document getDocument(int ratio) {
		
		if(ratio < 5) {
			// Hafızadan kazanç sağlar.
			return emptyDocument;
			
			// Bu şekilde kullanırsanız hafızayı kötü kullanırsınız!
			// return new Document();
		}
		
		return new Document("pdf_file", "pdf", "C".getBytes());
	}

}
