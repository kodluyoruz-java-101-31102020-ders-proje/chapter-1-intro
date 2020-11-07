package com.chapter1.main.array;

public class Application {

	public static void main(String[] args) {
		
		// intiliaze array!
		int[] initArray = { 5, 6, 7, 9 };
		
		IntArray dizi1 = new IntArray(10);
		int[] data1 = dizi1.fill();
		
		IntArray dizi2 = new IntArray(10);
		int[] data2 = dizi2.fill();
		
		System.out.println("Dizi1");
		dizi1.print();
		
		System.out.println("Dizi2");
		dizi2.print();
		
		int[] sumArray = ArrayOperations.sum(data1, data2);
		
		System.out.println("Toplam");
		ArrayOperations.print(sumArray);
		
		int maxValue = ArrayOperations.max(sumArray);
		System.out.println("Dizinin en büyük elemanı: " + maxValue);
		
		int minValue = ArrayOperations.min(sumArray);
		System.out.println("Dizinin en küçük elemanı: " + minValue);
		
		int[] reversedArray = ArrayOperations.reverse(sumArray);
		
		System.out.println("Tersine çevrilmiş dizi");
		ArrayOperations.print(reversedArray);
		
		
		int[] resizedArray = ArrayOperations.resize(sumArray, 100);
		
		System.out.println("Yeniden boyutlandırılmış dizi");
		ArrayOperations.print(resizedArray);
	}

}
