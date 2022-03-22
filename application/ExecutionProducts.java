package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ExecutionProducts {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner read = new Scanner(System.in);
		Product prod = new Product(); 

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		prod.name = read.next();
		System.out.print("Price: ");
		prod.price = read.nextDouble();
		System.out.print("Quantity in sctock: ");
		prod.quantity = read.nextInt();

		System.out.printf("Product data: %s, $ %.2f, %d units , total: $ %.2f%n%n", prod.name, prod.price, prod.quantity, prod.totalValueInStock());

		System.out.println("Vamos atualizar o estoque.");
		System.out.println("Quantos produtos vai adicionar ao estoque?");
		prod.addProducts(read.nextInt());

		System.out.printf("Update data: %s, $ %.2f, %d units, total: $ %.2f%n", prod.name, prod.price, prod.quantity, prod.totalValueInStock());
		
		System.out.println("Quantos produtos vai adicionar ao estoque?");
		prod.removeProducts(read.nextInt());
		
		System.out.printf("Update data: %s, $ %.2f, %d units, total: $ %.2f", prod.name, prod.price, prod.quantity, prod.totalValueInStock());
		
		read.close();
	}

}
