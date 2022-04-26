package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1038 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int code, quantity;
		double price, total;

		code = sc.nextInt();
		quantity = sc.nextInt();

		switch (code) {
		case 1:
			price = 4.00;
			total = price * quantity;
			System.out.printf("Total: R$ %.2f%n", total);
			break;

		case 2:
			price = 4.50;
			total = price * quantity;
			System.out.printf("Total: R$ %.2f%n", total);
			break;

		case 3:
			price = 5.00;
			total = price * quantity;
			System.out.printf("Total: R$ %.2f%n", total);
			break;

		case 4:
			price = 2.00;
			total = price * quantity;
			System.out.printf("Total: R$ %.2f%n", total);
			break;

		case 5:
			price = 1.50;
			total = price * quantity;
			System.out.printf("Total: R$ %.2f%n", total);
			break;

		default:
			break;
		}

		sc.close();

	}
}
