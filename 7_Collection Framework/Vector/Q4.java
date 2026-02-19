/*Q4. Write a java program to remove a specific element from Vector.
Input :- 10 20 30	Remove index: 1	Output :- Vector after removal: [10, 30]
*/

import java.util.*;
public class Q4
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
		System.out.print("enter index: ");
		int index = sc.nextInt();

		v.remove(index);
		
		System.out.print("Vector after removal: "+v);
	}
}