package com.chapter1.main.matrice;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		// initiliaze matrice
		// 4X4'lük bir matris!
		
		double[][] matriceInit = {
				new double[] { 5, 6, 7, 7 },
				new double[] { 1, 9, 8, 0 },
				new double[] { 4, 1, 1, 2 },
				new double[] { 2, 2, 4, 2 }
		};
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Row size?");
		int rowSize = scanner.nextInt();
		
		System.out.println("Column size?");
		int columnSize = scanner.nextInt();
		
		
		Matrice matris1 = new Matrice(rowSize, columnSize);
		double[][] data1 = matris1.fill();
		
		Matrice matris2 = new Matrice(rowSize, columnSize);
		double[][] data2 = matris2.fill();
		
		System.out.println("Matris1");
		MatriceOperations.print(data1);
		
		System.out.println("Matris2");
		MatriceOperations.print(data2);
		
		double[][] sumMatrice = MatriceOperations.sum(data1, data2);
		
		System.out.println("Toplam");
		MatriceOperations.print(sumMatrice);
		
		scanner.close();
	}

}
