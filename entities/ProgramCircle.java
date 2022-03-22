package entities;

import java.util.Locale;
import java.util.Scanner;

public class ProgramCircle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		
		double raio = sc.nextDouble();		
		double area = Circle.areaCircle(raio);
		double volume = Circle.volumeCircle(raio);
		
		System.out.printf("Circunference: %.2f%n" , area);
		System.out.printf("Volume: %.2f%n " , volume);
		System.out.println("PI:" + Circle.PI);
		
		
		
		sc.close();
		

	}

}
