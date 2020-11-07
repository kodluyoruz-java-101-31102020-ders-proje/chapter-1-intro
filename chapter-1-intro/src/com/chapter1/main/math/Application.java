package com.chapter1.main.math;

public class Application {

	private static void runMathAbs() {
		
		// mutlak değer alma fonksiyonu ===> abs
		Integer a = -8;
		double d = -100;
		float f = -90;
		System.out.println(Math.abs(a));
		System.out.println(Math.abs(d));
		System.out.println(Math.abs(f));
	}
	
	public static void runCeilFloorMethods() {
		
		// ceil metodu ile yukarı yuvarlama, floor ile ise aşağı yönlü yuvarlama yapılır.
		double d = 100.675;
		float f = 90.15f;
		System.out.println(Math.ceil(d));
		System.out.println(Math.ceil(f));
		System.out.println(Math.floor(d));
		System.out.println(Math.floor(f));
	}
	
	private static void runRintSample() {
		
		// rint metodu ile ondalıklı kısım 0.5'den büyükse yukarı doğru
		// eğer 0.5'e eşit ve küçük ise aşağı doğru yuvarlama yapar. rint
		//  fonksiyonu sonuç olarak sadece int tipinde değer verir.
		double d = 100.675;
		double e = 100.500;
		double f = 100.200;
		System.out.println(Math.rint(d));
		System.out.println(Math.rint(e));
		System.out.println(Math.rint(f));
	}
	
	public static void runRoundSample() {
		
		// round fonksiyonu long veya int döndürür.
		double d = 100.675;
		double e = 100.500;
		float f = 100;
		float g = 90f;
		System.out.println(Math.round(d));
		System.out.println(Math.round(e));
		System.out.println(Math.round(f));
		System.out.println(Math.round(g));
	}
	
	public static void main(String[] args) {
		
		//runMathAbs();
		//runCeilFloorMethods();
		//runRintSample();
		//runRoundSample();
		
		// max verilen iki değerden en büyüğünü döndürür.
		// min verilen iki değerden en küçüğünü döndürür.
		System.out.println(Math.min(12.123, 12.456));
		System.out.println(Math.max(12.123, 12.456));
		
		// e tabanında log alma fonksiyonudur.
		double x = 2.76;
		System.out.printf("log(%.3f) is %.3f%n \n", x, Math.log(x));
		
		// üs alma fonksiyonudur. 2 üzeri 3 gibi.
		double x1 = 2;
		double y2 = 3;
		System.out.printf("pow(%f, %f) is %f \n", x1, y2, Math.pow(x1, y2));
		
		// karekök alma fonksiyonudur.
		double x11 = 6;
		System.out.printf("sqrt(%.3f) is %.3f%n \n", x11, Math.sqrt(x11));
		
		// 0-1 arasında rastgele sayı üretme fonksiyonudur.
		System.out.println(Math.random());
	}

}
