import java.util.Scanner;

public class aula30Ex3 {

	public static void main(String[] args) {

		int A, B, C, D, diference;
		
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		diference = (A * B - C * D);
		
		System.out.println(diference);
		
		sc.close();

	}

}
