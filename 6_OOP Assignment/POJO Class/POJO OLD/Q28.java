/*Q28. WAP to create POJO class name as Product with field id, name and price and create 5
product objects using array of objects and search product using its id 
Means you have to input id from keyboard and search product present in array of object or not
using its id.
*/


import java.util.*;
class Product
{
	private int id;
	private String name;
	private int price;
	
	public void setProduct(int id,String name,int price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getPrice()
	{
		return price;
	}
}


public class Q28
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Product p[] = new Product[5];
			
			p[0] = new Product();
			p[0].setProduct(1,"A1",1000);
			
			p[1] = new Product();
			p[1].setProduct(2,"A2",2000);
			
			p[2] = new Product();
			p[2].setProduct(3,"A3",3000);
			
			p[3] = new Product();
			p[3].setProduct(4,"A4",4000);
			
			p[4] = new Product();
			p[4].setProduct(5,"A5",5000);
		
		
		System.out.println("ID \t Product Name \t Product Price: ");
		for(int i=0; i<p.length; i++)
		{
			System.out.println(p[i].getId()+"\t \t"+p[i].getName()+"\t \t"+p[i].getPrice());
		}
		
		System.out.print("enter the product using id: ");
		int sk = sc.nextInt();
		boolean found=false;
		int index=-1;
		for(int i=0; i<p.length; i++)
		{
			if(sk==p[i].getId())
			{
				found=true;
				index=i;
				break;
			}
		}
		
		if(found)
			System.out.print(p[index].getId()+"\t \t"+p[index].getName()+"\t \t"+p[index].getPrice());
		else
			System.out.print("Does not found");

		
	}
}