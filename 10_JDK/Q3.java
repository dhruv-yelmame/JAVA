/*Q3. Write a Java program that stores integer values in an array and 
prints even and odd numbers using Lambda Expression.
Input:
 Array Elements: 11 24 36 41 55 60
*/

import java.util.*;
interface EO
{
	void show(int a[]);
}
public class Q3
{
	public static void main(String x[])
	{
		int a[] = {11, 24, 36, 41, 55, 60};
		EO e =(arr) ->
		{
			
				System.out.print("Even Number: ");
				for(int i=0; i<arr.length; i++)
				{
					if(a[i]%2==0)
					{
						System.out.print(a[i]+" ");
					}
				}
				System.out.print("\n");
				System.out.print("Odd Number: ");
				for(int i=0; i<arr.length; i++)
				{
					if(a[i]%2==1)
					{
						System.out.print(a[i]+" ");
					}
				}
		};
		e.show(a);
	}
}