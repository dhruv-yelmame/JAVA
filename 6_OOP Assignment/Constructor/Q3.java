/*Q3. Make a NumberCheck class with one field num, initialized by a constructor.
 Write a method checkEvenOdd() that prints whether the number is Even or Odd.
Concepts Used:
 ✔ Constructor
 ✔ Logical % (modulus) operator
Explanation:
 Use num % 2 == 0 to check even; else odd.
*/

class NumberCheck
{
	private int num;
	NumberCheck(int num)
	{
		this.num=num;
	}
	
	String checkEvenOdd()
	{
		if(num % 2 == 0)
			return "Even";
		else
			return "Odd";
	}
}

public class Q3
{
	public static void main(String x[])
	{
		NumberCheck nc1 = new NumberCheck(12);
		NumberCheck nc2 = new NumberCheck(31);
		
		System.out.println(nc1.checkEvenOdd());
		System.out.println(nc2.checkEvenOdd());
	}
}