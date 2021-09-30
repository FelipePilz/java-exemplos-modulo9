package entities;

public class Product {
	private String name; //null
	private Double price; //null
	private int quantity; //0

	public Product(){	
	}
	
	//Construtor
	public Product(String name, double price, int quantity) {
		//this significado referencia para o próprio objeto, o atributo do objeto.
		this.name 	  = name; //Atributo do objeto recebendo parametro do metodo.
		this.price 	  = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		//Exemplo sobrecarga, mesmo metodo, parametros diferentes!
		this.name 	  = name;
		this.price 	  = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity(){
		return quantity;
		//Sem set quantity para proteger a consistencia do produto
	}
	
	public void setPrice(double price) {
		this.price = price;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "+ String.format("%.2f", totalValueInStock());
	}
}
