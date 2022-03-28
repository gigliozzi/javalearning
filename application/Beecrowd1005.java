package application;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1005 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		float N1, N2; 
		Double media;

		N1 = sc.nextFloat();
		N2 = sc.nextFloat();
		
		// not forget submit this solution in online judgment, this version it's correct
		if ((N1 >= 0 && N1 <= 10) && (N2 >= 0 && N2 <= 10)) {
			media = (N1 * 3.5 + N2 * 7.5) / 11;
			System.out.printf("MEDIA = %.5f%n", media);
		} else {
			System.out.println("out of range");
		}

		sc.close();
	}
//	System.out.printf("A=%.4f%n", area);
}
