package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		//Impedir de gerar um produto sem nome, sem preço ou sem quantidade.....
		Product product = new Product(name, price);

		
		//Usando encapsulamento com get e set
		product.setName("Computer");
		System.out.println("Updated name: "+product.getName());
		product.setPrice(1200.00);
		System.out.println("Updated price: "+product.getPrice());
		
		System.out.println("Product data: " + product.toString());

		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.print("Updated data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.print("Updated data: " + product);

		sc.close();
	}

}