/*Q3. WAP to create class name as Factorial with two functions 
   void setNum(): this function can accept number as parameter 
   void showFactorial(): this function is used for calculate factorial of number and  display it
*/

import java.util.*;
class Factorial
{
	private int n;
	public void setNum(int n)
	{
		this.n=n;
	}
	
	public int showFactorial()
	{
		int fact=1;
		for(int i=1; i<=n; i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}

public class Q3
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		Factorial f = new Factorial();
		f.setNum(n);
		int res = f.showFactorial();
		System.out.print("Factorial: "+res);
	}
}