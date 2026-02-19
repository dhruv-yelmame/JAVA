/*Q2. Problem Statement:
Write a Java program to implement the concept of inheritance for different types of vehicles.
The program must include four classes:
Vehicle – Superclass
Bus – Subclass of Vehicle
Truck – Subclass of Vehicle
Transport – Driver class containing the main() method


The goal is to demonstrate the concept of inheritance, constructor chaining, method overriding, and object-oriented encapsulation.
Detailed Description:
1. Class: Vehicle (Superclass)
Data Members:
String model – Vehicle model
String registrationNumber – Registration number of the vehicle
double speed – Vehicle speed in kilometers per hour
double fuelCapacity – Fuel tank capacity in liters
double fuelConsumption – Fuel consumption in kilometers per liter


Member Methods:
Parameterized Constructor


Initializes all data members with the given values.


Getters and Setters
Provide get and set methods for each data member.


fuelNeeded(double distance)
Accepts distance (in kilometers) as an argument.
Calculates and returns the amount of fuel required for that distance.


distanceCovered(double time)
Accepts time (in hours) as an argument.
Calculates and returns the distance covered based on the vehicle’s speed.
display()
Displays all details of the vehicle, including model, registration number, speed, fuel capacity, and fuel consumption.
2. Class: Truck (Subclass of Vehicle)
Additional Data Member:
double cargoWeightLimit – Cargo carrying capacity in kilograms.
Member Methods:
Parameterized Constructor
Initializes all data members, including those inherited from the Vehicle class (using super()), and cargoWeightLimit.


Overridden display() Method
Must call super.display() to display the base class details,
 and then display the cargo weight limit specific to the truck.
3. Class: Bus (Subclass of Vehicle)
Additional Data Member:
int numberOfPassengers – Total number of passengers the bus can carry.


Member Methods :
Parameterized Constructor


Initializes all data members, including those from the superclass (using super()).


Getters and Setters
Provide getter and setter methods for numberOfPassengers.


Overridden display() Method


Must call super.display() to display base class details,
 and then display the number of passengers specific to the bus.
4. Class: Transport (Driver Class)
Description:
 This class must contain the main() method to test inheritance and method overriding.
Steps to Perform in main() Method:
Create an object of Truck and initialize all its data members with valid values using the parameterized constructor.


Create an object of Bus and initialize all its data members with valid values using the parameterized constructor.


For both objects:


Call the fuelNeeded() method by passing a sample distance (e.g., 500 km).
Call the distanceCovered() method by passing a sample time (e.g., 5 hours).
Call the display() method to display all details.
Concepts Demonstrated:
Inheritance (Superclass → Subclasses)
Constructor Chaining using super()
Method Overriding (display() method)
Encapsulation (Private data members with getters/setters)
Polymorphism (Different display() methods for Bus and Truck)
*/


class Vehicle 
{
	private String model;
	private String registrationNumber;
	private double speed;
	private double fuelCapacity;
	private double fuelConsumption;
	Vehicle(String model, String registrationNumber, double speed, double fuelCapacity, double fuelConsumption)
	{
		this.model=model;
		this.registrationNumber=registrationNumber;
		this.speed=speed;
		this.fuelCapacity=fuelCapacity;
		this.fuelConsumption=fuelConsumption;
	}
	
	String getModel()
	{
		return model;
	}
	String getRN()
	{
		return registrationNumber;
	}
	double getSpeed()
	{
		return speed;
	}
	double getFC()
	{
		return fuelCapacity;
	}
	double getFconsumed()
	{
		return fuelConsumption;
	}
	
	
	double fuelNeeded(double distance)
	{	
		return distance/fuelConsumption;
	}
	
	double distanceCovered(double time)
	{
		return speed*time;
	}
	
	void display()
	{
		System.out.println("Model: " + model);
        System.out.println("Reg No: " + registrationNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Fuel Capacity: " + fuelCapacity);
        System.out.println("Fuel Consumption: " + fuelConsumption);
	}
}

class Bus extends Vehicle
{
	private int numberOfPassengers;
	Bus(String model, String registrationNumber, double speed, double fuelCapacity, double fuelConsumption, int numberOfPassengers)
	{
		super(model,registrationNumber,speed,fuelCapacity,fuelConsumption);
		this.numberOfPassengers = numberOfPassengers;
	}
	
	void display()
	{
		super.display();
		System.out.println("Number of Passengers: " + numberOfPassengers);
	}
	
}

class Truck extends Vehicle
{
	private double cargoWeightLimit;
	Truck(String model, String registrationNumber, double speed, double fuelCapacity, double fuelConsumption, double cargoWeightLimit)
	{
		super(model,registrationNumber,speed,fuelCapacity,fuelConsumption);
		this.cargoWeightLimit = cargoWeightLimit;
	}
	
	
	void display()
	{
		super.display();
		System.out.println("Cargo Weight Limit: " + cargoWeightLimit + " kg");
	}
	
}

public class Transport 
{
	public static void main(String x[])
	{
		Vehicle bus = new Bus("Volvo", "MH17", 80, 150, 6, 50);
		Vehicle truck = new Truck("TATA", "MH15", 60, 200, 5, 15000);
		
		System.out.println("----- Bus -----");
        System.out.println("Fuel Needed: " + bus.fuelNeeded(500));
        System.out.println("Distance Covered: " + bus.distanceCovered(5));
        bus.display();
		
		System.out.println();
		
		System.out.println("----- Truck -----");
        System.out.println("Fuel Needed: " + truck.fuelNeeded(500));
        System.out.println("Distance Covered: " + truck.distanceCovered(5));
        truck.display();
		
	}
}