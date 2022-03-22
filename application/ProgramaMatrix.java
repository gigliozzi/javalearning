package application;

import java.util.Scanner;

public class ProgramaMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantas linhas/colunas tem a matriz?");
		int n = sc.nextInt();
		System.out.println();
		
		int[][] mat = new int[n][n];
		
		// feed the matrix
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat.length;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		//seek on matrix and print the diagonal sum
		int count = 0;		
		for(int i=0;i<mat.length;i++) {
			count += mat[i][i];
		}
		System.out.println("soma diag: " + count);
		
		//seek on matrix and print the main diagonal
		for(int i=0;i<mat.length;i++) {
				System.out.println(mat[i][i]);
		}
		
		int negativeNumbers = 0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if (mat[i][j] < 0) {
					negativeNumbers ++;
				}
			}
		}
		System.out.println("Negativos: " + negativeNumbers);
		 
		/*
		 5 -3 10
		 15 8 2
		 7 9 -4 
		 */
		
		sc.close();

	}

	
}
