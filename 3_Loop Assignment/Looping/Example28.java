/*Q28. Write a java program to Check Number Is Spy Number or Not.
Example : A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
*/

import java.util.*;
public class Example28
{
	public static void main(String x[])
	{	
		int n,temp,rem;
		int sum=0,product=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		n = sc.nextInt();//1412
		
		while(n!=0)//1412!=0,141!=0,14!=0,1!=0,0!=0
		{	
			rem=n%10;//1412%10=2,141%10=1,14%10=4,1%10
			sum=sum+rem;//0+2=2,2+1=3,3+4=7,7+1=8
			product=product*rem;//1*2=2,2*1=2,2*4=8,8*1=8
			n=n/10;//1412/10=141,141/10=14,14/10=1,1/10=0
		}
		
		if(sum==product)
		{
			System.out.println("Spy Number");
		}
		else
		{
			System.out.println("Not Spy Number");
		}
	}
}