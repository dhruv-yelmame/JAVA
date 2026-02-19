/*Q17. Create a Product class with constructor arguments:
productId, name, price, quantity

Menu functions:
1. Add product
2. Update stock quantity
3. Sort products according to price (high → low)
4. Show “Low Stock Products” (quantity < 5)
5. Generate bill when a customer buys items
6. Exit

Sorting must be done manually using loops (Bubble/Selection sort).
Billing must reduce quantity and calculate total amount.
Use logical operators to check:
 if(quantity > 0 && buyQty <= quantity)
Prevent negative stock using logical condition.
*/

import java.util.*;
class Product
{
	Scanner sc = new Scanner(System.in);
	private int productId;
	private String name;
	private int price;
	private int quantity;
	Product(int productId,String name,int price,int quantity)
	{
		this.productId=productId;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	
	int getPId()
	{
		return productId;
	}
	
	int getPrice()
	{
		return price;
	}
	
	int getQuantity()
	{
		return quantity;
	}
	
	void AddQuantity(int qty)
	{
		quantity += qty;
	}
	
	boolean SellQuantity(int BuyQty)
	{
		if(quantity > 0 && BuyQty <= quantity)
		{
			 quantity -= BuyQty;
			return true;
		}
		return false;
	}
	
	
	void display()
	{
		System.out.println(productId+"\t"+name+"\t"+price+"\t"+quantity);
	}
	
}

public class Q17
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Product p[] = new Product[5];
		int count=0;
		char ch;
		
		do
		{
			System.out.println("1. Add product");
			System.out.println("2. Update stock quantity");
			System.out.println("3. Sort products according to price (high → low)");
			System.out.println("4. Show “Low Stock Products” (quantity < 5)");
			System.out.println("5. Generate bill when a customer buys items");
			System.out.println("6. Exit");
			
			System.out.print("enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.print("enter productId: ");
					int productId = sc.nextInt();
					System.out.print("enter name: ");
					String name = sc.next();
					System.out.print("enter price: ");
					int price = sc.nextInt();
					System.out.print("enter quantity: ");
					int quantity = sc.nextInt();
				
					p[count++] = new Product(productId,name,price,quantity);
					break;
				
				case 2:
					System.out.print("enter product id: ");
					int id = sc.nextInt();
					System.out.print("enter quantity to add: ");
					int qty = sc.nextInt();
					boolean found = false;
					for(int i=0; i<count; i++)
					{
						if(p[i].getPId() == id)
						{
							p[i].AddQuantity(qty);
							found=true;
							System.out.print("Quatity Updated...");
							break;
						}
					}
					if(!found)
						System.out.println("Id Not Found");
						
					break;
						
				case 3:
					for(int i=0; i<count; i++)
					{
						for(int j=i+1; j<count; j++)
						{
							if(p[i].getPrice() < p[j].getPrice())
							{
								Product temp = p[i];
								p[i] = p[j];
								p[j] = temp;
							}
						}
					}
					System.out.println("After Sort");
					for(int i=0; i<count; i++)
					p[i].display();
					break;
					
				case 4:
					System.out.println("Low Stock Products:");
					for(int i=0; i<count; i++)
					{
						if(p[i].getQuantity() < 5)
						{
							p[i].display();
						}
					}
					break;
					
				case 5:
						System.out.print("enter the Product id: ");
						id = sc.nextInt();
						System.out.print("enter the buy Quantity: ");
						int BuyQty = sc.nextInt();
						
						found=false;
						for(int i=0; i<count; i++)
						{
							if(p[i].getPId() == id)
							{
								found=true;
								if(p[i].SellQuantity(BuyQty))
								{
									int bill = BuyQty * p[i].getPrice();
									System.out.println("Total Bill: "+bill);
									break;
								}
								else
								{
									System.out.println("Insufficient Quantity...");
								}
								break;
							}
						}
						
						if(!found)
							System.out.println("Product id does not found");
						break;
				
				case 6:
					System.exit(0);
					
				default:
					System.out.println("Invalid Choice!");
			}
			
			System.out.print("Do you want to continue (y/n): ");
			ch = sc.next().charAt(0);
		
		}while(ch=='Y' || ch=='y');
	}
}