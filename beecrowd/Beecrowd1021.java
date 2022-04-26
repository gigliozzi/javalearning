package beecrowd;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1021 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.###");

		float value; 
		double resto = 0.0;
		int notas = 0, moeda = 0;

		value = (float) sc.nextDouble();

		if (0 <= value && value <= 1000000) {

			notas = (int) value / 100; resto = value % 100;
			resto = Double.valueOf(df.format(resto)).doubleValue();

			System.out.println("NOTAS:");
			System.out.println(notas + " nota(s) de R$ " + String.format("%.2f", 100.0));

			notas = (int) resto / 50; resto = resto % 50;
			resto = Double.valueOf(df.format(resto)).doubleValue();
			System.out.println(notas + " nota(s) de R$ " + String.format("%.2f", 50.0));

			notas = (int) resto / 20; resto = resto % 20;
			resto = Double.valueOf(df.format(resto)).doubleValue();
			System.out.println(notas + " nota(s) de R$ " + String.format("%.2f", 20.0));

			notas = (int) resto / 10; resto = resto % 10;
			resto = Double.valueOf(df.format(resto)).doubleValue();
			System.out.println(notas + " nota(s) de R$ " + String.format("%.2f", 10.0));

			notas = (int) resto / 5; resto = resto % 5;
			resto = Double.valueOf(df.format(resto)).doubleValue();
			System.out.println(notas + " nota(s) de R$ "+ String.format("%.2f", 5.0));

			notas = (int) resto / 2; resto = resto % 2;
			resto = Double.valueOf(df.format(resto)).doubleValue();
			System.out.println(notas + " nota(s) de R$ " + String.format("%.2f", 2.0));

			System.out.println("MOEDAS:");
			moeda = (int) resto / 1; resto = resto % 1;
			resto = Double.valueOf(df.format(resto)).doubleValue();
			System.out.println(moeda + " moeda(s) de R$ " + String.format("%.2f", 1.0));

			moeda = (int) (resto / 0.5); resto = resto % .5;
			resto = Double.valueOf(df.format(resto)).doubleValue();
			System.out.println(moeda + " moeda(s) de R$ " + String.format("%.2f", 0.50));

			moeda = (int) (resto / 0.25); resto = resto % .25;
			resto = Double.valueOf(df.format(resto)).doubleValue();
			System.out.println(moeda + " moeda(s) de R$ " + String.format("%.2f", 0.25));

			moeda = (int) (resto / 0.10); resto = resto % .10;
			resto = Double.valueOf(df.format(resto)).doubleValue();
			System.out.println(moeda + " moeda(s) de R$ " + String.format("%.2f", 0.10));

			moeda = (int) (resto / 0.05); resto = resto % .05;
			resto = Double.valueOf(df.format(resto)).doubleValue();
			System.out.println(moeda + " moeda(s) de R$ " + String.format("%.2f", 0.05));

			moeda = (int) (resto / 0.01);
			System.out.println(moeda + " moeda(s) de R$ " + String.format("%.2f", 0.01));

		}

		sc.close();
	}

}
