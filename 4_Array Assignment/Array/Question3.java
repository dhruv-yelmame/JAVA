/*Q3. Write a Java program to display even & odd values from an array.
Input:
 Array Size = 6
 Array Elements = 11 20 33 42 55 60
Output:
 Even Values = 20 42 60
 Odd Values = 11 33 55
*/

import java.util.*;
public class Question3
{
	public static void main(String x[])
	{
		int a[], i;
		a = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		for(i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Even values- ");
		for(i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{	
				System.out.print(a[i]+" ");
			}
		}
		
		System.out.println(" ");
		
		System.out.print("Odd values- ");
		for(i=0; i<a.length; i++)
		{
			if(a[i]%2!=0)
			{				
				System.out.print(a[i]+" ");
			}
		}
		
		
		
	}
}