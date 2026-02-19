/*Q1. Write a Java program to add integer elements to a Vector and display all elements.
Input :- 10 20 30 40			Output :- Vector elements: [10, 20, 30, 40]
*/

import java.util.*;
public class Q1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<>();
		System.out.print("enter elements: ");
		for(int i=0; i<5; i++)
		{
			v.add(sc.nextInt());
		}
		
		
		System.out.print("Vector Element: "+v);
		
	}
}