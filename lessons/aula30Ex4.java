package lessons;
import java.util.Locale;
import java.util.Scanner;

public class aula30Ex4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int number;
		double hour;
		double valuePerHour;
		double salary;

		number = sc.nextInt();
		valuePerHour = sc.nextDouble();
		hour = sc.nextDouble();

		sc.close();

		salary = hour * valuePerHour;

		System.out.printf("O funcionario No.%d tem a receber: U$ %.2f%n", number, salary);

	}

}
