package lessons;
import java.util.Locale;
import java.util.Scanner;

public class aula54ex4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			double num1 = sc.nextInt();
			double num2 = sc.nextInt();
			if (num2 == 0) {
				System.out.println("divisao impossivel");
			} else
				System.out.println(num1 / num2);
		}

		sc.close();

	}

}