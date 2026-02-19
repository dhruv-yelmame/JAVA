/*Q5. WAP to create class name as Perfect with two methods 
void setNum(int no): this function can accept number as parameter 
void findPerfect(): this function can check number is perfect or not
*/

import java.util.*;
class Perfect
{
	private int n;
	public void setNum(int n)
	{
		this.n=n;
	}
	
	public int findPerfect()
	{
		int sum=0;
		for(int i=1; i<n; i++)
		{
			if(n%i==0)
			sum+=i;
		}
		return sum;
	}
}

public class Q5
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		Perfect p = new Perfect();
		p.setNum(n);
		int res = p.findPerfect();
		
		if(res==n)
			System.out.print("Perfect Number");
		else
			System.out.print("Not Perfect Number");
	}
}