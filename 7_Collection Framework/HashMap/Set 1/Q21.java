/*21. Remove All Elements from ArrayList
Problem Statement:
Clear all elements from ArrayList.
Input:
[1,2,3,4]
Output:
[]
Explanation:
Use clear() method.
*/

import java.util.*;
public class Q21
{
	public static void main(String x[])
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		
		System.out.println("Before Remove: "+al);
		al.clear();
		System.out.println("Afrer Remove: "+al);
	}
}