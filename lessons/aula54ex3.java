package lessons;
import java.util.Locale;
import java.util.Scanner;

public class aula54ex3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double n1, n2, n3;

		for (int i = 0; i < N; i++) {
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			n3 = sc.nextDouble();

			double media = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
			
			System.out.println(media);
			
		}

		sc.close();

	}

}