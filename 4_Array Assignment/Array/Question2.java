/*Q2. Write a Java program to calculate the sum of all elements in an array.
Input:
 Array Size = 5
 Array Elements = 2 4 6 8 10
Output:
 Sum of array elements = 30
*/

import java.util.*;
public class Question2
{
	public static void main(String x[])
	{
		int a[];
		int sum=0;
		a = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the values: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
			sum += a[i];
		}
		System.out.print("Sum = "+sum);
		
	}
}