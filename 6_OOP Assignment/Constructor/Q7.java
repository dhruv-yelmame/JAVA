/*Q7. Create a Car class with:
brand
mileage
Use a constructor to set values.
 Write a method getMileageRating():
mileage < 10 → “Poor”
10 to 15 → “Average”
15 to 20 → “Good”
20 → “Excellent”
Explanation:
 Use nested if-else or else-if ladder inside a class method.
*/


class Car
{
	private String brand;
	private int mileage;
	Car(String brand,int mileage)
	{
		this.brand=brand;
		this.mileage=mileage;
	}
	
	void getMileageRating()
	{
		if(mileage < 10)
			System.out.println(brand+": Poor");
		else if(mileage >= 10 && mileage <=15)
			System.out.println(brand+": Average");
		else if(mileage >= 15 && mileage <=20)
			System.out.println(brand+": Good");
		else
			System.out.println(brand+": Excellent");
		
	}
}

public class Q7
{
	public static void main(String x[])
	{
		Car c1 = new Car("BMW",15);
		Car c2 = new Car("TATA",40);
		Car c3 = new Car("BUGAATI",9);
		
		c1.getMileageRating();
		c2.getMileageRating();
		c3.getMileageRating();
	}
}