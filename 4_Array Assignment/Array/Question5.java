/*Q5. Write a Java program to count even & odd values from an array.
Input:
 Array Size = 7
 Array Elements = 12 17 24 39 40 55 70
Output:
 Count of Even Values = 4
 Count of Odd Values = 3
*/

import java.util.*;
public class Question5
{
	public static void main(String x[])
	{
		int a[];
		int e_count=0, o_count=0;
		a = new int[7];
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the values: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			e_count++;
			else
			o_count++;
			
		}
		System.out.println("Count of Even Values = "+e_count);
		System.out.println("Count of Odd Values = "+o_count);
	}
}