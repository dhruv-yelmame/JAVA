/*Q33. Write a java program to display 1 to nth Armstrong Number.*/

import java.util.*;
public class Example33
{
	public static void main(String x[])
	{
		int n, temp, rem=0, sum=0, count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			temp = i;
			count = 0;
			int no = temp;
			while(no!=0)
			{			
				count++;
				no=no/10;	
			}
				
				sum=0;
				no = temp;
				while(no!=0)
				{
					rem = no%10;
					int p=1;
					for(int j=1; j<=count; j++)
					{
						p = p*rem;
					}
					sum=sum+p;
					no = no/10;
				}
		
			if(sum==i)
			{
				System.out.println(i);
			}
		}
	}
}