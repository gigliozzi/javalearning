package beecrowd;

import java.util.Scanner;

public class Beecrowd1019a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o valor de segundos: ");
		int timeInSeconds = sc.nextInt();

		int hours = 0, minutes = 0, seconds = 0;

		if (timeInSeconds / 3600 > 1) {
			hours = timeInSeconds / 3600;
			minutes = timeInSeconds % 3600;
		}

		System.out.println(hours + ":" + minutes + ":" + seconds);

		sc.close();
	}
}
