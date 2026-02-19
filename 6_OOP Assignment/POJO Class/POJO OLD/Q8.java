/*Q8. WAP to create class name as Duck with two functions 
  void setValue(int no): this function is used for accept number as parameter 
  void checkDuck(): this function is used for check number is duck or not 
*/

import java.util.*;
class Duck
{
	private int n;
	public void setValue(int n)
	{
		this.n=n;
	}
	
	public void checkDuck()
	{
		boolean flag=false;
		while(n!=0)
		{
			int rem = n%10;
			
			if(rem==0)
				flag=true;
				
			n=n/10;
		}
		
		if(flag)
			System.out.print("Duck Number");
		else
			System.out.print("Not Duck Number");
	}
}

public class Q8
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		Duck d = new Duck();
		d.setValue(n);
		d.checkDuck();
		
	}
}