package lessons;
import java.util.Scanner;

public class aula37ex2 {

	public static void main(String[] args) {
		int number;
		
		Scanner sc = new Scanner(System.in);

		number = sc.nextInt();
		
		if (number < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("POSITIVO");
		}

		sc.close();
	}

}
