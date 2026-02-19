/*Q3. Problem:
Create a POJO class Car with fields: carId, model, fuelConsumed, and distanceTravelled. Store details of 5 cars using an array of objects. 
Perform the following operations:
Calculate the mileage of each car (mileage = distanceTravelled / fuelConsumed).
Find the car with the best mileage.
Display cars whose mileage is above the average mileage of all cars.
Why?
 Here you apply formula-based computation + comparison + filtering, just like the employee salary example, but with a different real-world scenario.
*/


import java.util.*;
class Car
{
	private int id;
	private String model;
	private int fc;
	private int dt;
	
	public void StoreCar(int id,String model,int fc,int dt)
	{
		this.id=id;
		this.model=model;
		this.fc=fc;
		this.dt=dt;
	}
	
	int getId()
	{
		return id;
	}
	String getModel()
	{
		return model;
	}
	int getFc()
	{
		return fc;
	}
	int getDt()
	{
		return dt;
	}
}

class DisplayCar
{
	private Car c[];
	public void setCar(Car c[])
	{
		this.c=c;
	}
	
	void show()
	{
		//operations 1
		float cm[] = new float[c.length];
		System.out.println("-------------------------------");
		System.out.println("display the mileage of each car");
		System.out.println("-------------------------------");
		System.out.println("CarID---CarModel---Mileage");
		for(int i=0; i<c.length; i++)
		{
			float mileage = (float)c[i].getDt() / c[i].getFc();
			cm[i] = mileage; 
			System.out.println(c[i].getId()+"\t"+c[i].getModel()+"\t"+mileage);
			mileage = 0;
		}
		
		
		//operations 2
		System.out.println("----------------------------------");
		System.out.println("show the car with the best mileage");
		System.out.println("----------------------------------");
		System.out.println("CarID---CarModel---BestMileage");
		float max = cm[0];
		int index=0;
		for(int i=0; i<cm.length; i++)
		{
			if(cm[i] > max)
			{
				max = cm[i];
				index=i;
			}
		}
		System.out.println(c[index].getId()+"\t"+c[index].getModel()+"\t"+max);
		
		
		//operations 3
		System.out.println("-----------------------------------------------------------");
		System.out.println("cars whose mileage is above the average mileage of all cars");
		System.out.println("------------------------------------------------------------");
		System.out.println("CarID---CarModel---AvgMileage");
		float totalAvg=0;
		for(int i=0; i<cm.length; i++)
		{
			totalAvg+=cm[i];
		}
		
		float avg = totalAvg/cm.length;
		for(int i=0; i<cm.length; i++)
		{
			if(cm[i] > avg)
			{
				System.out.println(c[i].getId()+"\t"+c[i].getModel()+"\t"+cm[i]);
			}
		}
	}
	
}

public class Q3
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		DisplayCar d = new DisplayCar();
		Car c[] = new Car[5];
		for(int i=0; i<c.length; i++)
		{
			c[i] = new Car();
			System.out.print("enter the car id: ");
			int id = sc.nextInt();
			System.out.print("enter the car model: ");
			String model = sc.next();
			System.out.print("enter the car fuel consumed: ");
			int fc = sc.nextInt();
			System.out.print("enter the car distance travelled: ");
			int dt = sc.nextInt();
			System.out.print("\n");
			c[i].StoreCar(id,model,fc,dt);
		}
		
		d.setCar(c);
		d.show();
	}
}

