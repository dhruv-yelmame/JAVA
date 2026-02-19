/*5. Calculate Simple Interest
Create a class SimpleInterest with a method calculate that computes simple interest given principal, rate, and time.
Explanation: Demonstrates mathematical formula implementation.
*/


class SimpleInterest
{
	public void calculate(int principal, int rate, int time)
	{
		int si = (principal*rate*time)/100;
		System.out.print("Simple Interest: "+si);
	}
}

public class Q5
{
	public static void main(String x[])
	{
		SimpleInterest si = new SimpleInterest();
		si.calculate(1000, 25, 1);
	}
}