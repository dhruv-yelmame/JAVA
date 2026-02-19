/*Q8. Write a java program to insert an element at a specific position in Vector.
Input :- 1 2 4		Insert 3 at index 2
Output :- [1, 2, 3, 4]
*/

import java.util.*;
public class Q8
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
		
		v.add(2,3);
		
		System.out.print("New List: "+v);
	}
}