/*Q7. WAP to create class name as Prime with two functions 
void setValue(int no): this function is used for accept number as parameter 
void checkPrime(): this function can check number is prime or not
*/

import java.util.*;
class Prime
{
	private int n;
	public void setValue(int n)
	{
		this.n=n;
	}
	
	public int checkPrime()
	{
		int count=0;
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
				count++;
		}
		return count;
	}
	
}

public class Q7
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		Prime p = new Prime();
		p.setValue(n);
		int res = p.checkPrime();
		
		if(res==2)
			System.out.print("Prime Number");
		else
			System.out.print("Not Prime Number");
	}
}