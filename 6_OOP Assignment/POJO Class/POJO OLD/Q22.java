/*Q22. WAP to create POJO class name as Vehicle with field id, name and price and we have one
more class name as ShowRoom with two methods
void setVehicle(Vehicle vehicle): this method can accept Vehicle as parameter
void showVehicle(): this method can show the vehicle details
*/

import java.util.*;
class Vehicle
{
	private int id;
	private String name;
	private int price;
	
	public void setVehicle(int id,String name,int price)
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

class ShowRoom
{
	private Vehicle vehicle;
	
	public void setVehicle(Vehicle vehicle)
	{
		this.vehicle=vehicle;
	}
	
	public void showVehicle()
	{
		System.out.println("ID\tName\tPrice");
        System.out.println(vehicle.getId() + "\t" + vehicle.getName() + "\t" + vehicle.getPrice());
	}
}

public class Q22
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the id: ");
		int id = sc.nextInt();
		System.out.print("enter the name: ");
		String name = sc.next();
		System.out.print("enter the price: ");
		int price = sc.nextInt();
		
		Vehicle v = new Vehicle();
		v.setVehicle(id,name,price);
		
		ShowRoom sh = new ShowRoom();
		sh.setVehicle(v);
		sh.showVehicle();
		
	}
}
