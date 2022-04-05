package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1014 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int distancia = 0;
		double litros = 0.0;

		distancia = sc.nextInt();
		litros = sc.nextDouble();

		double total = distancia / litros;

		System.out.printf("%.3f", total);
		System.out.println(" km/l");

		sc.close();
	}

}
