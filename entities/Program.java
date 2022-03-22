package entities;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		Employee e = new Employee();
		
		System.out.print("Name: ");
		e.name = sc.nextLine();

		System.out.print("Salario Bruto: ");
		e.salarioBruto = sc.nextDouble();
		
		System.out.print("Tax: ");
		e.tax = sc.nextDouble();
		
		System.out.println("Employee: " + e);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		e.increaseSalary(percentage);
		
		System.out.println("Updated data: " +  e);
		
		
		sc.close();

	}

}
