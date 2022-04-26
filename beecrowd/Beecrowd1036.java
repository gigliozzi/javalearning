package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1036 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b, c, delta, R1, R2;

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		delta = (b * b) - (4 * a * c);

		if (delta < 0 || a == 0) {
			System.out.println("Impossivel calcular");
		} else {
			R1 = (-b + Math.sqrt(delta)) / (2 * a);
			R2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.printf("R1 = %.5f%n", R1);
			System.out.printf("R2 = %.5f%n", R2);
		}

		sc.close();

	}
}
