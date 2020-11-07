package com.chapter1.main.data.type;

public class Application {

	public static void main(String[] args) {
		
		//runPrimitiveDataTypeConversion();
		//runCompareValues();
		//runEqualsSample();
		//runEqualsSample();
		runStringToPrimitiveTypes();
	}
	
	private static void runStringToPrimitiveTypes() {
		
		// String değerlerden sayılara dönüşüm metodu ===> valueOf
		long number1 = Long.valueOf("100");
		int number2 = Integer.valueOf("5");
		short number3 = Short.valueOf("1");
		byte number4 = Byte.valueOf("2");
		
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(number4);
		
		
		// String değerlerden sayılara dönüşüm metodu ===> parseX
		long number11 = Long.parseLong("100");
		int number22 = Integer.parseInt("5");
		short number33 = Short.parseShort("1");
		byte number44 = Byte.parseByte("2");
		
		System.out.println(number11);
		System.out.println(number22);
		System.out.println(number33);
		System.out.println(number44);
	}

	private static void runCompareValues() {
		
		// Kıyaslama metodu ===> compareTo
		Long personelId = new Long(100);
		
		System.out.println(personelId.compareTo(50L));
		System.out.println(personelId.compareTo(100L));
		System.out.println(personelId.compareTo(150L));
	}
	
	private static void runEqualsSample() {
		
		Long personelId = new Long(100);
		System.out.println(personelId.equals(50L));
		System.out.println(personelId.equals(100L));
		
		String name1 = "Batuhan";
		String name2 = "Batuhan";
		
		String name3 = new String("Batuhan");
		
		if(name1 == name2) {
			System.out.println("Same memory section!");
		}
		
		if(name2 != name3) {
			System.out.println("Different memory section!");
		}
		
		if(name3.equals(name2)) {
			System.out.println("Same values!");
		}
	}
	
	private static void runPrimitiveDataTypeConversion() {
		
		Long personelId = new Long(100);
		Integer bookId = new Integer(200);
		
		int personalAsId = personelId.intValue();
		byte personalAsByte = personelId.byteValue();
		short personalAsShort = personelId.shortValue();
		double personalAsDouble = personelId.doubleValue();
		double personalAsFloat = personelId.floatValue();
		String personalAsText = personelId.toString();
		
		System.out.println(personalAsId);
		System.out.println(personalAsByte);
		System.out.println(personalAsShort);
		System.out.println(personalAsDouble);
		System.out.println(personalAsFloat);
		System.out.println(personalAsText);
		
		bookId.byteValue();
		bookId.doubleValue();
		bookId.intValue();
		bookId.floatValue();
		bookId.shortValue();
		bookId.toString();
	}
	
}
