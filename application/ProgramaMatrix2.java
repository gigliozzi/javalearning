package application;

import java.util.Scanner;

public class ProgramaMatrix2 { 

		public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// asks
		System.out.print("Quantas linhas tem a matriz? ");
		int n = sc.nextInt();
		System.out.println();
		System.out.print("Quantas colunas tem a matriz? ");
		int m = sc.nextInt();
		int[][] mat = new int[n][m]; // instance new matrix
		

		// feed the matrix
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();				
			}
			 
		}
		
		
		System.out.print("Informe um numero da matriz: ");
		int number = sc.nextInt();		
		System.out.println();
		
		// print the number position
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == number) {
					System.out.println("Position " + i + "," + j);
					
					if(i - 1 > 0) {
						System.out.println("up: " + mat[i - 1][j]);
					}
					
					if (j > 0) {
						System.out.println("left: " + mat[i][j - 1]);
					}			
					 
					if (i < mat[i].length) {
						System.out.println("down: " + mat[i + 1][j]);
					}
					
					if (j < mat[i].length -1)
						System.out.println("right: " + mat[i][j + 1]);
					}
				
					
				} 
			}
		
		sc.close();
		}

		
	}

/*
 * 10 8 15 12
 * 21 11 23 8
 * 14 5 13 19
 */


