/*10. Remove Element from Vector
Problem Statement:
Write a program to remove a given element from Vector.
Input:
Vector = [10,20,30,40]
Remove = 30
Output:
Updated Vector = [10,20,40]
Explanation:
Use vector.remove(Integer.valueOf(30)).
*/

import java.util.*;
public class Q10
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Vector v = new Vector();
		System.out.print("enter element: ");
		for(int i=0; i<5; i++)
		{
			v.add(sc.nextInt());
		}
		System.out.print("enter element remove: ");
		int rem = sc.nextInt();
		Iterator i = v.iterator();
		while(i.hasNext())
		{
			if(i.next().equals(rem))
				i.remove();
		}
		System.out.print("After removing: "+v);
	}
}