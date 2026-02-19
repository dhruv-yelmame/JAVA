/*Q4. Vehicle Rental System
Concepts: Abstract class, logical conditions
 Operations:
1. Abstract class Vehicle
2. Abstract method calculateRent(int days)
3. Subclasses:
	Car → ₹1000/day
	Bike → ₹500/day
4. Calculate total rent
5. Display bill
*/

abstract class Vehicle
{
	protected int days;

	abstract int calculateRent(int days);
	
}

class Car extends Vehicle
{
	int calculateRent(int days)
	{
		return days*1000;
	}
}

class Bike extends Vehicle
{
	int calculateRent(int days)
	{
		return days*500;
	}
}

public class VehicleRentalSystem
{
	public static void main(String x[])
	{
		Vehicle v = null;
		v = new Car();
		System.out.println("Total Rent (Car): "+v.calculateRent(12));
		
		v = new Bike();
		System.out.println("Total Rent (Bike): "+v.calculateRent(12));
	}
}
