/*Q8. Write a java program to display only non-zero values from an array.
Input : Array = {1, 0, 5, 0, 7, 0, 9}
Output : Non-zero elements = {1, 5, 7, 9}
*/

import java.util.*;
public class Question13
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		int i;
		System.out.println("enter the values of array: ");
		for(i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Display Non-zero Element: ");
		for(i=0; i<a.length; i++)
		{
			if(a[i]==0)
				continue;
			System.out.print(a[i]+" ");
		}
	}
}