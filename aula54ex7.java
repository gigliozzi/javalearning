import java.util.Locale;
import java.util.Scanner;

public class aula54ex7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.print(i + " ");
			System.out.printf("%.0f ", Math.pow(i, 2) , " ");
			System.out.printf("%.0f%n", Math.pow(i, 3) , " ");
		}

		sc.close();

	}

}