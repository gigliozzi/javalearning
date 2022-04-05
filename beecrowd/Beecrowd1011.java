package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1011 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int R;
		double volum;
		double PI = 3.14159;
		R = sc.nextInt();
		volum = (4 / 3.0) * PI * Math.pow(R, 3);

		System.out.printf("VOLUME = %.3f%n", volum);

		sc.close();
	}

}
