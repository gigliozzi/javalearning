package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextDouble();
		}

		double sum = 0;

		for (int i = 0; i < vect.length; i++) {
			sum += vect[i];
		}
		
		double avg = sum / vect.length;
		
		System.out.println(avg);
		
		sc.close();

	}

}
