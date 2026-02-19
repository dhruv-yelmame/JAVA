/*Q1. Create a class Compare that extends a base class Value and overrides getResult() to return the greater of the two numbers.
Create another class Check that accepts only a Compare object and displays the result.
Demonstrate tight coupling by passing only Compare object to Check.

Input : Enter numbers: 12 7
Output : Greater number is 12
*/

class Value
{
	int x,y;
	void setValue(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	int getResult()
	{
		return x;
	}
}

class Compare extends Value
{
	int getResult()
	{
		if(x > y)
			return x;
		else
			return y;
	}
}

class Check
{
	void show(Compare c)
	{
		int res = c.getResult();
		System.out.println("Greater number is "+res);
	}
}

public class Q11
{
	public static void main(String x[])
	{
		Check ch = new Check();
		Compare c =  new Compare();
		c.setValue(12,7);
		ch.show(c);	
	}
}