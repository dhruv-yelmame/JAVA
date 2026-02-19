/*Q2. Create a class Difference that extends Value and overrides getResult() to return the absolute difference between x and y.
Create a Processor class that accepts only Difference object and prints the result.

Input : Enter numbers: 25 10
Output : Difference is 15
*/

class Value
{
	int x,y;
	void setValue(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	int getResult()
	{
		return 0;
	}
}

class Difference extends Value
{
	int getResult()
	{
		if(x > y)
			return x - y;
		else
			return y - x;
	}
}

class Processor
{
	void show(Difference d)
	{
		int res = d.getResult();
		System.out.println("Difference is "+res);
	}
}

public class Q12
{
	public static void main(String x[])
	{
		Processor p = new Processor();
		Difference d = new Difference();
		d.setValue(5,10);
		p.show(d);
	}
}
