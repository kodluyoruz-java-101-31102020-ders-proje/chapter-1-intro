package com.chapter1.main.array;

public class ArrayOperations {

	public static int max(int[] array) {
		
		int maxValue = Integer.MIN_VALUE;
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] > maxValue) {
				maxValue = array[i];
			}
		}
		return maxValue;
	}
	
	public static int min(int[] array) {
		
		int minValue = Integer.MAX_VALUE;
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] < minValue) {
				minValue = array[i];
			}
		}
		return minValue;
	}
	
	public static int[] reverse(int[] array) {
		
		int[] reversedArray = new int[array.length];
		int counter = 0;
		
		for(int i = (array.length - 1); i >=0; i--) {
			
			reversedArray[counter] = array[i];
			counter++;
		}
		return reversedArray;
	}
	
	public static int[] sum(int[] array1, int[] array2) {
		
		if(array1.length != array2.length) {
			return null;
		}
		
		int[] sumArray = new int[array1.length];
		for(int i = 0; i < array1.length; i++) {
			
			int summation = array1[i] + array2[i];
			sumArray[i] = summation;
		}
		return sumArray;
	}
	
	public static void print(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static int[] resize(int[] array, int newSize) {
		
		int[] newArray = new int[newSize];
		
		for(int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		
		return newArray;
	}
}
