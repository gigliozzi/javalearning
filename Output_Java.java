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

		System.out.println("Voc� digitou: " + x);
		System.out.println("Voc� digitou: " + y);
		System.out.println("Voc� digitou: " + z);
		System.out.println("Voc� digitou: " + c);

		sc.close();

	}

}
