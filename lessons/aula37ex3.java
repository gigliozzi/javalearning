package lessons;
import java.util.Scanner;

public class aula37ex3 {

	public static void main(String[] args) {
		int a;
		int b;

		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt();

		if (a % b == 0 || b % a == 0) {
			System.out.println("SAO MULTIPLOS");
		} else {
			System.out.println("NAO SAO MULTIPLOS");
		}
		
		sc.close();
	}

}
