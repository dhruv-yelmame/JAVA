/*Q3. Create a class SquareSum extending Value and overriding getResult() to return (x + y) * (x + y) (square of sum).
Create a Display class that accepts only a SquareSum object.

Input : Enter values: 3 2
Output : Square of sum is 25
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

class SquareSum extends Value
{
	int getResult()
	{
		return (x + y) * (x + y);
	}
}

class Display
{
	void show(SquareSum ss)
	{
		int res = ss.getResult();
		System.out.println("Square of sum is "+res);
	}
}	

public class  Q13
{
	public static void main(String x[])
	{
		Display d = new Display();
		SquareSum ss = new SquareSum();
		ss.setValue(3,2);
		d.show(ss);
	}
}