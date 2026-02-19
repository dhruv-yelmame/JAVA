/*Q15. Create a class Vehicle with:
Fields: regNo, vehicleType, emissionLevel, fuelType, lastServiceKm
Constructor: Assign all fields.

Logic Method: needsEmissionTest()
 Return true when ANY condition is true:
emissionLevel > 75
vehicleType = “Diesel” AND emissionLevel > 60
fuelType = “Petrol” AND lastServiceKm > 5000
vehicleType = “Electric” → ALWAYS return false
(extra condition) If emissionLevel between 55–75 AND service > 8000 → return true

Task:
 Create multiple Vehicle objects and test emission status.
Focus: Logical combinations (AND, OR) + constructor initialization + exclusion case.
*/

class Vehicle
{
	private int regNo;
	private String vehicleType;
	private int emissionLevel;
	private String fuelType;
	private int lastServiceKm;
	
	Vehicle(int regNo,String vehicleType,int emissionLevel,String fuelType,int lastServiceKm)
	{
		this.regNo=regNo;
		this.vehicleType=vehicleType;
		this.emissionLevel=emissionLevel;
		this.fuelType=fuelType;
		this.lastServiceKm=lastServiceKm;
	}
	
	boolean needsEmissionTest()
	{
		if(vehicleType.equals("Electric"))
			return false;
		
		if(emissionLevel > 75)
			return true;
		
		if(vehicleType.equals("Diesel") && emissionLevel > 60)
			return true;
		
		if(fuelType.equals("Petrol") && lastServiceKm > 5000)
			return true;
		
		if((emissionLevel>=55 && emissionLevel<=75) && lastServiceKm > 8000)
			return true;
	
		return false;
	}
}

public class Q15
{
	public static void main(String x[])
	{
		Vehicle v1 = new Vehicle(1, "Diesel", 78, "Petrol", 6000);
		Vehicle v2 = new Vehicle(2, "Electric", 48, "Petrol", 4000);
		Vehicle v3 = new Vehicle(3, "Diesel", 98, "Petrol", 7000);
		
		System.out.println("Vehicle 1: "+v1.needsEmissionTest());
		System.out.println("Vehicle 2: "+v2.needsEmissionTest());
		System.out.println("Vehicle 3: "+v3.needsEmissionTest());
	}
}