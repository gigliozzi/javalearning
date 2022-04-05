package lessons;
import java.util.Scanner;

public class aula30Ex5 {

	public static void main(String[] args) {
		
		int countPiece12;
		int countPiece16;
		double pricePiece12;
		double pricePiece16;
		double toPay;
		
		Scanner sc = new Scanner(System.in);
		
		countPiece12 = sc.nextInt();
		pricePiece12 = sc.nextDouble();
		
		countPiece16 = sc.nextInt();
		pricePiece16 = sc.nextDouble();
		
		toPay = countPiece12 * pricePiece12 + countPiece16 * pricePiece16;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", toPay);
		
		
		sc.close();

	}

}
