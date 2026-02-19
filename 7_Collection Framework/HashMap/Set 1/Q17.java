/*17. Count Total Elements in Vector
Problem Statement:
Find total number of elements in Vector.
Input:
[5,10,15,20]
Output:
Size = 4
Explanation:
Use vector.size().
*/

import java.util.*;
public class Q17
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Vector v = new Vector();
		System.out.print("enter element: ");
		for(int i=0; i<4; i++)
		{
			v.add(sc.nextInt());
		}
		
		System.out.print("Size: "+v.size());
	}
}