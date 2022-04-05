package lessons;
import java.util.Locale;
import java.util.Scanner;

public class aula37ex6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double range = sc.nextDouble();
		String message = "";

		if (range >= 0.0 && range <= 25) {
			message = "Intervalo (0-25)";
		} else if (range >= 25 && range <= 50) {
			message = "Intervalo (25-50)";message = "Fora do intervalo";
		} else if (range >= 50 && range <= 75) {
			message = "Intervalo (50-75)";
		} else if (range >= 75 && range <= 100) {
			message = "Intervalo (75-100)";
		} else
			message = "Fora do intervalo";

		System.out.println(message);

		sc.close();

	}

}
