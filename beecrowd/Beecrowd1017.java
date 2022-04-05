package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
	
		int horas = sc.nextInt();
		int velocidade = sc.nextInt();
		double litrosGastos = 0.0;
		
		litrosGastos = horas * velocidade / 12.0;
		
		System.out.printf("%.3f%n",litrosGastos);

		sc.close();
	}

}
