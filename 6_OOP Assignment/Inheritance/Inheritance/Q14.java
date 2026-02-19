/*Q4. Create a class Average that extends Value and overrides getResult() to return the integer average of x and y.
Create a class Evaluate that accepts only an Average object and prints the result.

Input : Enter numbers: 20 30
Output : Average is 25
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

class Average extends Value
{
	int getResult()
	{
		int avg = (x + y) / 2;
		return avg;
	}
	
}

class Evaluate
{
	void show(Average a)
	{
		int res = a.getResult();
		System.out.print("Average is "+res);
	}
}

public class Q14
{
	public static void main(String x[])
	{
		Evaluate e = new Evaluate();
		Average a = new Average();
		a.setValue(20,30);
		e.show(a);
	}
}