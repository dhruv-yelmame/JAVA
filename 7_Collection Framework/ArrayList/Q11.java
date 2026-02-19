/*Q1. Write a java program to count how many prime numbers are present in an ArrayList.*/

import java.util.*;
public class Q11
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		
		System.out.print("Enter number: ");
		for(int i=0; i<5; i++)
		{
			al.add(sc.nextInt());
		}
		
		int primeCount=0;
		for(int i=0; i<al.size(); i++)
		{
			int count=0;
			for(int j=1; j<=al.get(i); j++)
			{
				if(al.get(i)%j==0)
					count++;
			}
			
			if(count==2)
				primeCount++;
		}
		
		System.out.print("Prime Count in List: "+primeCount);
	}
}