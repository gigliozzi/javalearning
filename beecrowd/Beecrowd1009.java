package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1009 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		String nome;
		double salario;
		double vendas, total;

		nome = sc.nextLine();
		salario = sc.nextDouble();
		vendas = sc.nextDouble();		
		total = salario + (vendas * 0.15);
		
		System.out.printf("NOME = %s%n" , nome);
		System.out.printf("TOTAL = R$ %.2f%n", total);

		sc.close();
	}
//	System.out.printf("A=%.4f%n", area);
}
