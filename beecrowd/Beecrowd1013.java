package beecrowd;

import java.util.Scanner;

public class Beecrowd1013 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * This is my skeleton Used for exercises Contains Scanner and Locale
		 */

		int A = 0, B = 0, C = 0;

		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();

		// double MaiorAB = (A + B + Math.abs(A - B)) / 2;

		int maior = (A + B + Math.abs(A - B)) / 2;
		maior = (maior + C + Math.abs(maior - C)) / 2;

		System.out.println(maior + " eh o maior");

		sc.close();
	}

}
