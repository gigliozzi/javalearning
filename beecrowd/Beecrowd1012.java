package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1012 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Double A = 0.0, B = 0.0, C = 0.0;
		Double PI = 3.14159;

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		Double areaTriangulo = A * C / 2;
		Double areaCirculo = PI * Math.pow(C, 2);
		Double areaTrapezio = ((A + B) * C) / 2;
		Double areaQuadrado = B * B;
		Double areaRetangulo = A * B;

		System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

		sc.close();
	}

}
