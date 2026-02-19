/*Q1. Write a Java program to input an array & display it.
Input:
 Array Size = 5
 Array Elements = 10 20 30 40 50
 */

import java.util.*;
public class Question1
{
	public static void main(String x[])
	{
	  int a[];
	  a = new int[5];
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the values : ");
	  for(int i=0; i<a.length; i++)
	  {
		a[i]=sc.nextInt();
	  }
	  System.out.println("Display Series");
	  for(int i=0; i<a.length; i++)
	  {
		System.out.print(a[i]+" ");
	  }
	}
}