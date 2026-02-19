/*Q5. Create a class Remainder extending Value and overriding getResult() to return the remainder when x is divided by y.
Create a Compute class that accepts only a Remainder object and displays the result.

Input : Enter numbers: 17 5
Output : Remainder is 2
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

class Remainder extends Value
{
	int getResult()
	{
		return x%y;
	}
}

class Compute
{
	void show(Remainder r)
	{
		int res = r.getResult();
		System.out.print("Remainder is "+res);
	}
}

public class Q15
{
	public static void main(String x[])
	{	
		Compute c = new Compute();
		Remainder r = new Remainder();
		r.setValue(16,4);
		c.show(r);
	}
}