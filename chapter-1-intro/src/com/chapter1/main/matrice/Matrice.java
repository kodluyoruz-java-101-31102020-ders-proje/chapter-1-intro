package com.chapter1.main.matrice;

import java.text.DecimalFormat;

public class Matrice {

	private int rowSize;
	private int columnSize;
	private double[][] data;
	private DecimalFormat df;      
	
	
	public Matrice(int rowSize, int columnSize) {
		
		this.rowSize = rowSize;
		this.columnSize = columnSize;
		this.data = new double[this.rowSize][this.columnSize];
		df = new DecimalFormat("#.##");
	}
	
	public double[][] fill() {
		
		double[][] matrice = new double[rowSize][columnSize];
		
		for(int i=0; i < rowSize; i++) {
			for(int j=0; j < columnSize; j++) {
				
				double randomNumber = Math.random() * 100;
				matrice[i][j] = Double.valueOf(df.format(randomNumber));
			}
		}
		return matrice;
	}
	
	public double[][] getData() {
		
		return this.data;
	}
	
}
