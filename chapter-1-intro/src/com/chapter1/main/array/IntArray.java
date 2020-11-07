package com.chapter1.main.array;

public class IntArray {

	private int size;
	private int[] data;
	
	public IntArray(int newSize) {
		this.size = newSize;
		this.data = new int[this.size];
	}
	
	public int[] fill() {
		
		for(int i = 0; i < this.size; i++) {
			this.data[i] = genereateRandomNumber();
		}
		return this.data;
	}
	
	public void print() {
		
		for(int i = 0; i < this.size; i++) {
			System.out.print(this.data[i] + " ");
		}
		System.out.println();
	}
	
	public int[] getData() {
		return this.data;
	}
	
	private int genereateRandomNumber() {
		
		return (int)(Math.random() * 100);
	}
	
}
