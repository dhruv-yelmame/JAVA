/*6. Find the Maximum of Three Numbers
Create a class MaxFinder with a method findMax that returns the largest of three numbers.
Explanation: Enhances problem-solving using conditional statements.
*/


class MaxFinder
{
	public int findMax(int a, int b, int c)
	{
		if(a>b && a>c)
			return a;
		else if(b>a && b>c)
			return b;
		else
			return c;
	}
}

public class Q6
{
	public static void main(String x[])
	{
		MaxFinder m = new MaxFinder();
		int res = m.findMax(10,22,7);
		System.out.print("Largest Number: "+res);
	}
}