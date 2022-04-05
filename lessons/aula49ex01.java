package lessons;
import java.util.Scanner;

public class aula49ex01 {

	public static void main(String[] args) {

		int senha = 2002;
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.nextInt() != senha) {
			System.out.println("Senha invalida");
		}
			
		System.out.println("Granted Access");
		
		sc.close();
	}

}
