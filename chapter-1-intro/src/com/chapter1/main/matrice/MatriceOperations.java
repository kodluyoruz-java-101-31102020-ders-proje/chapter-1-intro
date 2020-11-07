package com.chapter1.main.matrice;

import java.text.DecimalFormat;

public class MatriceOperations {

	private static DecimalFormat df = new DecimalFormat("#.##");
	
	public static void print(double[][] matrice) {
	
		int rowSize = matrice.length;
		int columnSize = matrice[0].length;
		
		for(int i=0; i < rowSize; i++) {
			for(int j=0; j < columnSize; j++) {
				System.out.print(matrice[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static double[][] sum(double[][] matrice1, double[][] matrice2) {
		
		int rowSize = matrice1.length;
		int columnSize = matrice1[0].length;
		
		double[][] summationMatrice = new double[rowSize][columnSize];
		for(int i=0; i < rowSize; i++) {
			for(int j=0; j < columnSize; j++) {
			
				double summation = matrice1[i][j] + matrice2[i][j];
				summationMatrice[i][j] = Double.valueOf(df.format(summation));
			}
		}
		return summationMatrice;
	}
}
