package application;

import java.util.Locale;
import java.util.Scanner;

public class Testes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int A, B, PROD;

		A = sc.nextInt();
		B = sc.nextInt();
		PROD = A * B;

		System.out.println("PROD = " + PROD);

		sc.close();
	}
//	System.out.printf("A=%.4f%n", area);
}
