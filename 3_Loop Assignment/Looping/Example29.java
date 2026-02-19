/*Q29. Write a java program to display 1 to nth Prime Number.*/

import java.util.*;
public class Example29
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number: ");
        int n = sc.nextInt();//10
        int count=0;
		
        for(int i=2; i<=n; i++)//i=3
		{	
			for(int j=1; j<=i; j++)
			{
				if(i%j==0)//2%1, 2%2
				{
					count++;//1 2
				}
			}			
			
		if(count==2)
			{
				System.out.println(i);//2, 
				count=0;
			}
			else
			{
				count=0;
			}
		}
	    
			
    }
}
