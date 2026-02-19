/*Q6. Write a java program to search a given element in Vector.
Input :- Elements: 5 10 15	Search: 10 
Output :- Element found
*/

import java.util.*;
public class Q6
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<>();
		System.out.print("enter element: ");
		for(int i=0; i<4; i++)
		{
			v.add(sc.nextInt());
		}
		
		if(v.contains(10))
		{
			System.out.print("Element found");
		}
		else
		{
			System.out.print("Element not found");
		}
	}
}