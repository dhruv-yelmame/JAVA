/*Q7. Write a java program to remove all elements from Vector.
Input :- 10 20 30		Output:- Vector after clear: [ ]
*/

import java.util.*;
public class Q7
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
		
		v.clear();
		
		System.out.print("Vector after clear: "+v);
	}
}