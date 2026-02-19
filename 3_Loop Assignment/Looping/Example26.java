/*Q26. Write a java program to Check Number Is Neon Number or Not.
Example : A neon number is a number where the sum of digits of the square of the number is equal to the number.
*/

import java.util.*;
public class Example26
{
	public static void main(String x[])
	{   
	    int n,temp,sum=0;
		int rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		n = sc.nextInt();//9
		temp=n;
		
		int sq=n*n;//9*9=81
		while(sq!=0)//81!=0,8!=0,0!=0
		{	
			rem = sq%10;//81%10=1,8%10=8
			sum=sum+rem;//0+1=1,1+8=9		
			sq = sq/10;//81/10=8,8/10=0
			
		}
		n=temp;
		if(sum==temp)
		{
		System.out.println("Neon Number");	
		}
		else
		{
		System.out.println("Not Neon Number");	
		}
	}
}