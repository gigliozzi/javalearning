package beecrowd;

import java.util.Scanner;

public class Beecrowd1019a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o valor de segundos: ");
		int timeInSeconds = sc.nextInt();

		int hours = 0, minutes = 0, seconds = 0, resto =0;

		if (timeInSeconds >= 3600) {
			hours = timeInSeconds / 3600;
			resto = timeInSeconds % 3600;
			minutes = resto / 60;
			seconds = timeInSeconds % 60;
		} else {
			hours = 0;
			minutes = timeInSeconds / 60;
			seconds = timeInSeconds % 60;
		}

		System.out.println(hours + ":" + minutes + ":" + seconds);

		sc.close();
	}
	
	// System.out.println(String.format("%02d", hours) + ":" + String.format("%02d", minutes) + ":" + String.format("%02d", seconds));
}
