/*Q4. Write a Java program to display even & odd index values from an array.
Input:
 Array Size = 6
 Array Elements = 5 10 15 20 25 30
Output:
 Values at Even Index = 5 15 25
 Values at Odd Index = 10 20 30
*/

import java.util.*;
public class Question4
{
	public static void main(String x[])
	{
		int a[];
		a = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Values at Even Index =");
		for(int i=0; i<a.length; i++)
		{
			if(i%2==0)
			System.out.print(a[i]+" ");
		}
		System.out.println();
				
		System.out.print("Values at Odd Index =");
		for(int i=0; i<a.length; i++)
		{
			if(i%2!=0)
			System.out.print(a[i]+" ");
		}
	}
}