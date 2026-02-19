package com.vectorPojo;

import java.util.*;

class Product {
	public Product(int productId, String name, int price, int quantity) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	private int productId;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getStockValue() {

		return price * quantity;
	}

	private String name;
	private int price;
	private int quantity;

}

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Vector v = new Vector();

		v.add(new Product(1, "Laptop", 50000, 5));
		v.add(new Product(2, "Mobile", 2000, 4));
		v.add(new Product(3, "TV", 30000, 12));
		v.add(new Product(4, "AC", 25000, 8));

		do {

			System.out.println("1.Display out-of-stock products");
			System.out.println("2.Calculate total stock value");
			System.out.println("3.Display products with stock value > 10,000");

			System.out.print("enter choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				for (Object obj : v) {
					Product p = (Product) obj;
					if (p.getQuantity() == 0) {
						System.out.println(p.getName() + "\t" + p.getQuantity());
					}
				}
				break;
			case 2:
				int totalStockValue = 0;
				for (Object obj : v) {
					Product p = (Product) obj;
					totalStockValue += p.getStockValue();
				}
				  System.out.println("Total Stock Value: " + totalStockValue);
				break;
			case 3:
				for (Object obj : v) {
					Product p = (Product) obj;
					if (p.getStockValue() > 10000) {
						System.out.println(p.getName());
					}
				}
				break;
			default:
				System.out.println("Invalid Choice");
			}
		} while (true);
	}

}
