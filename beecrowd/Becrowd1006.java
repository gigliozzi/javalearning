package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Becrowd1006 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Double A, B, C, media;
		media = 0.0;

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		if (A <= 10 && B <= 10 && C <= 10) {
			media = (A * 2 + B * 3 + C * 5) / 10;
		}

		System.out.println("MEDIA = " + media);

		sc.close();
	}
//	System.out.printf("MEDIA = %.1f%n", media);
}
