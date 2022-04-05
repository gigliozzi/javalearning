package beecrowd;

import java.util.Scanner;

public class Beecrowd1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int quociente = 0;
		int[] notas = { 100, 50, 20, 10, 5, 2, 1 };
		int value = sc.nextInt();

		if (value > 1 && value < 1000000) {
			System.out.println(value);
			for (int nota : notas) {
				quociente = value / nota;
				System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
				value = value % nota;
			}

		}
		sc.close();
	}
}
