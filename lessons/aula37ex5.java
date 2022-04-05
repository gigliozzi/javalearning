package lessons;
import java.util.Locale;
import java.util.Scanner;

public class aula37ex5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();
		int quant = sc.nextInt();
		double toPay = 0;

		if (codigo == 1) {
			toPay = quant * 4.0;
			System.out.printf("Total: R$ %.2f%n", toPay);
		} else if (codigo == 2) {
			toPay = quant * 4.5;
			System.out.printf("Total: R$ %.2f%n", toPay);
		} else if (codigo == 3) {
			toPay = quant * 5.0;
			System.out.printf("Total: R$ %.2f%n", toPay);
		} else if (codigo == 4) {
			toPay = quant * 2.0;
			System.out.printf("Total: R$ %.2f%n", toPay);
		} else if (codigo == 5) {
			toPay = quant * 1.5;
			System.out.printf("Total: R$ %.2f%n", toPay);
		} else
			System.out.println("Apenas valores de 1 a 5");

		sc.close();

	}

}
