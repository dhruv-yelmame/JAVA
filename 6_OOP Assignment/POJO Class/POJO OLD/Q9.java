/*Q9. WAP to create class name as Fibo with two functions 
void setLimit(int limit): this function is used for set the limit for fibonacci series 
void checkFibo(): this function can print the fibonacci series 
*/

import java.util.*;
class Fibo
{
	private int limit;
	public void setLimit(int limit)
	{
		this.limit=limit;
	}
	public void checkFibo()
	{
		int a = 0;
		int b = 1;
		System.out.print(a+" "+b+" ");
		for(int i=1; i<=limit-2; i++)
		{
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
}

public class Q9
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the limit: ");
		int limit = sc.nextInt();
		
		Fibo f = new Fibo();
		f.setLimit(limit);
		f.checkFibo();
		
	}
}