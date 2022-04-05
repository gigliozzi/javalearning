package beecrowd;

import java.util.Scanner;

public class Beecrowd1018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int value, notes, rest;

		value = sc.nextInt();
		if (value > 1 && value < 1000000) {
			System.out.println(value);
			notes = value / 100; rest = value % 100;
			System.out.println(notes + " nota(s) de R$ 100,00");
			
			notes = rest / 50; rest = rest % 50;
			System.out.println(notes + " nota(s) de R$ 50,00");
			
			notes = rest / 20; rest = rest % 20;
			System.out.println(notes + " nota(s) de R$ 20,00");

			notes = rest / 10; rest = rest % 10;
			System.out.println(notes + " nota(s) de R$ 10,00");

			notes = rest / 5; rest = rest % 5;
			System.out.println(notes + " nota(s) de R$ 5,00");

			notes = rest / 2; rest = rest % 2;
			System.out.println(notes + " nota(s) de R$ 2,00");

			notes = rest / 1;
			System.out.printf(notes + " nota(s) de R$ 1,00\n");
		} else {
			System.out.println(value + " out of range");
		}
		sc.close();
	}
}
