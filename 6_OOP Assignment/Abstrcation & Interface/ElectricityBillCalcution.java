/*Q7. Electricity Bill Calculation
Concept: Abstract class + slab logic
Rules:
1. Abstract class ElectricityBill
2. Field: units
3. Abstract method calculateBill()
4. Logic:
	First 100 units → ₹3/unit
	Next 100 units → ₹5/unit
	Above 200 → ₹8/unit
5. Subclasses:
	Domestic
	Commercial (extra ₹500 fixed charge)
*/


abstract class ElectricityBill
{
	protected int units;
	void setUnit(int units)
	{
		this.units=units;
	}
	
	abstract double calculateBill();
}

class Domestic extends ElectricityBill
{
	double calculateBill()
	{
		if(units > 0 && units <= 100)
		{
			return units*3;
		}
		else if(units >= 100 && units <= 200)
		{
			int rem = units-100;
			
			return 100*3 + rem*5;
		}
		else
		{
			int rem = units - 200;
			
			return 100*3 + 100*5 + rem*8;
		}
	}
}

class Commercial extends ElectricityBill
{
	double calculateBill()
	{
		if(units > 0 && units <= 100)
		{
			return units*3 + 500;
		}
		else if(units >= 100 && units <= 200)
		{
			int rem = units-100;
			
			return 100*3 + rem*5 + 500;
		}
		else
		{
			int rem = units - 200;
			
			return 100*3 + 100*5 + rem*8 + 500;
		}

	}
}

public class ElectricityBillCalcution
{
	public static void main(String x[])
	{
		ElectricityBill e = null;
		e = new Domestic();
		e.setUnit(250);
		System.out.println("Domestic Bill: "+e.calculateBill());
		
		e = new Commercial();
		e.setUnit(250);
		System.out.println("Commercial Bill: "+e.calculateBill());
	}
}

