import java.util.Locale;
import java.util.Scanner;

public class aula30Ex6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double a, b, c;
		double areaTriangulo, PI=3.14159;
		double areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		
		Scanner sc = new Scanner(System.in);		
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		areaTriangulo = (a * c) / 2;
		areaCirculo = PI * Math.pow(c, 2);
		areaTrapezio = (a+b)/2 * c;
		areaQuadrado = Math.pow(b, 2);
		areaRetangulo = a*c;
		
//		A=(a+b)/2 x h
		
		System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
		
		
		sc.close();

	}

}
