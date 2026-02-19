/*Q6. WAP to create class name Armstrong with two methods 
void setNum(int no): this function can accept number as parameter 
void checkArm(): this function can check number is armstrong or not 
*/

import java.util.*;
class Armstrong
{
	private int n;
	public void setNum(int n)
	{
		this.n=n;
	}
	
	public int checkArm()
	{
		int temp=n;
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		n=temp;
		int sum=0;
		while(n!=0)
		{
			int rem = n%10;
			int p=1;
			for(int i=1; i<=count; i++)
			{
				p=p*rem;
			}
			sum+=p;
			n=n/10;
		}
		return sum;
	}
}

public class Q6
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		Armstrong ar = new Armstrong();
		ar.setNum(n);
		int res = ar.checkArm();
		
		if(res==n)
			System.out.print("Armstrong Number");
		else
			System.out.print("Not Armstrong Number");
	}
}