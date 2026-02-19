/*Q9. Write a java program to copy elements from one Vector to another.
Input :- Vector1: 5 10 15
Output :- Vector2: [5, 10, 15]
*/

import java.util.*;
public class Q9
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<>();
		System.out.print("enter elements: ");
		for(int i=0; i<4; i++)
		{
			v.add(sc.nextInt());
		}
		
		System.out.println("Vector1: "+v);
		
		Vector<Integer> v2 = (Vector<Integer>) v.clone();
		
		System.out.println("Vector2: "+v);
	}
}