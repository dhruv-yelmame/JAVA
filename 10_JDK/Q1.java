/*Q1.Write a Java program that stores integer values in an array and 
prints all elements using a Lambda Expression.
Input:
 Array Elements: 10 20 30 40 50
*/

import java.util.*;
interface P
{
    void show(int a[]);
}
public class Q1
{
	public static void main(String x[])
	{
		int a[] = {10,20,30,40,50};
		P p = (arr) -> {
			for(int i=0; i<a.length; i++)
			{
				System.out.print(a[i]+" ");
			}
		};
		p.show(a);
		
	}
}