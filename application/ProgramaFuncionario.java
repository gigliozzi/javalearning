package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class ProgramaFuncionario {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionario> list = new ArrayList<>();

		 // Employee #1: Id: 333 Name: Maria Brown Salary: 4000.00
		 // Employee #2: Id: 536 Name: Alex Grey Salary: 3000.00
		 // Employee #3: Id: 772 Name: Bob Green Salary: 5000.00

		System.out.print("How many employees will be registered?");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Employee #" + i);
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();
			list.add(new Funcionario(id, name, salario));
		}
		
		System.out.print("Enter the employee id that will have salary increase:");
		int id = sc.nextInt();		
		
		Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			 

		// Integer position = lookPosition(list, idEmployee);
		
		// if (position == null) {
		if (func == null) {
			System.out.println("This EmployeeID doesn't exist.");
		} else {
		System.out.println("Enter the percentage:");
		Double percentage = sc.nextDouble();
		func.increaseSalary(percentage);
		//list.get(position).increaseSalary(percentage); 
		}

		for (Funcionario f : list) {
			System.out.println("List of employees:");
			System.out.println(f);
		} 

		sc.close();
	}

	public static Integer lookPosition(List<Funcionario> list, int idEmployee) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == idEmployee) {
				return i;
			}
		}
		return null;
	}

}
