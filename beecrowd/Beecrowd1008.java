package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int number;
		int horasTrabalhadas;
		double homemHora;
		double salary;

		number = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		homemHora = sc.nextDouble();

		salary = horasTrabalhadas * homemHora;

		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f%n", salary);

		sc.close();
	}
//	System.out.printf("A=%.4f%n", area);
}
