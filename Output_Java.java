import java.util.Scanner;

public class Output_Java {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String x;
		int y;
		double z;
		char c;

		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		c = sc.next().charAt(0);

		System.out.println("Você digitou: " + x);
		System.out.println("Você digitou: " + y);
		System.out.println("Você digitou: " + z);
		System.out.println("Você digitou: " + c);

		sc.close();

	}

}
