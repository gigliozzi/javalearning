package lessons;
import java.util.Locale;
import java.util.Scanner;

public class aula37ex7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();
		String message = "";

		if (x == 0 && y == 0) {
			message = "Origem";
		} else if (x == 0) {
			message = "Eixo Y";
		} else if (y == 0) {
			message = "Eixo X";
		} else if (x > 0 && y > 0) {
			message = "Q1";
		} else if (x < 0 && y > 0) {
			message = "Q2";
		} else if (x < 0 && y < 0) {
			message = "Q3";
		} else if (x > 0 && y < 0) {
			message = "Q4";
		}

		System.out.println(message);

		sc.close();

	}

}
