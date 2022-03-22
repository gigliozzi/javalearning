import java.util.Locale;
import java.util.Scanner;

public class aula30Ex2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		double PI = 3.14159;
		double area;
		double raio;

		Scanner sc = new Scanner(System.in);
		raio = sc.nextDouble();
		area = Math.pow(raio, 2) * PI;
		
		System.out.printf("%.4f%n", area);

		sc.close();
	}

}
