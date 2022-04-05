package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.Worker;

public class ProgramWorker {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.nextLine();
		System.out.print("Base Salary: ");
		Double baseSalary = sc.nextDouble();
		
		System.out.println("How many contracts to this worker?");
		

		sc.close();
	}

}
