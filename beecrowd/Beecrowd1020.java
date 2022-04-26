package beecrowd;

import java.util.Scanner;

public class Beecrowd1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int diasDeExistencia = 0, anos=0, meses=0, dias=0,resto=0;
		
		System.out.println("Dias de existencia: ");
		diasDeExistencia = sc.nextInt();
		

			anos = diasDeExistencia / 365;  // 400 / 365 = 1 year 
			resto = diasDeExistencia % 365;
			meses = resto / 30;
			dias = resto % 30;
		
		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
		
		sc.close();
	}
}
