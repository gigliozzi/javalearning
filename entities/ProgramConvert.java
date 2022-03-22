package entities;

import java.util.Locale;
import java.util.Scanner;

public class ProgramConvert {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("qual a cotação do dolar: ");
		double cotacao = sc.nextDouble();

		System.out.println("quantos dolares: ");
		double quant = sc.nextDouble();

		double result = CurrencyConverter.Conversion(cotacao, quant);

		System.out.printf("A pagar: R$ %.2f ", result);

		sc.close();

	}

}
