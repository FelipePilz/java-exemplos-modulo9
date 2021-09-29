package entities;

public class Product {
	public String name;
	public Double price;
	public int quantity;

	
	
	//Construtor
	public Product(String name, double price, int quantity) {
		//this significado referencia para o próprio objeto, o atributo do objeto.
		this.name 	  = name; //Atributo do objeto recebendo parametro do metodo.
		this.price 	  = price;
		this.quantity = quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "+ String.format("%.2f", totalValueInStock());
	}
}
